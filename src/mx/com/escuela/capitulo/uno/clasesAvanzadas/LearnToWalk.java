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
 * Cuando una clase extiende de otra y se sobrescribenm los métodos el que
 * sobreEscribe no puede ser static
 *
 * Nota: descomentar el metodo void toodle de la clase BabyRhino
 *
 *
 */
public class LearnToWalk {

    public static void toodle() {

    }

    class BabyRhino extends LearnToWalk {

        //@Override
        //public void toodle() {
        //}
    }
}
