/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.stream.*;

/**
 *
 * @author cesaralducinruiz
 * 
 * El metodo map de stream recibe como parametro un function es
 * decir una operacion
 * 
 * El metodo mapToInt recibe un ToDoubleFunction<? super T> mapper
 *
 */
public class Test2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("base", "ball");
        stream.map(s -> s.length()).forEach(System.out::print);
        //stream.mapToInt(s -> s.length()).forEach(System.out::print);
        
        
        
    }
   
}
