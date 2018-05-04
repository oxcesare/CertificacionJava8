/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author consultor006
 */
public class TestStudent {

    public static void main(String[] args) {
        List<Student> slist = Arrays.asList(
                new Student("S1", 40), 
                new Student("S2", 35), 
                new Student("S3", 30));
        Consumer<Student> increaseMarks = s -> s.addMarks(10);
        slist.forEach(increaseMarks);
        slist.stream().forEach(Student::debug);
    }
}
