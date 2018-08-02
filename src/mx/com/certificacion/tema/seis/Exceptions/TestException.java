/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis.Exceptions;

import java.io.IOException;

/**
 *
 * @author cesaralducinruiz
 *
 * Declaracion de una clase que lanza un exception, esto es valido porque
 * estamos lanzando una nueva exception dentro del cuerpo del método.
 *
 *
 */
public class TestException {

    public void lanza() throws Exception {
        throw new IOException("IOException");
    }

    public static void main(String[] args) throws Exception {
        TestException test = new TestException();
        try {
            test.lanza();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    void assertTest() {
        
       String version = System.getProperty("java.version");
       assert  version !=null;
    }
    
    void m(){
        String number = null;
        assert number != null && number.length() == 10 : "Invalid phone number"; 
    }

}
