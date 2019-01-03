/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis.Exceptions;

import java.util.Optional;

/**
 *
 * @author cesaralducinruiz
 * 
 * La clase Optional es final y tiene 3 metodos
 * es generica y puedes enviarle como parametro un tipo de dato
 * 
 * Esta clase TestOptional tiene algunos métodos que podemos implementar.
 * 
 * El metodo isPresent es similar a variable == null 
 * 
 */
public class TestOptional {
    
    public static void main(String[] args) {
        muestraA();
    }
    
    
    /**
     * Este metodo comprueba usando la clase optional 
     * si lo que esta recibiendo como parametro es un String.
     */
    public static void muestraA(){
        String nombre ="Cesar";
        Integer x =1;
        Optional<String> oNombre  = Optional.of(nombre);
        System.out.println("oNombre"+ " " +  Optional.of(nombre));
    }
    
}
