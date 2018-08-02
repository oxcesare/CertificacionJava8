/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.nueve;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author consultor006
 */
public class Objetos {

    public static void main(String[] args) {
        Instant ins = Instant.parse("2015-06-25T16:43:30.00z");
        Instant ins2 = ins;                
        System.out.println(ins);
        System.out.println(ins2);
        ins2.plus(2, ChronoUnit.HOURS);        
        System.out.println("**********************");
        System.out.println(ins2);
    }
}
