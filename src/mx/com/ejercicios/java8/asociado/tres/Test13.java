/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.tres;

/**
 *
 * @author consultor006
 * 
 * A partir de la version 7 de Java un swith evalua
 * Int and String 
 * 
 * Se detalla a continuacion.
 */
public class Test13 {
    public static void main(String[] args) {
        String a ="stringy";
        boolean b;
        switch(a){
            case "stringy":
                System.out.println("String work");
                break;
            case "string":
                System.out.println("String don´t work");                
        }
    }
}
