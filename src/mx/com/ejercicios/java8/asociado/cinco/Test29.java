/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 */
public class Test29 extends Thread {

    String msg = "default";

    public Test29(String s) {
        msg = s;
    }

    public void run() {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        new Test29("String1").run();
        new Test29("String2").run();
        System.out.println("end");
    }
}
