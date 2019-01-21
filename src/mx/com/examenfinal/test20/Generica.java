/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test20;

/**
 *
 * @author cesaralducinruiz
 *
 * Ejemplo de clase generica
 *
 * T Se utiliza para generar un generico
 *
 * S Si se necesita mas elementos genericos U Si se necesita mas elementos
 * genericos V Si se necesita mas elementos genericos
 *
 * Es decir conforme necesite mas genericos se puede hacer uso de las letras
 * T,S,U,V
 *
 * Estos T,S,U,V se utilizan para clases y objetos, excepto primitivos
 *
 * Si mandamos primitivos nos manda un error en tiempo de compilacion
 *
 */
class Uno<T> {
    
}

class Dos<T, S> {
    
}

class Tres<T, S, U> {
    
}

public class Generica<T, S, U, V> {
    
    public static void main(String[] args) {
        Uno<Object> uno = new Uno();
        Dos<Object, Object> dos = new Dos();
        Tres<Object, Double, Integer> tres = new Tres<>();
        GenericoDos<String> dosGenericos = new GenericoDos();
        dosGenericos.setDos("A");
        dosGenericos.setUno("B");
        dosGenericos.setTres("C");
        
    }

    /**
     *
     * @param generico
     *
     * Metodo recibe un generico
     */
    public static<T> void recibeGenericos(GenericoDos<T> generico) {
        GenericoDos<String> dosGenericos = new GenericoDos();
        
    }
}
