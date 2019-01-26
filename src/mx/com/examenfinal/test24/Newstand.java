/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test24;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author cesaralducinruiz
 *
 * Este clase manda un error en tiempo de ejecuccion debido a que el metodo c
 * compareTo esta declarado sin hacer el respectivo implements 
 * y tenemos que pasarle como parametro el tipo de objeto que queremos comparar.
 * 
 */
class Magazine implements Comparable<Magazine> {

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public int compareTo(Magazine m) {
        return name.compareTo(m.name);
    }

    public String toString() {
        return name;
    }

}

public class Newstand {

    public static void main(String[] args) {
        Set<Magazine> set = new TreeSet<>();
        set.add(new Magazine("highlights"));
        set.add(new Magazine("Newsweek"));
        set.add(new Magazine("highlights"));
        System.out.println(set.iterator().next());
    }
}
