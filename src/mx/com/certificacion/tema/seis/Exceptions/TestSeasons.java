/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis.Exceptions;

/**
 *
 * @author consultor006
 * 
 * Clase Test para validar las assertions
 */

public class TestSeasons {
    
    public static void main(String[] args) {        
        test(Seasons.SPRING);
    }
    public static void  test (Seasons s){
        switch(s){
            case SPRING:
                break;
            case FALL:
                System.out.println("Shoter hours");
            break;
            case SUMMER:
                System.out.println("longer hours"); 
            break;
            default:
                assert  false: "Invalid season";
        }
    }
}
