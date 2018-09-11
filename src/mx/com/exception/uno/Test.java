/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.exception.uno;

import java.util.*;
import java.util.List.*;

/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("rumble");
        sb.append(4).deleteCharAt(3).delete(3, sb.length() - 1);
        System.out.println(sb);
        System.out.println("***********************************");

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.add(3);
        values.set(1, 6);
        values.remove(0); //el metodo remove puede ser el objeto o puede ser la posicion lo que eliminamos

        for (Integer value : values) {
            System.out.println("values" + " " + value);
        }

        System.out.println("**************************************************");

        binarySearch();

    }

    /**
     * El metod bynarySearch()busca dentro de un arreglo el valor que se le
     * indique mediante la posicion, en esta caso random es mi arreglo y x es el
     * elemento que estoy buscando por lo tanto me regresa la posicion 2.
     */
    public static void binarySearch() {
        int[] random = {12, -4, 1, 0, 10};
        int x = 1;

        int y = Arrays.binarySearch(random, 0);
        System.out.println("" + y);

    }
}
