/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.quince;

/**
 *
 * @author consultor006
 * 
 * En Java puedes generar una instancia de runnable sobreescribiendo
 * el metodo run y poder sincronizar lo que este dentro de dicho metodo
 * 
 * Tienes mas de una implementacion de Runnbable entonces
 * solo una es la que se ejecutara.
 * 
 */
public class TestClass {

    static StringBuffer sb1 = new StringBuffer();
    static StringBuffer sb2 = new StringBuffer();
    static StringBuffer sb3 = new StringBuffer();
    static StringBuffer sb4 = new StringBuffer();
    static StringBuffer sb5 = new StringBuffer();
    static StringBuffer sb6 = new StringBuffer();
    
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                synchronized (sb1) {
                    sb1.append("X");
                    synchronized (sb2) {
                        sb2.append("Y");
                    }
                }
                System.out.println(sb1);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                synchronized (sb3) {
                    sb3.append("Z");
                    synchronized (sb4) {
                        sb4.append("Z");
                    }
                }
                System.out.println(sb2);
            }
        }).start();
         new Thread(new Runnable() {
            public void run() {
                synchronized (sb5) {
                    sb5.append("A");
                    synchronized (sb6) {
                        sb6.append("B");
                    }
                }
                System.out.println(sb3);
            }
        }).start();
    }
}
