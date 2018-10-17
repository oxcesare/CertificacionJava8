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
 *
 * Clase que resuelve el ejercicio Java Subarray
 *
 * De HackerRank
 */
public class SubString {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Solicitar el numero de elementos 
        int n = Integer.parseInt(scanner.nextLine().trim());

        //creo un arreglo con el número de elementos 
        int[] array = new int[n];

        /**
         * Lleno el arreglo
         */
        for (int i = 0; i < n; i++) {
            int gradesItem = Integer.parseInt(scanner.nextLine().trim());

            array[i] = gradesItem;
        }
        for (int grade : array) {
            System.out.println("Elementos" + " " + grade);
        }

        System.out.println("[3][3]"+" " + array[3]);
        System.out.println("[3][3]"+" " + array[3]);
        scanner.close();
    }

}
