/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana8;

/**
 *
 * 
 * Clase que al ejectuarla regresa una exception del tipo 
 * java.lang.ArrayStoreException
 * @author cesaralducinruiz
 */
public class TestAnimal {
    
    public static void main(String[] args) throws ArrayStoreException{
        
        /* la instancia que se esta haciendo es del tipo Dog
        Por lo que no podemos almacenar un animal*/
        Animal[]animals = new Dog[2];
        animals[0] = new Animal();
        animals[1] = new Dog();
        
        animals[0].eat();
        animals[1].eat();
        
    }
    
}
