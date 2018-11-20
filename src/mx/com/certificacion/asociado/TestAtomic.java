/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.asociado;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 * 
 * De entrada no imprime valores duplicados, 
 * 
 * AtomicInteger es una clase de Java 8 para incrementar valores, 
 * el método incrementAndGet(),incrementa el valor y después lo obtiene.
 * 
 * 
 */
public class TestAtomic {

    public static void main(String[] args) {

        AtomicInteger ai = new AtomicInteger();
        Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();
        stream.filter(e -> {
            ai.incrementAndGet();
            return e.contains("o");
        }).allMatch(x -> x.indexOf("o") > 0);
        System.out.println("AI = " + ai);
        
        
        ExecutorService service = Executors.newFixedThreadPool(2);
    }

}
