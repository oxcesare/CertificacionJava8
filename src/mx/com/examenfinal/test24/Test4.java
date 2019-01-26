/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test24;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author cesaralducinruiz
 *
 * Esta clase imprime los titulos de los libros
 *
 * tanto utlizando el siguiente codigo
 *
 * list.stream().forEach(System.out::println);
 * 
 * Si dejamos solo el codigo del forEache genera un ciclo que no termina. 
 *
 * como utlizando el iterador, recordar que el itereador es el que nos funciona
 * para iterar a traves de collections.
 *
 */
public class Test4 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Grapes of Wrath");
        list.add("1984");
        //list.stream().forEach(System.out::println);
        Iterator it = list.iterator();
        while (it.hasNext()) {
              System.out.println(it.next());
        }
        

    }

}
