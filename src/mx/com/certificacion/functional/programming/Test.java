/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.functional.programming;

import java.util.stream.*;

/**
 *
 * @author consultor006
 */
public class Test {
    
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", (s)->s+"1");
        System.out.println(stream.limit(2).map(x -> x+"2"));
    }
}
