/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.capitulo.uno;

import java.util.*;

/**
 *
 * @author consultor006
 *
 * En esta clase se demuestra que lso mapas si aceptan valores duplicados
 * recordar que los que no lo hacen son los SET.
 */
public class MyTrees {

    String name;

    public MyTrees(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Map<MyTrees, String> trees = new LinkedHashMap<MyTrees, String>();
        trees.put(new MyTrees(("1")), "XL");
        trees.put(new MyTrees(("2")), "XL");
        trees.put(new MyTrees(("1")), "XL");
        trees.put(new MyTrees(("2")), "XL");

        System.out.println(trees.size());
    }

}
