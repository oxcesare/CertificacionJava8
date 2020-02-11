/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

import java.time.Instant;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author cesaralducinruiz
 * 
 * Ejemplo de la clase Time.Temporal 
 * 
 * Recordar que ChronoUnit es un Enum
 * 
 * Esta clase manda una exception en tiempo de ejecuccion 
 * 
 * Exception in thread "main" 
 * java.time.temporal.UnsupportedTemporalTypeException: 
 * Unit is too large to be used for truncation
 * 
 */
public class Whiz7 {
    
    
    public static void main(String[] args) {
        
        Instant now = Instant.now();
        now = now.truncatedTo(ChronoUnit.MONTHS);
        System.out.println(now);        
    }
            
}
