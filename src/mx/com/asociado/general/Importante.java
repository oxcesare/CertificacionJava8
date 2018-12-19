/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.general;

import java.util.function.Function;

/**
 *
 * @author cesaralducinruiz
 * 
 * La interface function realizara una operacion con dos parametros
 * y regresara un valor aplicando el métodod apply.
 * 
 * 
 * Esta interface cuenta con más metodos que se iran analizando 
 * posteriormente.
 */
public class Importante {

    public static void main(String[] args) {
       funcion();
    }

    public static void funcion() {
        Function<Integer, Double> centigradeToFahrenheitInt = x -> new Double((x * 9 / 5) + 32);

        Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
        Integer centigrade = 5;

        System.out.println("Centigrade to Fahrenheit: " + centigradeToFahrenheitInt.apply(centigrade));
        
        System.out.println(" String to Int: " + stringToInt.apply("4"));

    }

}
