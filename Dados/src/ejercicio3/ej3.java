/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author g_ric
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Raiz cuadrada OK");

//        java.util.Scanner scan = new java.util.Scanner(System.in);
//
//        System.out.print("\n\n dame un numero: ");
        double x = 95;

        double b = x;

        double pre = x / b;
        
        int contador = 0;

        while (b != pre) {
            contador ++;
            
       
            
            pre = x / b;
            b = 0.5 * ((x / b) + b);
        }

        System.out.println("Su raiz es: " + b + " Se realizo en " + contador +" intentos");
    }

}
