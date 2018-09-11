/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.util.*; 

/**
 *
 * @author consultor006
 */
public class Help {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }
        scanner.close();
    }

    static void minimumBribes(int[] arr) {
        int x = arr.length;
        for (int i = 0; i < arr.length; i++) {
            
        }
    }

    static int[] ordenados(int[] arr2) {
        int[] ordenado = new int[arr2.length];
        for (int j = 0; j < arr2.length; j++) {
            //System.out.println("j"+ " " +j);
            int newElement = arr2[j];

            int k;

            for (k = j; k > 0 && arr2[k - 1] > 0; k--) {
                arr2[k] = arr2[k - 1];

            }
            arr2[k] = newElement;
        }

        ordenado = arr2;

        return ordenado;
    }
}
