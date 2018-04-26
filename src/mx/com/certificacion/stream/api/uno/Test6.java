/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.stream.api.uno;

import java.time.*;

/**
 *
 * @author consultor006
 */
public class Test6 {

    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);
        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);
        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
    }
}
