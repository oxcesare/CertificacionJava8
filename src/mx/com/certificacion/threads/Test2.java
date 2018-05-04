/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.threads;

/**
 *
 * @author consultor006
 * 
 * It may result in a deadlock and the program may get stuck.
 * 
 * Nothing can be said for sure.
 * 
 * 
 */
public class Test2 extends Thread {

    boolean flag = false;

    public Test2(boolean f) {
        flag = f;
    }
    static Object obj1 = new Object();
    static Object obj2 = new Object();

    public void m1() {
        synchronized (obj1) {
            System.out.print("1 ");
            synchronized (obj2) {
                System.out.println("2");
            }
        }
    }

    public void m2() {
        synchronized (obj2) {
            System.out.print("2 ");
            synchronized (obj1) {
                System.out.println("1");
            }
        }
    }

    public void run() {
        if (flag) {
            m1();
            m2();
        } else {
            m2();
            m1();
        }
    }

    public static void main(String[] args) {
        new Test2(true).start();
        new Test2(false).start();
    }
}
