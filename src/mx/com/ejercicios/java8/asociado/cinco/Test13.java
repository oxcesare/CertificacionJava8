/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 *
 * Esta clase imprime el valor de "Sub" debido a que en el 
 * constructor de la clase padre se invoca el método run
 * de la clase padre y después se sobreEscrbibe en la clase
 * hija con el valor antes mencionado. 
 */
public class Test13 extends SuperTest13 {

    public static void main(String[] args) {
        Test13 q = (Test13)new SuperTest13();
        System.out.println(q.s);
    }

    public void run() {
        s = "Sub";
    }
}

class SuperTest13 {

    String s;

    public SuperTest13() {
        run();
    }

    public void run() {
        s = "Super";
    }
}
