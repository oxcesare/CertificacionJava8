/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hackerRank.java;

import java.util.Scanner;

/**
 *
 * @author consultor006
 */
public class SolutionFormating {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nm = scanner.nextLine().split(" ");

        String n = nm[0].trim();

        if (n.length() > 10) {
            scanner.close();
        }

        int m = Integer.parseInt(nm[1].trim());

        System.out.println("Recibiendo String" + " " + n);

        System.out.println("Recibiendo Integer" + " " + m);

    }

    public static String rellenaCeros(int total, int longitud) {
        int n = total;
        String g = String.valueOf(n);
        int t = longitud;
        int d = t - g.length();
        String contador = "0";
        if (g.length() < t) {
            for (int i = 0; i < d; i++) {
                contador += "0";
            }
        }
        return contador + String.valueOf(total);
    }

    public static String rellenaCeros(long total, int longitud) {
        long n = total;
        String g = String.valueOf(n);
        int t = longitud;
        int d = t - g.length();
        String contador = "0";
        if (g.length() < t) {
            for (int i = 0; i < d; i++) {
                contador += "0";
            }
        }
        return contador + String.valueOf(total);
    }

}
