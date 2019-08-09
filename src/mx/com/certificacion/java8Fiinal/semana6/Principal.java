/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 *
 * Clase Test para probar la funcionalidad de la operacion intermedia flatMap.
 *
 * @author cesaralducinruiz
 */
public class Principal {

    public static void main(String[] args) {
        
        String[][] data = new String[][]{{"a", "a"}, {"c", "a"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
        
        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);
        
        

    }

}
