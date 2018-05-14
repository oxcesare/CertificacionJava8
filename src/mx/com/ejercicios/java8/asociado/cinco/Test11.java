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
 * En esta clase tenemos un método llamado mensaje, definido en la clase padre
 * como public static y en la clase hija como static public siendo esto que no
 * hay diferencia.
 *
 * Recordar que cuando es un método statico no se necesita hacer una referencia
 * e invocar el método por medio del objeto.
 *
 * Si llegamos a invocar el método utilizando una referencia con objeto a nivel
 * funcionalidad no tendremos problema.
 *
 * El orden de los modificadores de acceso no afecta la funcionalidad como tal.
 *
 */
public class Test11 extends AA {

    public static void main(String[] args) {
        Test11 q = new Test11();
        q.mensaje();
    }

    static public void mensaje() {
        System.out.println("Subclase Mensaje");
    }
}

class AA {

    public static void mensaje() {
       System.out.println("Clase Mensaje");
    }

}
