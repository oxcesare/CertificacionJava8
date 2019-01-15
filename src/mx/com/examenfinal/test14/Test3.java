/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test14;

import java.util.stream.LongStream;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase se hace uso del meto of de LongStream
 * 
 * y el metodo mapToDouble el cual recibe long como parametro 
 * 
 * Cabe mencionar que los stream reciben 
 * como parametros tipos de datos primitivos y de objeto 
 * 
 * por mencionar algunos encontramos
 * 
 * DOUBLE, INTEGER, LONG, 
 * 
 * double, int, long 
 * 
 */
public class Test3 {
    
    public static void main(String[] args) {
        LongStream stream = LongStream.of(9);
        stream.mapToDouble(p -> p).forEach(System.out::print);
        
    }
}
