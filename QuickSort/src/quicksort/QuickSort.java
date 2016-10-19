package quicksort;

import java.util.Random;

public class QuickSort {

    static long comparaciones, intercambios, hubointercambios;
    final static int limite = 1000;
    static int datos[] = new int[limite];

    public static void main(String[] args) {

        Random ran = new Random();
        for (int i = 0; i < limite; i++) {
            datos[i] = ran.nextInt(1000);
        }

        comparaciones = 0;
        intercambios = 1;

        long time_start, time_end;
        time_start = System.currentTimeMillis();

        quicksort(0, limite - 1);

        time_end = System.currentTimeMillis();

        int contador = 0;
        for (int i = 0; i < limite; i++) {
            if (contador == 20) {
                System.out.print("\n");
                contador = 0;
            }

            System.out.print("\t" + datos[i]);
            contador++;
        }

        System.out.println("\n\nLa tarea se completo en aproximandamente: " + ((time_end - time_start)) + " miliegundos");
        System.out.println("Habia " + limite + " Datos");
        System.out.println("Se realizaron " + comparaciones + " comparaciones");
        System.out.println("Se realizaron " + intercambios + " intercambios");
    }

    public static void quicksort(int limiteizq, int limiteder) {
        int izq = limiteizq;
        int der = limiteder;

        if (izq < der) {
            int DERECHA = 0, IZQUIERDA = 1, UBICACION = IZQUIERDA;

            int aux;

            while (izq < der) {
                comparaciones++;

                if (UBICACION == IZQUIERDA) {
                    if (datos[izq] > datos[der]) {
                        intercambios++;
                        aux = datos[izq];
                        datos[izq] = datos[der];
                        datos[der] = aux;

                        izq++;

                        UBICACION = DERECHA;

                    } else {
                        der--;
                    }
                } else {
                    if (datos[izq] > datos[der]) {
                        intercambios++;
                        aux = datos[izq];
                        datos[izq] = datos[der];
                        datos[der] = aux;
                        der--;
                        UBICACION = IZQUIERDA;
                    } else {
                        izq++;
                    }
                }

            }

            quicksort(limiteizq, izq - 1);
            quicksort(izq + 1, limiteder);

        }
    }

}
