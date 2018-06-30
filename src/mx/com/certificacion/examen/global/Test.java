/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global;

import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {
        Period p = Period.between(LocalDate.now(), LocalDate.of(2018, Month.MAY, 1));
        System.out.println(p);
        Duration d = Duration.between(LocalDate.now(), LocalDate.of(2018, Month.MAY, 1));
        System.out.println(d);
    }

}
