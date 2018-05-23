/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author consultor006
 */
class Address implements Comparable<Address> {

    String street;
    String zip;

    public Address(String street, String zip) {
        this.street = street;
        this.zip = zip;
    }

    public int compareTo(Address o) {
        int x = this.zip.compareTo(o.zip);
        return x == 0 ? this.street.compareTo(o.street) : x;
    }
}

public class TestClass {

    public static void main(String[] args) {
        ArrayList<TestClass> al = new ArrayList<>();
       // al.add(new TestClass("dupont dr", "28217"));
       // al.add(new TestClass("sharview cir", "28217"));
       // al.add(new TestClass("yorkmont ridge ln", "11223"));
       // Collections.sort(al);
        for (TestClass a : al) {
        //    System.out.println(a.street + " " + a.zip);
        }
    }
}
