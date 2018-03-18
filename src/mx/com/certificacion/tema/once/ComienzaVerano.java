/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.once;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
/**
 *
 * @author consultor006
 * 
 * Manda un error en tiempo de ejcuccion, recordar que sintacticamente
 * no hay problema pero semanticamente si y estos son los errores en tiempo de ejecuccion.
 */
public class ComienzaVerano {
    
    public static void main(String[] args) {
        LocalDate date  = LocalDate.of(0, Calendar.JUNE, 12);
        
        System.out.println("************************************");
        
        String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
        System.out.println("m1"+""+m1);
        
    }
    
}
