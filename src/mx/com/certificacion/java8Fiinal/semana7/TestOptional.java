/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana7;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 */
public class TestOptional {
    
    public static void main(String[] args) {
        Optional<Integer> optional = Stream.of(1,2,3).findFirst();
        System.out.println("optional"+" "+optional.orElse(null));
    }
    
    
    public void mensaje () throws Exception, Throwable {
        try {
            
        } catch (Exception e) {
            throw e.getCause();
        }
    }
    
}
