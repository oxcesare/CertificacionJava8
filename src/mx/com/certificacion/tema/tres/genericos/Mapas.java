/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.tres.genericos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author consultor006
 * 
 * 
 * El metodo merge de map lanza una exception del tipo 
 * Uncheked Exception
 * 
 * El metodo merge de map recibe como parametro 
 * un key, un valor integer y una interface funcional.
 * 
 * Si no se envia una interface funcional correcta como parametro
 * lanza una exception llamada UnsupportedOperationException 
 */


public class Mapas {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a",1);
        map1.put("b",1);
        map1.put("c",4);
        map1.merge("b", 1, (i1, i2) -> i1 + i2);
        map1.merge("c", 3, (i1, i2) -> i1 + i2);
        System.out.println(map1);

    }
}
