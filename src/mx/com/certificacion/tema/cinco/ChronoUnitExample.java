/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cinco;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author cesaralducinruiz
 * 
 * ChronoUnit es un conjunto de enum aplicadas para 
 * obtener valores que podemos aplicar para obtener medidas de tiempo
 */
public class ChronoUnitExample {
    
    
    public static void main(String[] args) {
         Duration duration = Duration.between(LocalTime.MIDNIGHT,LocalTime.NOON);
         System.out.println(duration.get(ChronoUnit.SECONDS));
        
        System.out.println(""+ChronoUnit.CENTURIES);
    }
    
}
