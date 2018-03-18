/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.quince;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public String toString() {
        return this.name + " - " + this.score;
    }

    public int compareTo(Student another) {
        return another.getScore() - this.score;
    }

    public static void main(String[] args) {
        
    }
}
