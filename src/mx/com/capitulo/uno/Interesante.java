/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.capitulo.uno;

import java.util.*;

/**
 *
 * @author consultor006
 * 
 * Ignora los las comillas extras e imprime sin problemas la cadena
 */
public class Interesante {
    public static void main(String[] args) {
        System.out.println("Hello World");;;;;;;;;;;;;;;;;;;;;
        
        String [] lizards = {"iguana","gecko"};
        List<String> list = Arrays.asList(lizards);
        list.set(1, "");
        System.out.println(list);
        
    }
}
