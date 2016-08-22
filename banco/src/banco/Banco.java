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

        Scanner scan = new Scanner(System.in);

        int[] valores = new int[9];
        int[] value = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        int eval = scan.nextInt();

        for (int x = 0; x < value.length; x++) {

            int cont = eval % value[x];
            if (cont == 0) {                
                valores[x] = eval/value[x];
                eval = eval - (valores[x]*value[x]);
            }
        }
        
        for (int x=0; x<value.length;x++)
        {
            System.out.println(value[x] + " = " +valores[x]);
        }


    }

}
