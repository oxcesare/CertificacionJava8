/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.clases.avanzadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.*;

/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {
        String name = "bob";
        String val = null; //Insert code here 
        System.out.print(val);

        /**
         * Para que el código anterior imprima BOB utilizando interfaces
         * funcionales
         *
         */
        Supplier<String> s = name::toUpperCase;
        val = s.get();

        /**
         * No se puede utilizar Function debido a que esta recibe dos parametros
         *
         */
        //****************************************************************************
        BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
        List<String> names = new ArrayList<>();
        names.add("Bill");
        names.add("George");
        names.add("Obama");
        
        /**
         * Recordar que en un flujo del uso de operaciones terminales 
         * primero se crea un stream, después se puede invocar a tantas operaciones
         * intermedias se necesiten y al final se debe invocar una operacion terminal para
         * que se ejecute el flujo. 
         */
        String finalvalue = names.stream().reduce(name, bo);
        System.out.println(finalvalue);                
    }
}
