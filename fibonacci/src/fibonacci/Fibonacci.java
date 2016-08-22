/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author PC-
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long origen = 1;
        long pre = 1;
        long post = 1;
        int posicion;
        System.out.println("\t*********************************************************************");
        System.out.println("\t\t\tCalculador de la serie Fibonacci");
        System.out.println("\t*********************************************************************");
        System.out.print("\n\n\tHasta que posicion de la serie fibbonaci debo calcular?: \t");

        posicion = scan.nextInt();
        System.out.println("\n\tLa serie Fibonacci generada hasta la posicion " + posicion + " es: ");
        if (posicion == 1) {
            System.out.print("\n\t\t0");
        } else {
            if (posicion == 2) {
                System.out.print("\n\t\t0,1");

            } else {
                System.out.print("\n\t\t0,1");
                for (int i = 3; i <= posicion; i++) {
                    System.out.print("," + post);
                    post = origen + pre;
                    pre = origen;
                    origen = post;
                }

            }
        }

        System.out.println("\n\n\n\tHasta Pronto!");

    }

}
