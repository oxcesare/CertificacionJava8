/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.uno.clasesAvanzadas;

/**
 *
 * @author consultor006
 *
 * En la herencia de metodos cuando se hace la llamada a super entonces desde la
 * clase hija menor va ocupando los metodos de las clases padre.
 */
public class TestClassUno {

    public static void main(String args[]) {
        B c = new C();
        System.out.println(c.max(10, 20));
    }
}

class A {

    int max(int x, int y) {
        System.out.println("clase a: x" + x);
        System.out.println("clase a: y" + y);
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }
}

class B extends A {

    int max(int x, int y) {
        System.out.println("clase b: x" + x);
        System.out.println("clase b: y" + y);
        return 2 * super.max(x, y);
    }
}

class C extends B {

    int max(int x, int y) {
        System.out.println("clase c: x" + x);
        System.out.println("clase c: y" + y);
        return super.max(2 * x, 2 * y);
    }
}
