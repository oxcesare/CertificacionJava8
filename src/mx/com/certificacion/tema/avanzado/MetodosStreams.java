/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class MetodosStreams {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b)); 
        System.out.println(ls.stream().max(Integer::max).get()); 
        System.out.println(ls.stream().max(Integer::compare).get()); 
        System.out.println(ls.stream().max((a, b)->a>b?a:b)); //4
    }
}
