/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.once;

import java.util.function.BiFunction;
import java.util.stream.DoubleStream;

/**
 *
 * @author cesaralducinruiz
 */
public class TestAvegare {
    
    public static void main(String[] args) {
        DoubleStream stream = DoubleStream.of(2.4,6,1.5,9);        
        System.out.println(""+stream.average());
        
        System.out.println("***********************");
        
        //BiFunction<Double, Double,String> fun = (s,d)-> d+Double.parseDouble(s);
    }
}
