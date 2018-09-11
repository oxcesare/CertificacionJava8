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
public class Cadenas {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(String.valueOf(result));

        scanner.close();
    }

    static long repeatedString(String t, long n) {
        String c = "";
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String aux = "";
        long countA = 0;

        //Creo un arreglo con la capacidad de la cadena de entada
        String[] arr = new String[safeLongToInt(n)];

        for (int i = 1; i <= n; i++) {
            if (c.length() > n - t.length()) {
                c = c.concat(String.valueOf(t.charAt(0)));
                break;
            } else {
                c = c.concat(t);
            }
        }

        /**
         * Formo el arreglo con las letras a y las contabilizo
         */
        for (int i = 0; i < c.length(); i++) {
            if (String.valueOf(c.charAt(i)).equals("a")) {
                countA++;
            }
        }
        return countA;
    }

    public static int safeLongToInt(long l) {
        if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(l + " cannot be cast to int without changing its value.");
        }
        return (int) l;
    }

}
