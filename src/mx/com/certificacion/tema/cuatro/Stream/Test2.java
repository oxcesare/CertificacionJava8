/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cuatro.Stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class Test2 {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("Gone with the wind", 10.0), 
                new Book("Atlas Shrugged", 10.0), new Book("Freedom at Midnight", 5.0), 
                new Book("Gone with the wind", 5.0));
        
        double sum = books.stream().mapToDouble(b->b.getPrice()>5?b.getPrice():0.0).sum();        
        System.out.println(""+sum);
        System.out.println("***********************************************************");
        double suma = books.stream().mapToDouble(b->b.getPrice()).filter(b->b>5.0).sum();        
    }
}
