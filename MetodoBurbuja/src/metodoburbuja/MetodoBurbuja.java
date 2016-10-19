/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoburbuja;

import java.util.Random;

/**
 *
 * @author PC-
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    final static int limite = 1000;
    static int comparaciones = 1000;
    static int intercambios = 1000;

    public static void main(String[] args) {

        int datos[] = new int[limite];
        Random ran = new Random();

        //llenamos el arreglo a lo bestia!
        for (int i = 0; i < limite; i++) {
            datos[i] = ran.nextInt(1000);
        }

        burbuja(datos);
        
          int contador = 0;
        for(int i = 0; i<limite;i++)
        {
            if(contador == 20){
                System.out.print("\n");
                contador = 0;
            }
            
            System.out.print("\t"+datos[i]);
            contador ++;
        }    
        
        System.out.println("\n\nHabia "+ limite + " Datos");
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
