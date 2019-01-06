/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test6;

/**
 *
 * @author cesaralducinruiz
 * 
 * En la presente clase si dejamos 
 * la variable birds sin colocar la palabra reservada
 * static no se puede usar dentro de el metodo main
 * y mandara un error de compilacion.
 * 
 */

public class ParkRanger {

    static int birds = 10;

    public static void main(String[] data) {
        int trees = 5;
        System.out.print(trees + birds);
    }
}
