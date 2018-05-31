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
 */
public class Test26 extends Small {

    String s = "very big";
    final double number = 1000000000;

    public static void main(String[] args) {
        Small q = new Test26();
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
        System.out.println("arr.get(0)"+" "+ arr.get(0));
    }
}
