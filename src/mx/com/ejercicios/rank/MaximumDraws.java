/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.rank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cesaralducinruiz
 */
public class MaximumDraws {

    /*
     * Complete the maximumDraws function below.
     */
    static int maximumDraws(int n) {
        /*
         * Write your code here.
         */
        
        int par = n+1;

        return par;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = maximumDraws(n);

            //  bufferedWriter.write(String.valueOf(result));
            // bufferedWriter.newLine();
            System.out.println("result"+result);
        }      

        //bufferedWriter.close();
    }
}
