/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.lambdas;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

/**
 *
 * @author consultor006
 *
 * Clase donde se muestran ejemplos de operaciones terminales aplicadas a el API
 * Stream
 */
public class OperacionesTerminales {

    /**
     * Operacion Terminal ForEach
     */
    public void terminal_operation_foreach() {

        Stream.of("Hello", "World").forEach(p -> System.out.println(p));

    }

    /**
     * Operacion terminal reduce Transforma un Stream en un primitivo Y tambien
     * hay para long, double e int.
     */
    public void terminal_operation_reduce() {

        int sum = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b);

    }

    /**
     * Para convertir Stream a ToArray
     */
    public void terminal_operation_toArray() {

        Object[] objects = Stream.of(1, 2).toArray();
    }

    /**
     * Operacion terminal Collect para pasar un Stream a una colecction
     */
    public void terminal_operation_collect() {

        Set<String> stringSet = Stream.of("some", "one", "some", "one")
                .collect(Collectors.toSet());
    }

    /**
     * Operacion Terminal findAny
     */
    public void terminal_operation_findany() {

        Optional<String> val = Stream.of("one", "two").findAny();
        System.out.println("val"+" " + val.get());

    }

    public static void main(String[] args) {
        OperacionesTerminales t = new OperacionesTerminales();
        t.terminal_operation_foreach();
        t.terminal_operation_findany();
    }

}
