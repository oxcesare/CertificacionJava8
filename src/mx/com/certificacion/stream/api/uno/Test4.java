/*   
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.stream.api.uno;

import java.time.*;
import java.time.temporal.UnsupportedTemporalTypeException;

/**
 *
 * @author consultor006
 */
public class Test4 {

    public static void main(String[] args) {

        try {
            Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
            System.out.println(p);
            Duration d = Duration.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
            System.out.println(d);
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println(""+e.getMessage().toString());
        }
    }

}
