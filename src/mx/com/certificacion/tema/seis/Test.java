/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis;

/**
 *
 * @author consultor006
 */
public class Test extends Thread {

    static Object obj = new Object(); 
    static int x, y;

    public void run() {
        synchronized (obj) {
            for (;;) {
                x++;
                y++;
                System.out.println(x + " " + y);
            }
        }
    }

    public static void main(String[] args) {
        new Test().start();
        new Test().start();
    }
}
