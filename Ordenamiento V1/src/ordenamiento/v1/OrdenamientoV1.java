/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento.v1;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author g_ric
 */
public class OrdenamientoV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa ordenara 8 numeros proporcionados por el usuario");
        java.util.ArrayList array = new java.util.ArrayList();

        for (int i = 0; i < 8;) {
            System.out.print("\n Ingrese el dato " + (i + 1) + " de 8 >> ");//el (i+1) me da la op`cion de llevar un contador hasta el numero 4 
            try {
                array.add(scan.nextDouble());//almacena el dato y lo pasa enseguida sin guardar ni validar y pasarlo facilmente 
                i++;//esta parte nos dice que la cantidad que no sea valida no la toma y hasta que pongas una opcion valida sigue el programa
            } catch (Exception e) {
                scan = new Scanner(System.in);//por que no jalaba la chingadera

                System.err.println("Error, Ingrese un dato valido! (" + e.toString() + ")");//e.toString -->manda mensaje de error
                System.err.println("Recuerde que los datos pueden ser enteros o decimales");
            }
        }

        array.sort(Comparator.naturalOrder());//ordenar
        System.out.println("DATOS ORDENADOS DE MENOR A MAYOR: " + array.toString());
    }

}
