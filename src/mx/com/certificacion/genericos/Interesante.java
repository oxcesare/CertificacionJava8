/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.genericos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author consultor006
 * 
 * Esta clase tiene una lista de Strings, 
 * despues tiene una implementacion de la interface funcional 
 * Function, realiza una operacion y posteriormente impreme los valores.
 * 
 * Este ejemplo imprime aeiou, primero porque recordar que list imprime
 * de acuerdo a como se ingresaron los datos y segundo porque 
 * el metodo apply se aplica al resultado de la funcion y como no hay nada
 * que indique que se haga cambio sobre los datos entonces se conservan los valores originales.
 * 
 * Para que aplique los cambios que se declaran en la interface funcional 
 * se debe de realizar un cambio sobre la lista original.
 */
public class Interesante {

    public static void main(String[] args) {
        List<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list -> list.subList(2, 4);
        f.apply(vowels);
        vowels.forEach(System.out::print);
    }
}
