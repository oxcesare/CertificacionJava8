/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

import java.io.FileNotFoundException;

/**
 *
 * @author consultor006
 * 
 * En esta clase Test15 como ya se tiene sobreescrito el metodo run
 * y lanza una exception que es una subexception de Exception
 * entonces no manda error. y el mensaje que imprime
 * es que se puede lanzar una exception más especifica. 
 * 
 */

public class Test15 extends SuperTest15 {

    public static void main(String[] args) {
        Test15 q = new Test15();
        try {
            q.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    void run() throws FileNotFoundException {
        System.out.println("Overriding methods can throw more specific exception");
    }
}

class SuperTest15 {

    void run() throws Exception {
        System.out.println("Overriden methods must throw more general Exceptions");
    }

    void run(int i) throws Exception {
        System.out.println("This method is overloaded, not overriden");
    }
}
