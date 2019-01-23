/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test22;

/**
 *
 * @author cesaralducinruiz
 * 
 * Si el metodo de la clase A es default no puede ser visto por clases
 * que estan dentro de otros paquetes.
 */
public class A {
    
    void run(String government) {
        
    }
}

class B {
    
    public static void main(String[] args) {
        A a = new A();
        a.run("");
    }
}
