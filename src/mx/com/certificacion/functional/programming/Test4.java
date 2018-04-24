/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.functional.programming;

import java.util.stream.*;
import java.util.function.*;
import java.util.*;

/**
 *
 * @author consultor006
 */
public class Test4 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        
        System.out.println("sort"+ordena(lista));
        System.out.println("ordena"+sort(lista));

        System.out.println("***********************");
        
        genera();
        
        System.out.println("***********************");
        
        generados();
    }

    private static List<String> sort(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        
        //Stream.generate(()->"1").filter(x -> x.length()>1).forEach(System.out::println).limit(10).peek(System.out::println));
        return copy;
    }

    /**
     * Version con programacion funcional
     * @param list
     * @return 
     */
    private static List<String> ordena(List<String> list) {
        IntStream is = IntStream.empty();
        is.sum();
        return list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
    }
    
    private static void genera(){
        DoubleStream s = DoubleStream.of(1.2,2.4);
        s.peek(System.out::println).filter(x ->x>2).count();
    }
    
    private static void generados(){
        
        List<Integer> l = IntStream.range(1,6).mapToObj(i->i).collect(Collectors.toList());
        l.forEach(System.out::println);
        
      
        
    }
    
    private static void otro (){
          List<Integer> p = IntStream.range(1,6).mapToObj(1->i).forEach(System.out::println);
    }
    

}
