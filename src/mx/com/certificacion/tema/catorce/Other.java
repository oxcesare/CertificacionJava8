/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.catorce;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author consultor006
 */
public class Other {

    public static void main(String[] args) {
        listas();
    }

    public static void listas() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
        Set<Integer> s3 = new ConcurrentSkipListSet<>();
        s3.addAll(l1);
        
        for(Integer item: l2){
            l2.add(5);
        }        
        System.out.println("l1"+" "+l1.size());            
                
    }
}
