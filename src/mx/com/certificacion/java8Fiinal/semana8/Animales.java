/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana8;

/**
 *
 *  en una clase abstract no puede haber metodos
 * private 
 * 
 * 
 * @author cesaralducinruiz
 */
abstract class Animales {
    
    public static void vaccinate(){
        System.out.println("Vaccinating");
    }
    
    protected abstract void treating();
    
}
