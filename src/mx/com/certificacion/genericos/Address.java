/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.genericos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author consultor006
 */
public class Address implements Comparable<Address> {

    String street;
    String zip;

    public Address(String street, String zip) {
        this.street = street;
        this.zip = zip;
    }

    /**
     * 
     * @param o
     * @return 
     * 
     * Este metodo regresa -1, 0 y 1 
     * 0 son iguales 
     * -1 uno es mayor que el otro 
     * 1 es menor que el otro 
     * 
     * dependiendo lo que regresa el primero compareTo 
     * entonces se va al siguiente, primero compara con zip y despues con street.
     * 
     */
    public int compareTo(Address o) {
        int x = this.zip.compareTo(o.zip);
        System.out.println("int x " + " " + x);
        return x == 0 ? this.street.compareTo(o.street) : x;
    }

}
