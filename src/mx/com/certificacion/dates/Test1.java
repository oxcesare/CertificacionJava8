/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.dates;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author consultor006
 */
public class Test1 {

    public static void main(String[] args) {
        LocalDateTime ld1 = LocalDateTime.of(2015, Month.MARCH, 8, 2, 0);
        ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
        LocalDateTime ld2 = LocalDateTime.of(2015, Month.MARCH, 8, 3, 0);
        ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
        long x = ChronoUnit.HOURS.between(zd1, zd2);
        System.out.println(x);

    }

}
