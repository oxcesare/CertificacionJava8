/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.tres;

/**
 *
 * @author consultor006
 */
public class A {

    private int i;

    public void modifyOther(A a1) {
        a1.i = 20;  //1   
    } 
    public static void main(String[] args) {
        A a1 = new A();
        a1.modifyOther(a1);
    }

}
