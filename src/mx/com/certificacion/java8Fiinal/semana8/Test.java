/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author cesaralducinruiz
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stud = new Student("Cesar", 20, "Ingenieria De Software");
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(("F:\\stud.ser")));
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("F:\\stud.ser"))) {
            oos.writeObject(stud);
            Student s = (Student) ois.readObject();
            System.out.printf("%s, %d, %s",
                    s.getName(), s.getAge(), s.getCourse());
        }

    }

}
