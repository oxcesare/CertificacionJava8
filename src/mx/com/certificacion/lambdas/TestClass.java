/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

/**
 *
 * @author consultor006
 * 
 * Una interface puede ser declarada dentro de una clase 
 * 
 */
public class TestClass {

    interface Doer {
        String doIt(int x, String y);
    }

    public static void main(String[] args) {
        Doer d = (a, b)->b.substring(0, a);
        System.out.println(d.doIt(2, "12345"));
        
        //Opcion 2
        //Doer d = (int a, String b)->b.substring(0, a);
    }
}
