/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.diez;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 *
 * @author consultor006
 */
public class Test3 {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2017, 06, 02, 6, 0, 0);  //Jun 2nd, 6AM. 
        System.out.println("ldt"+" " +ldt.toString());
        ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0); //Objeto de ZoneOffset al que se le setea hora/minutos
        System.out.println("nyOffset"+" "+nyOffset.toString());
        
        ZoneId nyZone = ZoneId.of("America/New_York");
        System.out.println("nyZone"+" "+nyZone.toString());
        
        OffsetDateTime nyOdt = ldt.atOffset(nyOffset); //Crea un objeto OffsetDateTime a partir de un LocalDateTime  y un ZoneOffSet
        
        ZonedDateTime nyZdt = ldt.atZone(nyZone);
        Duration d = Duration.between(nyOdt, nyZdt);
        
        System.out.println("Durantion d"+ " " + d.toString());
        
        
        
    }
}
