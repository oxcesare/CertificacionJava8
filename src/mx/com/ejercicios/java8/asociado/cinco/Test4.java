/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

import java.util.*;

/**
 *
 * @author consultor006
 * Para este ejercicio se imprime "Caught Outer Exception", debido 
 * a que el bloque try-catch interior se esta creando una nueva instancia
 * de un ArrayIndexOutOfBoundsException por lo que se sale al bloque principal
 * al no ser el tipo de exception que se tiene que lanzar, es decir el catch interno
 * lanza un IndexOutOfBoundsException y cacha un ArrayIndexOutOfBoundsException y 
 * eso esta mal por lo que se sale al bloque externo Catch.
 * 
 *
 * 
 * Si se obtuviera el tipo de exception que lanzo en el bloque try interno
 * ahí se quedaría la ejeccucción de este código.
 * 
 * Si no tuviera un try externo y no se invoca la exception que debe de ser
 * entonces manda un error en tiempo de ejecuccion.
 * 
 * 
 */
public class Test4 {

    public static void main(String[] args) {
        try {
            try {
                ArrayList arr = new ArrayList();
                arr.add("Rugby");
                System.out.println(arr.get(1));
            } catch (IndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException();
            } catch (Exception e) {
                System.out.println("Caught Inner Exception");
            }
        } catch (Exception e) {
           System.out.println("Caught Outer Exception");
        }
    }

}
