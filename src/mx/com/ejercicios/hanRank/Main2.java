/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author consultor006
 */
public class Main2 {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        
        
        String[] strDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
            "Friday", "Saturday"};
        // Day_OF_WEEK starts from 1 while array index starts from 0
        System.out.println("Current day is : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
