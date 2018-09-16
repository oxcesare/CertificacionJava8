/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.functional.programming;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author consultor006
 */
public class Genericos {

    public static void main(String[] args) {
//        Deque<Integer> d = new ArrayDeque<>();
//        d.push(1);
//        d.offerLast(2);
//        d.push(3);
//        d.peekFirst();
//        d.removeLast();
//        d.pop();
//        System.out.println(d);
        System.out.println("*************************************************");
        listas();
    }

    public static void listas() {
        List<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list -> list.subList(2, 4);
        f.apply(vowels);
        vowels.forEach(System.out::print);
    }

}
