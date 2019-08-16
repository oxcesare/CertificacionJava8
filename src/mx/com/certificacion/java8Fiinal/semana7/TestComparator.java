/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana7;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 */
public class TestComparator {

    public static void main(String[] args) {
        Comparator<Integer> comp = (i1, i2) -> i2.compareTo(i1);
        Stream<Integer> stream = Stream
                .of(55, 23, -9, 8, 42);
       
        stream.sorted(comp.reversed())
                .forEach(i -> System.out.print(i + " "));
    }

}
