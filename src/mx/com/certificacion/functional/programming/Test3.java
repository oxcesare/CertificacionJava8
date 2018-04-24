/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.functional.programming;

import java.util.stream.*;
import java.util.function.*;

/**
 *
 * @author consultor006
 */
public class Test3 {
    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.length()>3;
        Stream<String> stream = Stream.iterate("-",(s)->s+s);
        boolean b1 = stream.noneMatch(predicate);
        boolean b2 = stream.anyMatch(predicate);
        System.out.println(b1+"  "+b2);    
    }
}
