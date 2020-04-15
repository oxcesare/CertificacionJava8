/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

/**
 *
 * @author cesaralducinruiz
 * 
 * how to find distinct element count in collections and arrays
 */
public class Test {
    public static void main(String[] args) {
        
          //Sin usar Java 8
         Integer[] intArray = {1, 4, 3, 2, 6, 4, 3, 2, 1};
         //Al crear un HashSet este no permite duplicados (distinct) 
         long distinctCount2 = new HashSet<>(Arrays.asList(intArray)).size();
         System.out.println("distinctCount1"+distinctCount2);
         
         //Usando Java 8 
         distinctCount2 = Arrays.stream(intArray).distinct().count();
         System.out.println("distinctCount2"+distinctCount2);
         
         
         //Array of primitives using java 8 stream
         int[] intArray2 = {1, 4, 3, 2, 6, 4, 3, 2, 1};
         long distinctCount3 = IntStream.of(intArray2).distinct().count();
         System.out.println("distinctCount2"+distinctCount3);
      
      
         
    }
   
}
