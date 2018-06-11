/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.hilos;

/**
 *
 * @author consultor006
 * 
 * Si tienes una clase que extiende de una 
 * clase que extiende de thread y sobreescriben el método run al momento de crear una instancia de la clase hija en esta se ejecutará el método run de la clase hija. 
 */
class Threader extends Thread {

    public void run() {
        System.out.println("In Threader");
    }
}

class Pooler extends Thread {

    public Pooler() {
    }

    public Pooler(Runnable r) {
        super(r);  //1     
    }  
    
    public void run() {
        System.out.println("In Pooler");
    }
}

public class TestClass {

    public static void main(String[] args) {
        Threader t = new Threader(); // se crea un objeto de la clase que extiende de Thread
        Thread h = new Pooler(t);  //2         //Objeto Thread que accede a Pooler
        h.start (); //3   
    }
}

