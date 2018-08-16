/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete.Concurrency;

/**
 *
 * @author consultor006
 */
public class TestEncriptaTelcel {

    public static void main(String[] args) {
        EncriptaTelcel ct = new EncriptaTelcel();
        System.out.println(ct.encripta("TELCEL08", "9A2DF55C5FF903"));
    }
}
