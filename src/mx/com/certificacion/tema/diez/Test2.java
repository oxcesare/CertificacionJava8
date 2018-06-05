/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.diez;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalLong;
import java.util.stream.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author consultor006
 */
public class Test2 {
    
    public static void main(String[] args) {
        LongStream ls = LongStream.of(1,2,3); //Método of de LongStream recibe un arreglo de longs        
        OptionalLong opt;
        
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(1,2,3);
        List<Integer> l3 = Arrays.asList(1,2,3);
        
       // Stream<Integer> s = Stream.of(1);
        //IntStream is = s.mapToInt(x ->x);
       // DoubleStream ds = s.mapToDouble(x ->x);
        //Stream<Integer> s2 = ds.mapToObj(x->x);
        //s2.forEach(System.out::print);
        
        DoubleStream dobles = DoubleStream.of(1.2,2.4,3.4);
        dobles.peek(System.out::print).filter(x->x>2).count();
        
        
    }    
}
