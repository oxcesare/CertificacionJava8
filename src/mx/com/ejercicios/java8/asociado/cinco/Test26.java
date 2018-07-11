/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

import java.util.ArrayList;

/**
 *
 * @author consultor006
 *
 * La clase Test26 extiende de Small y al crear objetos del tipo de la subclase
 * podemos acceder a sus variables y métodos
 * 
 * Este tipo de comportamiento solo se puede realizar cuando se hace herencia
 * 
 * En el caso de que con un objeto puede acceder a atributos y metodos de otra clase
 * es con el tema de interfaces y polimorfismo.
 * 
 * Recordar que polimorfismo aplica para temas de polimorfismo.
 */
public class Test26 extends Small {

    String s = "very big";
    final double number = 1000000000;

    public void m (){
        System.out.println("Metodo de la clase Test26");
    }
    
    public static void main(String[] args) {
        Small q = new Test26();//la referencia va de subclase a clase
        System.out.println(q.s);
        System.out.println(q.number);
        
        
        q.algo();
    }
}

class Small {

    String s = "Very small";
    final double number = .01;
    
    ArrayList arr = new ArrayList();
    
    

    public void algo() {
        System.out.println("Algo en clase Padre");
        arr.add("Algo");
        System.out.println("arr.get(0)"+" "+ arr.get(0));
    }
}
