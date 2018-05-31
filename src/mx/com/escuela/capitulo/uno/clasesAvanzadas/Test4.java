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
 * Si el return ya esta en el try o en el catch entonces ya no es necesario
 * ponerlo despues del codigo de este bloque.
 *
 *
 * Nota: Descomentar //return 0.00f; para validar el error
 *
 *
 */
public class Test4 {

    public static void main(String[] args) {

    }

    public float parseFloat(String s) {
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input " + s);
            f = Float.NaN;
            return f;
        } finally {
            System.out.println("finally");
        }
        //return 0.00f;
    }
}
