/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresdehanoi;

import java.util.Scanner;

/**
 *
 * @author PC-
 */
public class TorresDeHanoi {

    static int cont = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int cuenta = 0;
        System.out.println("Numero de discos: ");

        n = sc.nextInt();

        long time_start, time_end;
        time_start = System.currentTimeMillis();
        TorresDeHanoi(n, 1, 2, 3, cuenta);  //1:origen  2:auxiliar 3:destino
        time_end = System.currentTimeMillis();
        System.out.println("La tarea se completo en aproximandamente: " + ((time_end - time_start)) + " miliegundos");

        contar(n);
    }

//Método Torres de Hanoi Recursivo
    public static void contar(int n) {
        //Segundo contador de movimientos
        int c = 0;
        c = (int) Math.pow(2, n);
        c = c - 1;
        System.out.println(cont - 1 + " - " + "Cantidad de movimientos - " + c);
    }

    public static void TorresDeHanoi(int n, int origen, int auxiliar, int destino, int cuenta) {

        if (n == 1) {
            System.out.println("mover disco de " + origen + " a " + destino);
        } else {

            TorresDeHanoi(n - 1, origen, destino, auxiliar, cuenta);

            System.out.println("mover disco de " + origen + " a " + destino);

            TorresDeHanoi(n - 1, auxiliar, origen, destino, cuenta);

        }
        cont++;

    }

}
