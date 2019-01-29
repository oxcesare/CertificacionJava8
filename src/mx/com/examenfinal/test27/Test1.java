/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test27;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
/**
 *
 * @author cesaralducinruiz
 * 
 * Uso de Mapas en Java 8 
 * 
 * HashMap tiene metodos sincronizados y permite nulos en key y en value
 * 
 * Hashtable no permite nulos. 
 * 
 * 
 */
public class Test1 {
    
    public static void main(String[] args) {
        Map<String,String> m1 = new Hashtable<>();
        
        
        Map<Integer,String> m2 = new HashMap<>();
        m2.put(Integer.SIZE, null);
        m2.put(Integer.SIZE, "2");
        
        
    }
    
}
