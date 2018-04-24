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
 * 
 * Ejemplod el uso de interfaces funcionales y almacenamiento de datos en stream
 * 
 * El codigo se queda colgado debido a que se le esta pasando el stream y no hay 
 * algo que lo detenga.
 */
public class Test2 {
    
    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(()-> "growl");
        Stream<String> stream2 = Stream.generate(()-> "growl");
        boolean b1 = stream1.anyMatch(predicate);
        boolean b2 = stream2.allMatch(predicate);
        System.out.println(b1+"  "+b2);                
    }    
}
