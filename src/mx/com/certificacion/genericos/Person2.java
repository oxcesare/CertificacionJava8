/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.genericos;

import java.util.*;

/**
 *
 * @author consultor006
 */
public class Person2 {

    private static int count = 0;
    private String id = "0";
    private String interest;

    public Person2(String interest) {
        this.interest = interest;
        this.id = "" + ++count;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String toString() {
        return id;
    }
}
