/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author consultor006
 *
 * En esta clase tiene el uso de Optional para despues aplicar las operaciones
 * intermedias y terminales
 *
 * Optional<Collection>
 *
 * Optional<String>
 *
 * String se considera para este caso como una collection
 */
public class Test3 {

    public static void main(String[] args) {
        
        List myList = new ArrayList();
        myList.add(Integer.MAX_VALUE);
        myList.add(Integer.MIN_VALUE);
       // spot(myList);
    }

    private static void spot(Optional<Collection> x) {
        x.filter(y -> !y.isEmpty())
                .map(y -> 8)
                .ifPresent(System.out::println);
    }

    private static void spot2(Optional<String> x) {
        x.filter(y -> !y.isEmpty())
                .map(y -> 8)
                .ifPresent(System.out::println);
    }

}
