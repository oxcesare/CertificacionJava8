/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.genericos;

import java.util.TreeSet;

/**
 *
 * @author consultor006
 */
public class StudyGroup {

    String name = "MATH";
    TreeSet<Person2> set = new TreeSet<Person2>();

    /**
     * 
     * @param p 
     * Implementacion de comparabale 
     */
    public void add(Person2 p) {
        if (name.equals(p.getInterest())) {
            set.add(p);
        }
    }

    public static void main(String[] args) {
        StudyGroup mathGroup = new StudyGroup();
        mathGroup.add(new Person2("MATH"));
        System.out.println("A");
        mathGroup.add(new Person2("MATH"));
        System.out.println("B");
        System.out.println(mathGroup.set);
    }
}
