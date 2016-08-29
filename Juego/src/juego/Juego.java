
package juego;

import java.util.Random;
import java.util.Scanner;


public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcion_usuario = 0;

        try {
            boolean denuevo = false;
            do {
                System.out.println("********************************************************");
                System.out.println("\t\t Apuestas de Feria");
                System.out.println("\n\t Bienvenido, para comenzar seleccione una opcion: ");
                System.out.println("\t\t 1) Jugar");
                System.out.println("\t\t 2) Reglas");
                System.out.println("\t\t 3) Salir");
                System.out.println("********************************************************");
                System.out.print("\n\t\t Su eleccion? >>");

                opcion_usuario = scan.nextInt();

                switch (opcion_usuario) {
                    case 1:
                        jugar();
                        denuevo = juegaDeNuevo();
                        break;

                    case 2:
                        showReglas();
                        denuevo = juegaDeNuevo();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        denuevo = true;
                        System.err.println("Opcion Invalida!");

                        break;

                }
            } while (denuevo);

        } catch (Exception e) {
            System.err.println("La opcion no es un Numero, Adios!");
        }

    }

    private static void jugar() {
        int monedas_usuario = 5;
        

        System.out.println("***********************");
        System.out.println(" APUESTAS DE FERIA");
        System.out.println("***********************");

        do{
        Random ran = new Random();
        int dado1 = 1 + ran.nextInt(6);
        int dado2 = 1 + ran.nextInt(6);
        System.out.println("Fichas Actuales: " + monedas_usuario);

        System.out.print("\nA que numero apuesta? >> ");
        Scanner scan = new Scanner(System.in);
        try {
            int apuesta = scan.nextInt();
            int sumadados = dado1+dado2;
            System.out.println("\n\n Dado 1: " + dado1 + "\t Dado 2: " + dado2 + "\t Suma de los dados: " + sumadados);
            System.out.println("\n\n Su apuesta >> " + apuesta);

            if (apuesta >= 2 && apuesta < 7 && sumadados == apuesta) {
                System.out.println("Felicidades, Haz ganado 1 Ficha!");
                monedas_usuario++;
            } else {
                if (apuesta == 7 && sumadados == apuesta) {
                    System.out.println("WOW! Felicidades, Haz ganado 4 Fichas!");
                    monedas_usuario += 4;
                } else {
                    if (apuesta > 7 && apuesta <= 12 && sumadados == apuesta) {
                        System.out.println("Felicidades, Haz ganado 1 Ficha!");
                        monedas_usuario++;
                    } else {
                        System.out.println("Lo siento, no haz acertado, pierdes 1 ficha...");
                        monedas_usuario --;
                    }
                }
            }
        } catch (Exception e) {

            System.err.println("La opcion Seleccionada no es un Numero!!");
        }}while(monedas_usuario > 0 && monedas_usuario < 10);
        
        if(monedas_usuario == 0)
        {
            System.out.println("\n Se ha acabado el juego, te haz termindao tus fichas... Gracias por jugar");
        }
        
        if (monedas_usuario == 10) {
            System.out.println("\n Se ha acabado el juego, has ganado 10 fichas, felicidades y gracias por jugar!");
            
        }
        
    }

    private static void showReglas() {

        System.out.println("\n\n\n\n*********************************");
        System.out.println("   REGLAS DEL JUEGO");
        System.out.println("*********************************");

        System.out.println("\n\n1) El jugador inciara con 5 fichas las culaes puede apostar a cierto numero");
        System.out.println("2) Se tiraran 2 dados virtuales y el jugador podra apostar a 3 opciones");
        System.out.println("\t a) Apostar a un numero menor que 7 y mayor a 2");
        System.out.println("\t b) Apostar al numero 7");
        System.out.println("\t c) Apostar a un numero mayor a 7 y menor a 12");
        System.out.println("\t\t d) * Como excepcion si apuestas a un numero mayor a 12 o menor a 2 (Que es imposible que salga) pierdas automaticamente una ficha");
        System.out.println("3) Si el jugador acierta a su apuesta se le dara de premio 1 ficha y se le regresara su apuesta"
                + "\n caso contrario la casa se queda con su ficha, existe el caso especial en el que el jugador apostando al 7 y acertando"
                + "\n se hace acreedor a 4 fichas y su apuesta");
        System.out.println("4) El juego termina cuando el jugador se quede sin fichas o llegue a juntar 10 fichas");
    }

    private static boolean juegaDeNuevo() {
        boolean option = false;

        Scanner scan = new Scanner(System.in);

        System.out.print("\n\t 1) Menu Principal \n\t 2) Salir \n\t Su eleccion >> ");

        try {
            if (scan.nextInt() == 1) {
                option = true;
            }
        } catch (Exception e) {
            System.err.println("La opcion no es un Numero, Adios!");
        }

        return option;
    }
}
