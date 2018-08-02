/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.dates;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author consultor006
 */
public class Test1 {

    public static void main(String[] args) {
        Instant ins = Instant.parse("2015-06-25T16:43:30.00z");
        Instant nuevo = ins.plus(10, ChronoUnit.HOURS);
        System.out.println("Anterior"+""+ins);
        System.out.println("Nuevo"+""+nuevo);
        
    }

}
