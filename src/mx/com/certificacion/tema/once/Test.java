/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.once;

import java.time.*;

/**
 *
 * @author consultor006
 */
public class Test {
    
    public static void main(String[] args) {
        
        LocalDate d = LocalDate.now();
        System.out.println("d"+""+d);
        
        LocalDateTime dt  = LocalDateTime.now();
        System.out.println("dt"+dt);
    }
    
}
