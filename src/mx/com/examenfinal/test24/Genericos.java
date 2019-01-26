/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test24;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.*;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase solo manda error el objeto creado b,
 * ya que una collection del tipo TreeMap es incomplatible con
 * collection
 */
public class Genericos {
    
    public static void main(String[] args) {
        Collection<String> a = new ArrayDeque<>();
        //Collection<String> b = new TreeMap<>();
        Collection<String> c = new TreeSet<>();
    }
    
}
