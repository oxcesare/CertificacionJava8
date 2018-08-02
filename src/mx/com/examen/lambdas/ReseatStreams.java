/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author consultor006
 */
public class ReseatStreams {

    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17); //1 
        Stream<Integer> primeStream = primes.stream(); //2  
        Predicate<Integer> test1 = k -> k < 10; //3 
        //long count1 = primeStream.filter(test1).count();//4 
        //long count1 = IntStream.of(primes).filter(test1).count();//4
        Predicate<Integer> test2 = k -> k > 10; //5 
        //long count2 = primeStream.filter(test2).count(); //6  
        //long count2 = primeStream.reset().filter(test2).count(); //6
        //System.out.println(count1+" "+count2); //7 
        primeStream.collect(Collectors.partitioningBy(test1, Collectors.counting())).values().forEach(System.out::print);
        
        System.out.println("***********************************************");
        
        DoubleStream is = DoubleStream.of(0, 2, 4); //1 
        double sum = is.filter( i->i%2 != 0 ).sum(); //2 System.out.println(sum); //3
        System.out.println("sum"+""+sum);
        
    }
}
