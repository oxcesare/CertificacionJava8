/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

import java.util.stream.BaseStream;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author consultor006
 */
public class Test1 {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", 5.0),
                new Book("Gone with the wind", 10.0),
                new Book("Atlas Shrugged", 15.0));
        books.stream().collect(Collectors.toMap((b -> b.getTitle()), b -> b.getPrice())).forEach((a, b) -> System.out.println(a + " " + b));
    }
}
