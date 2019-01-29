/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test27;

import java.util.function.DoubleSupplier;
import java.util.stream.*;

/**
 *
 * @author cesaralducinruiz
 *
 * LongsStream es una clase que almacena un stream.
 *
 * Long tiene metodos de operacion tal como avarage
 *
 *
 * Long tiene metodos de tipo de objeto tal como average
 *
 * y posteriormente se puede acceder a metodo sde tipo double.
 *
 * tal como se describen a continuacion
 */
public class Test2 {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(6, 10);
        LongStream longs = stream.mapToLong(i -> i);
        System.out.println(longs.average().getAsDouble());

        //System.out.println(longs.average().orElseGet(DoubleSupplier other);
        System.out.println(longs.average().isPresent());

        //System.out.println(longs.average().ifPresent(consumer));
    }
}
