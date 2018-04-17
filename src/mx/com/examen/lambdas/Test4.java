/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.Arrays;
import java.util.List;


/**
 *
 * @author consultor006
 * 
 * El método flatMap espera una funcion  el cual toma el elemento
 * y crea un stream
 * 
 * 
 */
public class Test4 {

    public static void main(String[] args) {
        List<List<Book>> books = Arrays.asList(Arrays.asList(new Book("Windmills of the Gods", 7.0), 
                new Book("Tell me your dreams", 9.0)), Arrays.asList(new Book("There is a hippy on the highway", 5.0), 
                        new Book("Easy come easy go", 5.0)));
        double d = books.stream().flatMap(bs->bs.stream()).mapToDouble(book->book.getPrice()).sum(); 
        System.out.println(d);
    }
}
