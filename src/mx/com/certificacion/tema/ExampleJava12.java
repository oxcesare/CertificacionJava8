/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema;

/**
 *
 * @author cesaralducinruiz
 */
public class ExampleJava12 {

    public static void switchAssignment() {
        final int value = 2;
        String numericString;

        switch (value) {
            case 1
                ->
                numericString = "one";
            case 2
                ->
                numericString = "two";
            case 3
                ->
                numericString = "three";
            default
                ->
                numericString = "N/A";
        }

        System.out.println("value:" + value + " as string: " + numericString);
    }

}
