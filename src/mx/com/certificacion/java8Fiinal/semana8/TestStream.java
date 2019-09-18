/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana8;

import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 */
public class TestStream {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("A", "B", "C");

        String text = stream.parallel().reduce(String::concat).get();

        System.out.println("text" + " " + text);

    }

}
