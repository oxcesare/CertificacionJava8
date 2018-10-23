/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.stream.api.uno;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author consultor006
 *
 * Clase ejemplo para el uso de Merge
 * 
 * Este metodo hace un merge (Union) con los elementos que se encuentran
 * Declarados
 * Es una especia de suma de los elementos que se enecuntran disponibles. 
 * 
 * 
 */
public class MetodoMerge {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 1);
        map1.put("c", 1);        
        map1.merge("b", 1, (i1, i2) -> i1 + i2);
        map1.merge("c", 1, (i1, i2) -> i1 + i2);
        System.out.println(map1);
    }

}
