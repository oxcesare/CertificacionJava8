/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


/**
 *
 * @author cesaralducinruiz
 */
public class Whiz12 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, Month.JANUARY, 31).plusDays(1);
        System.out.println(date);
    }
}
