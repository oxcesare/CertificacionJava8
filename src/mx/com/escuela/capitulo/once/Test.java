/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.once;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("zzzz");
        System.out.println(sdf.format(new Date()));
    }

}
