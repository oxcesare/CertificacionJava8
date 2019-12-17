/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana.uno.finaltest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author cesaralducinruiz
 * 
 * Esta clase tiene el siguiente error:
 * 
 * al querer agrgegar dos veces la misma clave 
 * en
 * Collectors.toMap 
 * 
 * manda una exception.
 * 
 * sería una exception Unchecked ya que se genera en tiempo
 * de ejecucción.
 */

public class Test {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", 5.0),
                new Book("Gone with the wind", 10.0),
                new Book("Atlas Shrugged", 15.0));
        books.stream().collect(Collectors.toMap((b -> b.getTitle()), b -> b.getPrice()))
                .forEach((a, b) -> System.out.println(a + " " + b));

    }

}
