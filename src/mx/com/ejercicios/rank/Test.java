/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.rank;

/**
 *
 * @author cesaralducinruiz
 */
public class Test {

    public static void main(String[] args) {
        int a = 0;
        int n = 5;
        
        
        System.out.println("esPrimo(n);"+ " "+esPrimo(n));
    }

    static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
