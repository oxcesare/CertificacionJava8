/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.lambdas;

import java.util.*;

/**
 *
 * @author consultor006
 */
public class TestClass1 {

    static String[] sa = {"a", "aa", "aaa", "aaaa"};

    static {
        Arrays.sort(sa);
        System.out.println("Se ejecuta primero");
    }

    public static void main(String[] args) {
        String search = "";
        if (args.length != 0) {
            search = args[0];
        }
        System.out.println(Arrays.binarySearch(sa, search));

        System.out.println("*******************************");

        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.addFirst(2);
        d.pop();
        d.offerFirst(3);
        
        System.out.println("d"+d);
    }
}
