/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cuatro.Stream;

import java.util.Arrays;
import java.util.stream.*;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class Test5 {

    public static void main(String[] args) {
        ejemploStream();
        muestraLog();
    }

    public static void ejemploStream() {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream().filter(n -> n.length() == 5).sorted().limit(1).forEach(System.out::println);
    }

    /**
     * Uso del método Peek
     */
    public static void muestraLog() {
        //Declaras un Stream 
        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5).peek(System.out::println).filter(x -> x % 2 == 1).forEach(System.out::println);

    }
}
