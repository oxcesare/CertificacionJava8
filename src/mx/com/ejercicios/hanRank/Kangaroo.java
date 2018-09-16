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
public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        //Arreglo 1
        int[] arr1 = new int[10000];

        //Arreglo 2 
        int[] arr2 = new int[10000];

        boolean coinciden = false;

        //Relleno el arreglo 1 con x1, v1
        int a = x1 + v1;
        for (int i = x1; i < arr1.length; i += v1) {
            arr1[i] = i;
        }

        for (int i : arr1) {
            if (i != 0) {
            }
        }

        //Relleno el arreglo 2 con x2, v2
        int c = x2 + v2;
        for (int j = x2; j < arr2.length; j += v2) {
            arr2[j] = j;
        }

        for (int j : arr2) {
            if (j != 0) {
            }
        }

        int salto = 0;
        for (int i = 0; i < 10000; i++) {
            if (arr1[i] > 0 & arr2[i] > 0) {
                if (arr1[i] == arr2[i]) {
                    ++salto;
                    if(salto==4){
                        coinciden = true;
                        break;
                    }
                    
                }

            }
        }

        if (coinciden) {
            return "YES";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println("" + result);

        // bufferedWriter.write(result);
        //bufferedWriter.newLine();
        //bufferedWriter.close();
        scanner.close();
    }
}
