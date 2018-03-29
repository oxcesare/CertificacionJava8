/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 */

class A { }

public class OtherClass {

    public class A {

        public void m() {
        }
    }

    class B extends A {
    }

    public static void main(String args[]) {
        new OtherClass().new A() {
            public void m() {
            }
        };
    }
}
