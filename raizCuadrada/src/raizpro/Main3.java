/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raizpro;

/**
 *
 * @author PC-
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Raiz cuadrada");

        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("\n\n dame un numero: ");

        double x = scan.nextDouble();

        double b = x;

        double pre = x / b;

        do {
            
            pre = Math.floor(x/b * 100) / 100;
            b = Math.floor(0.5 * ((x / b) + b) * 100) / 100;
        } while (b != pre);

        System.out.println("Su raiz es: " + b);
    }

}
