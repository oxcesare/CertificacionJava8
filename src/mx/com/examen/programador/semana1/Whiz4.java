/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

import java.util.*;

/**
 *
 * @author cesaralducinruiz
 * 
 * Toma la primera posicion de la lista y la concatena 
 * 
 *   parallelSetAll(double[] array, IntToDoubleFunction generator)
     Set all elements of the specified array, in parallel, 
 *   using the provided generator function to compute each element.
 *  
 * 
 * 
 */
public class Whiz4 {
    
    public static void main(String[] args) {
        String[] list ={"1","2","3"};
        Arrays.parallelSetAll(list, x -> Integer.toString(x)+list[x]);
        System.out.println(list[0]);
    }
    
}
