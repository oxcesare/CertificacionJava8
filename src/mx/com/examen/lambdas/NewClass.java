/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.Optional;

/**
 *
 * @author consultor006
 */
public class NewClass {

    public static Optional<String> getGrade(int marks) {
        Optional<String> grade = Optional.empty();
        if (marks > 50) {
            grade = Optional.of("PASS");
        } else {
            grade.of("FAIL");
        }
        return grade;
    }
    public static void main(String[] args) {
        Optional<String> grade1 = getGrade(50);
        Optional<String> grade2 = getGrade(55);
        //System.out.println(grade1.orElse("UNKNOWN"));
//        if (grade2.isPresent()) {
//            grade2.ifPresent(x -> System.out.println(x));
//        } else {
//            System.out.println(grade2.orElse("Empty"));
//        }
    }
}
