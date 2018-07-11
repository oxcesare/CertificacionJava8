package mx.com.certificacion.interfaces.funcionales.dos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author consultor006
 * Esta clase crea un objeto de la interface funcional Consumer 
 * esta tiene la funcionalidad mediante expresiones lambda de imprimir elementos.
 * 
 * La interface funcional tiene un metodo llamado accept que recibe un  generico
 * como argumento.
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionExample {

    public static void main(String args[]) {
        Consumer<Integer> consumer = i -> System.out.print(" " + i);
        List<Integer> integerList = Arrays.asList(new Integer(1),
                new Integer(10), new Integer(200),
                new Integer(101), new Integer(-10),
                new Integer(0));
        printList(integerList, consumer);
    }

    public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
        for (Integer integer : listOfIntegers) {
            consumer.accept(integer);
        }
    }
}
