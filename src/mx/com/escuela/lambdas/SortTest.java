/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author consultor006
 */
class Person {

    String name;
    String dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }
}

class MySorter {

    public int compare(Person p1, Person p2) {
        return p1.dob.compareTo(p2.dob);
    }
}

public class SortTest {

    public static int diff(Person p1, Person p2) {
        return p1.dob.compareTo(p2.dob);
    }

    public static int diff(Date d1, Date d2) {
        return d1.compareTo(d2);
    }

    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Paul", "01012000"));
        al.add(new Person("Peter", "01011990"));
        al.add(new Person("Patrick", "01012002"));

        java.util.Collections.sort(al, (p1, p2) -> p1.dob.compareTo(p2.dob));
        java.util.Collections.sort(al, SortTest::diff);
        java.util.Collections.sort(al, new MySorter()::compare);
        //java.util.Arrays.sort(al, SortTest::diff);

        System.out.println("***************************************");
        String[] sa = {"charlie", "bob", "andy", "dave"};
        Collections.sort(Arrays.asList(sa), null);
        System.out.println(sa[0]);
                     
    }
}
