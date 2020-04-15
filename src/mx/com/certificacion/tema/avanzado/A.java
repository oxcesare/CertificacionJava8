/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;
import java.util.*;

/**
 *
 * @author consultor006
 * ? sirve para indicar que se puede recibir cualquier objeto
 * ? extends A indica que se puede recibir cualquier objeto que extienda de la clase
 * ? super A  la palabra reservada super tambien se puede utiliza bajo este contexto
 */
public class A {
 
    public static void main(String[] args) {
        List<?> list = new ArrayList<A>(); // un list que recibe una lista de objetos de la clase A
        List<? extends A> listb = new ArrayList<A>();
                
    }
    
}

class B extends A {
    
}

class C extends B {
    
}