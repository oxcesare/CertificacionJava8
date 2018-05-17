/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.genericos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {
        String[] names = {"Alex", "Bob", "Charlie"};
        //Insert code here   
        //List<String> list = new ArrayList<>(Arrays.asList(names));
        //List<> list = new ArrayList<String>(Arrays.asList(names));
        List<?> list = new ArrayList<>(Arrays.asList(names));
        System.out.println(list.get(0));

        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.push(2);
        d.pop();
        d.offerFirst(3);
        d.remove();
        System.out.println(d);
    }

    public void m1(List<? extends Number> list) {
        Number n = list.get(0);
    }
}
