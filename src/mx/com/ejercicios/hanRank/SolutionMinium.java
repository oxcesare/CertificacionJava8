/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.io.*;
import java.util.*;

/**
 *
 * @author consultor006
 */
public class SolutionMinium {
    // Complete the minimumSwaps function below.

    static int minimumSwaps(int[] arr) {
        int inter=0;
         //Recorrer el arreglo          
        for (int j = 0; j < arr.length; j++) {
            //System.out.println("j"+ " " +j);
            int newElement = arr[j];

            int k;

            for (k = j; k > 0 && arr[k - 1] > newElement; k--) {
                 // System.out.println("k"+""+k);
                //System.out.println("newElement"+""+newElement);                
                arr[k] = arr[k - 1];
                inter++;
            }
            arr[k] = newElement;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }     
        
        return inter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //Para rellenar el arreglo
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem; //Se va llegando el arreglo
        }
        
        int res = minimumSwaps(arr);
        System.out.println("Número de intercambios"+" " +res);

        //bufferedWriter.write(String.valueOf(res));
        //bufferedWriter.newLine();
        //bufferedWriter.close();
        scanner.close();
    }

}
