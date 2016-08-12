/*
 *
 * Realizar un programa que simule la tirada al Azar de 2 dados y mostrar la suma de ambos
 *
 */
package dados;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gerardo Rico
 * @author Rodrigo Mejia
 * @version 1.0
 */
public class Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("*********************************************");
        System.out.println("*         Simulador de Dados                *");
        System.out.println("*              2CM31                        *");
        System.out.println("*********************************************");

        System.out.println("\n\n Simulare la tirada de 2 dados al mismo tiempo, cuando estes listo presiona una tecla \n");

        Scanner in = new Scanner(System.in);
        in.nextLine();

        Random ran = new Random();
        int dado1 = 1 + ran.nextInt(6);
        int dado2 = 1 + ran.nextInt(6);

        switch (dado1) {
            case 1:
                num1();
                break;
            case 2:
                num2();
                break;
            case 3:
                num3();
                break;
            case 4:
                num4();
                break;
            case 5:
                num5();
                break;
            case 6:
                num6();
                break;
        }

        switch (dado2) {
            case 1:
                num1();
                break;
            case 2:
                num2();
                break;
            case 3:
                num3();
                break;
            case 4:
                num4();
                break;
            case 5:
                num5();
                break;
            case 6:
                num6();
                break;
        }

        System.out.println("\n\n Se ve que tienes suerte... la suma de los dados es: " + (dado1 + dado2));
        System.out.println("\n Bien, eso es todo... Hasta luego :D");
    }

    static void num1() {
        System.out.print("\t 1");
    }

    static void num2() {
        System.out.print("\t 2");
    }

    static void num3() {
        System.out.print("\t 3");
    }

    static void num4() {
        System.out.print("\t 4");
    }

    static void num5() {
        System.out.print("\t 5");
    }

    static void num6() {
        System.out.print("\t 6");
    }

}
