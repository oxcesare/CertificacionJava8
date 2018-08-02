/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author cesaralducinruiz
 * 
 * La interface Map tiene algunos metodos definidos para la manipulacion 
 * de colecciones y estas con la incorporacion de Java 8 reciben 
 * cómo parametros interfaces funcionales.
 * 
 * 
 * Map tiene un método que se llama computeIfAbsent que recibe un String 
 * y un Function el cual es una interface funcional.
 * 
 * Recordar que una cola (Queue) no forma parte de las Collection, se incluye
 * dentro de estas por agruparlas en algún lugar.
 */


public class Test9 {

    public static void main(String[] args) {
        
       //Implementacion de Map
       Map<String, List<Double>> groupedValues = new HashMap<>();
       
       //Implementacion de Set
       LinkedHashSet<String> lhset = new LinkedHashSet<String>();
       
       
       //Implementacion de Queue
        Deque<String> dq = new ArrayDeque<String>();
       
        
        
    }

}
