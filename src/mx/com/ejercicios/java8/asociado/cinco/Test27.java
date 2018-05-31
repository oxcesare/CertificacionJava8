/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

import java.util.ArrayList;

/**
 *
 * @author consultor006
 *
 * En la clase Test27 se ejecuta el bloque catch debido a que al intentar
 * acceder al método get del arrayList este manda un erro porque no hay nada en
 * esa posicion.
 *
 * Si agregamos un elemento a la lista entonces ya no mandara el error
 * comentado.
 */
public class Test27 {

    public static void main(String[] args) {
        try {
            arrayOops();
            System.out.println("No need to catch");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException is catchable");
        } finally {
            System.out.println("Was it caught?");
        }
    }

    public static void arrayOops() {
        ArrayList arr = new ArrayList();
        System.out.println(arr.get(0));
    }
}
