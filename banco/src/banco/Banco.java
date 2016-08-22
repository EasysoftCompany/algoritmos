/*
 500
 200
 100
 50
 20
 10
 5
 2
 1
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author PC-
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            System.out.println("*****************************************");
            System.out.println("\t Calculador de Billetes y monedas");
            System.out.println("*****************************************");
            
            
            System.out.println("\n\n Que cantidad desea calcular?: \t");
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[9];
        int[] value = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        int eval = scan.nextInt();

        for (int x = 0; x < value.length; x++) {
                valores[x] = (int) eval/value[x];
                eval = eval - (valores[x]*value[x]);        
        }
        
        for (int x=0; x<value.length;x++)
        {
            System.out.println(value[x] + " = " +valores[x]);
        }


    }

}
