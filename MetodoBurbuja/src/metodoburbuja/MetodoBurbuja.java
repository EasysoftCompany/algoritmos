package metodoburbuja;

import java.util.Random;

public class MetodoBurbuja {

    final static int limite = 10;
    static long comparaciones = 0;
    static long intercambios = 0;

    public static void main(String[] args) {

        int datos[] = new int[limite];
        Random ran = new Random();

        //llenamos el arreglo a lo bestia!
        for (int i = 0; i < limite; i++) {
            datos[i] = ran.nextInt(1000);
        }

        long time_start, time_end;
        time_start = System.currentTimeMillis();
        burbuja(datos);
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

    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                comparaciones++;
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                    intercambios++;
                }
            }
        }
    }
}
