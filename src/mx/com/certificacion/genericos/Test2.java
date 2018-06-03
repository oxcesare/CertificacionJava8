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
public class Test2 {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        
        
        map.merge(3,3,(a,b)->a+b);
        
        System.out.println(map.merge(1,3,(a,b)->a+b));
        
        
        System.out.println(map);
        
    }
    
}
