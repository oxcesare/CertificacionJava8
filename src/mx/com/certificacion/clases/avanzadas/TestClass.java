/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.clases.avanzadas;

/**
 *
 * @author consultor006
 */
public class TestClass {

    static enum EnumC{ C, CC, CCC };
    
    public class A {
    }

    public static class B {
    }

    public void useClasses() {       //1    
       //new TestClass().new B(); // manera incorrecta de invocar una clase estatica
       //new TestClass().A(); //Manera incorrecta
       new A();
    }
}

interface I { }

enum EnumA implements I { A, AA, AAA};  //1




