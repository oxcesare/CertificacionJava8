/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author cesaralducinruiz
 */
public class TestDateFormat {
    
    
    public static void main(String[] args) {
        
        LocalDate valDay = LocalDate.of(2018, 2, 14);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-uuuu");        
        System.out.println(valDay.format(formatter));
        
        
        
    }
    
    public void tiposDate (){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime dateTime = localDate.atStartOfDay();
        ZonedDateTime zoneDate = ZonedDateTime.now();
        
        
    }
}
