/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cuatro.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;

/**
 *
 * @author consultor006
 *
 * Imprime los valores originales asignados ya que el forEach lo unico que hace
 * es recorrerlos y la variable x en ningun momento se esta imprimiendo.
 *
 */
public class Test {

    public static void main(String[] args) {

        List<Double> dList = Arrays.asList(10.0, 12.0);
        DoubleFunction df = x -> x + 10;
        dList.stream().forEach((Consumer<? super Double>) df);
        dList.stream().forEach(d -> System.out.println(d));
    }
}
