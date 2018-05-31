/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.uno.clasesAvanzadas;

/**
 *
 * @author consultor006
 *
 * Las etiquetas no son vallidas dentro del metodo MAIN
 */
public class TestClass1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 10) {
                    break;
                }
            }
            System.out.println("hello");
        }
    }

}
