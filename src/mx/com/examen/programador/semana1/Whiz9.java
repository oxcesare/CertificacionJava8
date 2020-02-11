/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author cesaralducinruiz
 */
public class Whiz9 {
    public static void main(String[] args) {
        LocalDate ldt = LocalDate.of(2015, 3, 1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyyy");
        System.out.println(ldt.format(format));
    }
}
