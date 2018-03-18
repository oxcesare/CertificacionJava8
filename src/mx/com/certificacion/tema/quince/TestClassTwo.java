/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.quince;

/**
 *
 * @author consultor006
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



public class TestClassTwo {

    public static void main(String[] args) {
       Threader t = new Threader();
       Thread h = new Pooler(t);  //2      
       h.start (); //3     
     }
}

