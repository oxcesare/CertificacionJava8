/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.dos;

/**
 *
 * @author consultor006
 * 
 * Arreglos tridimensionales. 
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        int[][] myInt[] = {{{1,2},{3,4}},{{1,2},{3,4,5},{6}},{{7}}};
        
        System.out.println(myInt[0][1][0]); 
        System.out.println(myInt[1][1][2]); 
        System.out.println(myInt[2][0][0]); 
                
    }
}
