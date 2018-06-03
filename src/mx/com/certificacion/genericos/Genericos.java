/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.genericos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author consultor006
 */
public class Genericos {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>(10);
        
        for(int i=1; i<10; i++){
            m.put(i, i*i);            
        }
        
        System.out.println(""+m.get(4));
    }
}
