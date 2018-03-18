/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cuatro;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class TestOne {

    public static void main(String[] args) {
        List<String> vals = Arrays.asList("a", "b");
        String join = vals.parallelStream().reduce("_", (a, b) -> a.concat(b));
        System.out.println(join);
    }
}
