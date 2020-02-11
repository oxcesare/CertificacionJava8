/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

/**
 *
 * @author cesaralducinruiz
 */
public class Whiz8 {

    public static void main(String[] args) {
        Year y = Year.of(2014); //Obtiene la instancia de un metodo 
        LocalDate date = y.now(); //Error no se puede convertir Year a LocalDate
        System.out.println(date );
                
    }
}
