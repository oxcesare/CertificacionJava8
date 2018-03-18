/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.*;

/**
 *
 * @author consultor006
 * Cuando extendemos de otras clases el modificador valido
 * solo es public ya que si ponemos otro que no es mandara un error
 * en tiempo de compilacion, 
 * 
 * 
 * Esta regla aplica para atributos y métodos
 * 
 */
public class B extends p1.A {

    public void process(A a) {
        a.i = a.i * 2;
    }
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        b.process(a);
        System.out.println(a.getI());
    }
}
