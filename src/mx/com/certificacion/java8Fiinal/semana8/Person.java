/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana8;

import java.io.Serializable;

/**
 *
 * @author cesaralducinruiz
 */
public class Person {
    
    private String name;
    private int    age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    
}


class Student extends Person implements Serializable {

    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course=course;
    }

    public String getCourse() {
        return course;
    }

    
    
}