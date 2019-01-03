/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test1;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase el error es que la variable chair no esta inicializada.
 */
public class Test2 {

    public static void main(String... args) {
        String chair="A", table = "";
        chair = chair + table;
        System.out.println(chair);
    }

}
