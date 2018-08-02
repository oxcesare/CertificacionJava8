/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.stream.api.uno;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {
        IntStream is1 = IntStream.range(1, 3);
        IntStream is2 = IntStream.rangeClosed(1, 3);
        IntStream is3 = IntStream.concat(is1, is2);
        
        /**
         * 
         */
        Object val = is3.boxed().collect(Collectors.groupingBy(k -> k)).get(2);
        System.out.println(val);
    }
}