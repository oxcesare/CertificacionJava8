/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;


/**
 *
 * @author cesaralducinruiz
 */
public class Whiz10 {
    
    
    public static void main(String[] args) {
        
        //El rango abarca 1,2,3,4,5 
        IntStream ins = IntStream.rangeClosed(1, 5);
        IntConsumer con = System.out::print;
        con.accept(ins.sum());
    }
    
    
    
}
