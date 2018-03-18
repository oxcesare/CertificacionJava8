/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.diez;

/**
 *
 * @author consultor006
 * 
 * No se puede crear una instancia de la clase C 
 * ya que se puso como Variable dentro de los wildcard <> 
 * <? extends o super > son los bound y hay de diferentes tipos.
 */
class A {
}

class B extends A {
    
}

class C extends B {
    
}

class D<C> {
    A a1 = new A();
    A a2 = new B();

}