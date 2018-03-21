/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 * 
 * El concepto de herencia cubre el aspecto que dice:
 * que se puede invocar al constructor de la clase padre
 * mediante la palabra reserva Super.
 */
public class A {
    
    public void m(){
        System.out.println("metodo m de la clase");
    }  
    
    public static void main(String[] args) {
        A a = new A();
        a.m();
        B b = new B();
        b.c();
        C c = new C();
    }
}

class B extends A{
    
    public static void c(){
        System.out.println("metodo c de la subclase");
    }
}

class C extends Demo{
    
}

abstract class Demo {
    
}



interface Alguna {
    
}