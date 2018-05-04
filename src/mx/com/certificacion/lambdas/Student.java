/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

/**
 *
 * @author consultor006
 */
public class Student {

    private String name;
    private int marks;

    Student(String s1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void addMarks(int m) {
        this.marks += m;
    }

    public void debug() {
        System.out.println(name + ":" + marks);
    }
}
