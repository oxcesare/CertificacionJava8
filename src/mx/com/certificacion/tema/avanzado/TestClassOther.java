/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

import java.util.*;

/**
 *
 * @author consultor006
 */
public class TestClassOther {

    public static void main(String[] args) {
//        TreeSet<Integer> s = new TreeSet<Integer>();
//        TreeSet<Integer> subs = new TreeSet<Integer>();
//        for (int i = 324; i <= 328; i++) {
//            s.add(i);
//        }
//        subs = (TreeSet) s.subSet(326, true, 327, true);
//        subs.add(329);
//        System.out.println(s + " " + subs);
        Date date = null;
        if(date instanceof java.util.Date){
            System.out.println("date"+date);
        }
            
        System.out.println("java.util.Date"+java.util.Date);
    }

}
