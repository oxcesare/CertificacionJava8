/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author consultor006
 */
public class BetweenTwoSets {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */

        //Arreglo que almacena los divisibles entre cero 
        int[] dUno = new int[a.length];
        int[] dDos = new int[b.length+1];
        boolean divi = false;
        boolean diviB = false;

        /**
         * Primero sacar el numero que entre el mismo sea divisble y sera 0
         */
        int aux = 0;
        int aux2 = 0;

        int bux = 0;
        int bux2 = 0;

        for (int i = 0; i < a.length; i++) {
            aux2 = a[i];
            for (int j = 0; j < a.length; j++) {
                if (aux2 % a[j] == 0) {
                    divi = true;
                } else {
                    divi = false;
                    break;
                }
            }
            if (divi) {
                dUno[i] = aux2;
            } else {
            }

            /**
             * Ya que tengo los elementos que son divisibles entre ellos mismos
             * y los elementos del conjunto A, ahora hay que buscar dentro del
             * conjunto B y contar los que sean
             */
            for (int c = 0; c < dUno.length; c++) {
                if (dUno[c] > 0) {
                    System.out.println("Valores que salen del Subconjunto A" + " " + dUno[c]);
                }
            }

            System.out.println("Longitud de dUno [c]" + dUno.length);

        }

        System.out.println("Longitud del arreglo b " + " " + b.length);

        int contador=0;
        for (int t = 0; t < dUno.length; t++) {
            if (dUno[t] > 0) {
                bux2 = dUno[t];
                for (int i : b) {
                    System.out.println("Primer elemento" + "" + i);
                    if (i % bux2 == 0) {
                        diviB = true;
                        contador++;
                    } else {
                        diviB = false;
                        break;
                    }
                }
                if (diviB) {
                    dDos[t] = bux2;                    
                } else {
                }
            }
        }

        /**
         * Imprimo el numero de elementos entre los que son divibles
         */
        
        /**
         * Imprimo los elementos
         */
        for (int cc = 0; cc < dDos.length; cc++) {
            if (dDos[cc] != 0) {
                System.out.println("Valores entre los que son divisibles"
                        + " " + dDos[cc] + " Contador " + contador );
            }
        }
        return 1;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        //bw.write(String.valueOf(total));
        //bw.newLine();
        //bw.close();
    }
}
