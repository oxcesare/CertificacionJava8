/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.repaso.general.herencia;

/**
 *
 * @author consultor006
 */

abstract class AA {
    protected int m1(){ return 0; }
}
class A {

    final int fi = 10;
}

public class B extends A {

    int fi = 15;

    public static void main(String[] args) {
        B b = new B();
        b.fi = 20;
        System.out.println(b.fi);
        System.out.println(((A) b).fi);
    }
}
