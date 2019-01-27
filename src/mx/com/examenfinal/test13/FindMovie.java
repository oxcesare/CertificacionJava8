/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test13;

import java.util.*;
import java.util.function.*;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase se encuentran 3 errores
 * 
 * El primero de ellos es que Function recibe dos parametros 
 * 
 * En el metodo FindMovie le hace falta el ; que cierra la sentencia 
 * 
 * Y el tercer error es que ForEch recibe un consumer como argumento 
 * y se le esta pasando un function que en esta caso es la variable 
 * printer 
 */
public class FindMovie {

    //private Function<String> printer; //esta es una variable de instancia 

    protected FindMovie() {
//        printer = s -> {
//            System.out.println(s);
//            return s;
//        };
    }

    void printMovies(List<String> movies) {
        //movies.forEach(printer); //Recordar que forEcha recibe un consumer y no un function
        //Function tiene un retorno
        //(Consumer<? super T> action
    }

    public static void main(String[] screen) {
        List<String> movies = new ArrayList<>();
        movies.add("Stream 3");
        movies.add("Lord of the Recursion");
        movies.add("Silence of the Lambdas");
        new FindMovie().printMovies(movies);
    }
}
