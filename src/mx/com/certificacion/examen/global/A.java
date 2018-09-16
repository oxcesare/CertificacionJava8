/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global;

/**
 *
 * @author consultor006
 */

class B {
    
    public void a(){
        System.out.println("Metodo a() de la clase B");
    }
    
    
    public void b(){
        System.out.println("Metodo b () de la clase B");
    }
    
}
public class A  extends B {
    
    public void c(){
        System.out.println("Metodo c() de la clase A");
    }
    public static void main(String[] args) {
        
        B b = new A(); // la clase B es la hija y podemos crear un objeto que acceda a los atributos y metodos de B
        b.a();
        
    }
}
