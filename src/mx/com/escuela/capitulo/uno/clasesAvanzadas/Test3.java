/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.uno.clasesAvanzadas;

/**
 *
 * @author consultor006
 */
public class Test3 {

    public static int[] getArray() {
        return null;
    }
    public static void main(String[] args) {
        int index = 1;
        try {
            getArray()[index = 2]++;
        } catch (Exception e) {
        }  //empty catch       System.out.println("index = " + index);    }
    }
 }