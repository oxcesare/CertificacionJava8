/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.dos;

/**
 *
 * @author consultor006
 * 
 * De la siguiente clase podemos concluir:
 * 
 * class created inside the main method is final.
 * Because it is anonymous. Anonymous classes are implicitly final
 * 
 * Objects of class B cannot be created inside the main method just by doing "new B()".
 * you'll need to do: new TestClass().new B() because inner class B is not static.
 * 
 */
class A {
}

public class TestClass {

    public class A {

        public void m() {
        }
    }

    class B extends A {
    }

    public static void main(String args[]) {
        new TestClass().new A() {
            public void m() {
            }
        };
    }
}


