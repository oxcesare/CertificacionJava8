/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author consultor006
 */
public class Bloques {

    static int i = 0;
    static String x = "Cadena";

    static {
        i = 10;
        x = "Nueva";
    }

//    public Bloques() {
//        i = 11;
//        x = "Otra";
//    }

    public static void main(String[] args) {
        Bloques bloques = new Bloques();
        System.out.println(i);
        System.out.println(x);
    }

}
