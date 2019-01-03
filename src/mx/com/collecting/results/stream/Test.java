/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.collecting.results.stream;

import java.util.*;
/**
 *
 * @author cesaralducinruiz
 */
public class Test {
    
    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<String>();
        cadenas.add("A");
        cadenas.add("B");
        cadenas.add("C");
        cadenas.add("D");
        
        System.out.println("Stream"+ " " + cadenas.stream().findFirst());
        
        
    }
    
}
