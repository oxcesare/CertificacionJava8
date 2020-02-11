/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;


import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 * 
 * Ejemplo del metodo of de Stream 
 * 
 * Segun yo el errror es porque peek es un operacion terminal 
 * y allMAtch es una no terminal o intermedia y por lo tanto el orden
 * hace que mande un error de compilacion 
 */
public class Whiz3 {
    
    
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A","B","C");
        boolean b = stream.peek(System.out::print).allMatch(s - > s.lenth()==1);
        
        System.out.println(b);
        
    }
    
    
    
    
}
