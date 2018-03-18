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
 * Esta clase manda un error en tiempo de ejecuccion debido a que 
 * primero se crea un subconjunto de TreeSet
 * 
 * subs = (TreeSet) s.subSet(326, true, 328, true);
 * 
 * Posteriormente se quiere agregar un numero al conjunto 
 * pero que este dentro del rango de los subSet
 * //subs.add(329); // 
 */
public class TestClassOther2 {

    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();
        
        for (int i = 324; i <= 328; i++) {
            s.add(i);
        }
        
        subs = (TreeSet) s.subSet(326, true, 328, true);
        System.out.println("subs"+subs);
        //subs.add(329); //
        System.out.println(s + " " + subs);
    }
}
