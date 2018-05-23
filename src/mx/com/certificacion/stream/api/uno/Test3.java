/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.stream.api.uno;

import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 *
 * @author consultor006
 * 
 * La clase period no tiene el campo Day, tiene dias, meses,
 * semanas y años  Period.ofMonths(0)
 * 
 * TemporalUnit no tiene el atributo DAY
 * 
 * Period.ofDays(now) --> mala implementación del metodo ofDays de Periodo
 * 
 * El metodo ofDatys de Periodo recibe un parametro entero 
 * no un Instance que es lo que representa el objeto now. 
 * 
 */

public class Test3 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        //Instant now2= now.truncatedTo(Period.ofDays(now));
        //System.out.println(now2);
    }
}
