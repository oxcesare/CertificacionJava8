/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.Arrays;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase se tiene 3 enteros al aplicar el metodo map
 * recordar que regresa lo que se este aplicando al metodo 
 */
public class Test9 {

    public static void main(String[] args) {
        Arrays.stream(new int[]{1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);
        
        
    }
}
