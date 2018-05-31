/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas.uno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author consultor006
 *
 * Con código de expresiones lambda se puede hacer la invocación a los métodos
 * de la clase String
 *
 */
public class Test2 {

    interface Doer {

        String doIt(int x, String y);
    }

    public static void main(String[] args) {

        Doer d = (int a, String b) -> b.substring(0, a);
        System.out.println(d.doIt(2, "12345"));

        List<Integer> ls = Arrays.asList(10, 47, 33, 23);
        ls.stream().max(Comparator.comparing(a -> a)).get();

        System.out.println("***************");

        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x -> x.length();
        Consumer<Integer> c = x -> System.out.print("Len:" + x + " ");
        strList.stream().map(f).forEach(c);

    }
}
