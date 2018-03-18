/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete;

/**
 *
 * @author consultor006
 */
public class BuscaTexto {
 
    public static void main(String[] args) {
        String c ="RTAS GRATIS PORTA 6,12,18 PL";
        
        if(c.contains("RTAS")){
            System.out.println("Lo contiene");
        }else{
            System.out.println("No contiene");
        }
    }
}
