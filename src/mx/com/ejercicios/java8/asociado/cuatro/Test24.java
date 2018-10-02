/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cuatro;

/**
 *
 * @author consultor006
 * 
 * Clase que muestra el ejemplo de asignaciones booleanas
 * dentro de un if(a=c !=b)
 * 
 * Recorda que un valor booleano por default es true
 */
public class Test24 {
    
    static boolean a=true;
    static boolean b =true;
    static boolean c =false;
        
    public static void main(String[] args) {
        System.out.println("a"+a);
        if(a==b){
            System.out.println("a==b");
        }else{
            
        }
        
        if(a==b !=c){
            System.out.println("One is true");
        }else{
            System.out.println("One is false");
        }
        
        //Asignacion de a=c
        if(a =c !=b){
            System.out.println("Two is true");
         }else{
            System.out.println("Two is false");
        }
    }
    
}
