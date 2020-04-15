/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.once;

import java.util.Comparator;

/**
 *
 * @author cesaralducinruiz
 */
public class TestComparator {
    
    public static void main(String[] args) {
        Comparator<Integer> comp = Integer::compare;
        System.out.println(""+comp.compare(Integer.MAX_VALUE, Integer.SIZE));
    }
    
}
