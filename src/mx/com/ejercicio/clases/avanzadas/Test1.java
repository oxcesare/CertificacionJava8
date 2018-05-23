/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicio.clases.avanzadas;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author consultor006
 */
public class Test1 {

    public static void main(String[] args) {
        Locale myloc = new Locale.Builder().setLanguage("en").setRegion("UK").build(); //L1 
        ResourceBundle msgs = ResourceBundle.getBundle("mymsgs", myloc);
        Enumeration<String> en = msgs.getKeys();
        while (en.hasMoreElements()) {
            String key = en.nextElement();
            String val = msgs.getString(key);
            System.out.println(key + " : " + val);
        }
    }

}
