/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 */
public class Test7 {

    public static void main(String[] args) {
        boolean a = true;
        boolean b =a;

        //En este caso el simbolo de = representa
        //una validacion de comparacion
        
        if(a==b){
            System.out.println("Objetos");
        }
        
        System.out.println(""+!b);
        if (a = b) {
            System.out.println("Firts if"); 
        } else if (b = a) {
            System.out.println("Second if");
        } else if (b = !a) {
            System.out.println("Third if");
        } else if (a == !b) { //Comparacion a nivel de objetos 
            System.out.println("Fourth if");
        }        
        
        //El while puede evaluar una expresion booleana pasando como parametro un
        //Atributo, si se le pasa directo el valor de false o true 
        //manda un error de compilacion 
        
        Boolean bool = false;

        while(bool){

        }
        
        if(false){
            
        }

    }
}
