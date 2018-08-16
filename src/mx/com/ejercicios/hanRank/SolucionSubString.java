/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author consultor006
 */
public class SolucionSubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String t = "";
        int longCadena = S.length();

        //Recorro la letras y valido si pertenece
        for (int i = 0; i < S.length(); i++) {
            String x = alfabeto(Character.toLowerCase(S.charAt(i)));
            if (x.equals("Si")) {
            } else {
                t = "No ejecutar";
                break;
            }
        }
        if (t.equals("No ejecutar")) {
            System.out.println("No ejecuto el metodo subString");
        } else {
            System.out.println("si ejecuto el metodo subString");
            if (1 <= longCadena && longCadena <= 100) {
                System.out.println(S.substring(start, end));
            }
        }
    }

    public static String alfabeto(char letra) {
        String p = "No Pertenece";
        char[] s;
        s = new char[26];
        for (int i = 0; i < 26; i++) {
            s[i] = (char) ('a' + i);
            if (letra == s[i]) {
                p = "Si";
                break;
            }
        }
        return p;
    }

}
