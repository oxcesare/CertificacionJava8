/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.uno.clasesAvanzadas;

/**
 *
 * @author consultor006
 */
public class StringArrayTest {

    public static void main(String args[]) {
        String[][][] arr = {{{"a", "b", "c"}, {"d", "e", null}}, {{"x"}, null}, {{"y"}}, {{"z", "p"}, {}}
        };
        System.out.println(arr[0][1][2]);
    }
}
