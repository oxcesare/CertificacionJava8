/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.*;

/**
 *
 * @author consultor006
 *
 * Java como tal incorpora una manera de iterar una lista:
 *
 * forEach(Consumer<? super T> action) in java.lang.Iterable
 *
 * Un Stream tambien tiene su propia manera de iterar
 *
 * java.util.Stream interface also contains the same void
 * forEach(Consumer<? super T> action) Esta forma de iterar es una operacion
 * terminal
 *
 */
public class Test2 {

    public static void main(String[] args) {
        List<StringBuilder> messages = Arrays.asList(new StringBuilder(), new StringBuilder());
        messages.stream().forEach(s -> s.append("helloworld"));
        messages.forEach(s -> {
            s.insert(5, ",");
            System.out.println(s);
        });
    }
}
