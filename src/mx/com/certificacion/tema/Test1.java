/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.*;
/**
 *
 * @author consultor006
 * 
 * En esta clase El array de Sttings se guarda en un String, estos se agrupan
 * de acuerdo a la longitud de este y se imprime el número de elementos utilizando 
 * el método counting. 
 * 
 * Si no se encuentra presente el elemento  el resultado es 0 
 * 
 * El resultado es el siguiente; [1, 1, 3]
 */
public class Test1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred");
        Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(data.values());
        
        //Interface Funcional Consumer 
        Consumer<Person> objeto;
        
        //Interface Funcional BiConsumer 
        BiConsumer<Person,Integer> objeto2;              
        
        //Interface Funcional Predicate
        Predicate<Double> dobles;
    }
}
