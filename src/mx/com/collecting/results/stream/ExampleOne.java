/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.collecting.results.stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author cesaralducinruiz
 *
 * Map es una operación intermedia que permite crear un map de los elementos de
 * un stream y aplicarles una operacion
 *
 * public <R> Stream<R> map(Function<? super T,? extends R> mapper)
 *
 *
 */
public class ExampleOne {

    public void a() {
        List<String> myList
                = Arrays.asList("a1", "b2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c")).filter(d -> d.startsWith("a"))
                .map(String::toUpperCase)
                //.sorted()
                .forEach(System.out::println);

        Arrays.asList("aa1", "aa2", "aa3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);  // a1

    }

}
