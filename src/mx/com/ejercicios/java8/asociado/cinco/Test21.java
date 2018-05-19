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
 * Clase Test21 que demuestra el uso de los bloques staticos 
 * 
 */
public class Test21 extends SubTest21 {

    static {
        System.out.println("SubClase");
    }

    public static void main(String[] args) {
        Test21 q = new Test21();
    }
}

class SubTest21 {

    public SubTest21() {
        System.out.println("Constructor Clase Padre");
    }

    static {
        System.out.println("Clase Padre");
    }
}
