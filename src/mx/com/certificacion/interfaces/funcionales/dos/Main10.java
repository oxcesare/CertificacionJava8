/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.interfaces.funcionales.dos;

import java.util.function.Predicate;

/**
 *
 * @author consultor006
 * 
 * Predicate es una interface funcional que recibe como parametro un booleano.
 * 
 * T puede recibir un objeto primitivo y una objeto de una clase. 
 */


class A{
    
    private String edad;
    private String nombre;

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
public class Main10 {

    public static void main(String[] args) {
        Predicate<String> i = (s) -> s.length() > 5;        
        Predicate<Integer> j;     
        Predicate<A> a;       
        
    }

}
