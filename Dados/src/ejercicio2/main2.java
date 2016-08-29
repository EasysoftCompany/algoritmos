/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author PC-
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Raiz cuadrada");

        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("\n\n dame un numero: ");

        double numero = scan.nextDouble();

        System.out.print("Su raiz Cuadrada es: " + java.lang.Math.pow(10, (0.5 * java.lang.Math.log(numero))));
    }

    }
