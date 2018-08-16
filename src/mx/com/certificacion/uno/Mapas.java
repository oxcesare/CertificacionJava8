/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.uno;

import java.util.Arrays;
import java.util.List;
import static javax.swing.event.DocumentEvent.EventType.INSERT;
import static javax.swing.text.html.HTML.Attribute.CODE;
import mx.com.certificacion.functional.programming.Book;

/**
 *
 * @author consultor006
 * El objeto book hace rerencia a la clase Book y con ello podemos accesar a los elementos
 * de esa clase. 
 *
 */
public class Mapas {

    public static void main(String[] args) {
        List<List<Book>> books = Arrays.asList(Arrays.asList(new Book("Windmills of the Gods", 7.0),
                new Book("Tell me your dreams", 9.0)),
                Arrays.asList(new Book("There is a hippy on the highway", 5.0),
                        new Book("Easy come easy go", 5.0)));
        double d = books.stream().flatMap(bs -> bs.stream()).mapToDouble(book -> book.getPrice())
                .sum();
        System.out.println(d);
    }

}
