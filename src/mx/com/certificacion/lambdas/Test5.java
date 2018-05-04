/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author consultor006
 */
public class Test5 {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x -> x.length();
        Consumer<Integer> c = x -> System.out.print("Len:" + x + " ");
        strList.stream().map(f).forEach(c);
    }

}
