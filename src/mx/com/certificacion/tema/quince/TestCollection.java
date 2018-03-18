/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.quince;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author consultor006
 */
public class TestCollection {

    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Alice", 82));
        listStudents.add(new Student("Bob", 90));
        listStudents.add(new Student("Carol", 67));
        listStudents.add(new Student("David", 80));
        listStudents.add(new Student("Eric", 55));
        listStudents.add(new Student("Frank", 49));
        listStudents.add(new Student("Gary", 88));
        listStudents.add(new Student("Henry", 98));
        listStudents.add(new Student("Ivan", 66));
        listStudents.add(new Student("John", 52));

        // find students whose score >= 70
        List<Student> listBadStudents = new ArrayList<>();

        for (Student student : listStudents) {
            if (student.getScore() >= 70) {
                listBadStudents.add(student);
            }
        }

        for (Student student : listBadStudents) {
            System.out.println(student);
        }

        // find students whose score >= 70
        List<Student> listGoodStudents = listStudents.stream()
                .filter(s -> s.getScore() >= 70)
                .collect(Collectors.toList());

    }

    /**
     * Con Stream API
     */
    public void conStream() {

    }
}
