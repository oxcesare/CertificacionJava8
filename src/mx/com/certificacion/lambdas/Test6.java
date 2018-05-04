/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class Test6 {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 47, 33, 23);
        int max= ls.stream().max(Comparator.comparing(a->a)).get();
        System.out.println(max); //1
    }
}
