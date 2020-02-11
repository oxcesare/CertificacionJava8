/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cesaralducinruiz
 */
public class Whiz2 {
    
    
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.remove("A");
        map.remove(3, "C");
        map.remove(4,"B");
        map.values().forEach(System.out::print);
                
        
    }
    
}
