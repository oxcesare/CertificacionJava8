/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema;

import java.util.*;

/**
 *
 * @author consultor006 En una cola se considera el primer elemento el que entra
 * en este ejemplo es la letra "C".
 *
 *
 *
 */
public class Colas {

    public static void main(String[] args) {
        Colas c = new Colas();
        c.colas();
        c.soloPeek();
    }

    public void colas() {
        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("A");
        greetings.push("B");
        greetings.push("C");
        greetings.pop(); //Remueve el primer elemento de la cola, 
        greetings.peek(); //No remueve pero si cambia de posicion

        while (greetings.peek() != null) {
            System.out.println("" + greetings.pop());
        }
        System.out.println("************************************");
    }

    public void soloPeek() {
        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("A");
        greetings.push("B");
        greetings.push("C");
        greetings.peek(); //No remueve pero si cambia de posicion

        for (String q : greetings) {
            System.out.println("" + q.toString());
        }

        System.out.println("************************ con el While");

        while (greetings.peek() != null) {
            System.out.println("" + greetings.pop());
        }

    }

}
