/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author consultor006
 * 
 * The function f accepts a String and returns its length. The call to map(f), 
 * uses this function to replace each element of the stream with an Integer. 
 * The call to forEach(c) uses function c to print each element.
 */
public class Test3 {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x -> x.length();
        Consumer<Integer> c = x -> System.out.print("Len:" + x + " ");
        strList.stream().map(f).forEach(c);
    }
}
