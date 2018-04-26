/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.stream.api.uno;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author consultor006
 * 
 * El método Collectors.groupingBy: permite ordenar de acuerdo a algun criterio
 * en esta caso String::length es decir saca al longitud de cada cadena
 * y después con el metodo counting contabiliza de acuerdo a cuantas cadenas
 * tienen la misma longitud 
 */


public class Test2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("greg", "dave", "don", "eda", "fred");
        Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(data.values());
    }
}
