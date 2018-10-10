/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.IO;

/**
 *
 * @author consultor006
 *
 * Una clase abstracta puede tener metodos abstractos y no abstractos.
 *
 *
 */
abstract class B {

    public abstract void c();

    public abstract void d();

    public void e() {
        System.out.println("Método no abstracto");
    }

}

public class A extends B {

    @Override
    public void c() {
        System.out.println("mx.com.certificacion.IO.A.c()");
    }

    @Override
    public void d() {
        System.out.println("mx.com.certificacion.IO.A.d()");
    }

    public void e() {
        System.out.println("Se puede sobreEscribir");
    }

    public static void main(String[] args) {
        A a = new A();
        a.c();
        a.d();
        a.e();
    }

}
