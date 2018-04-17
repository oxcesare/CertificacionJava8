/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.dos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author consultor006
 *
 * Clase que demuesta el uso del ArrayList
 * 
 * No compila porque ArrayList no es statica 
 * y la estamos invocando dentro de un entorno statico.
 * 
 * Por ello el error en el ciclo for.
 */
public class EjercicioNueve {

    List<String> dogs = new ArrayList<String>();

    public static void main(String[] args) {
        String dog1 = "German Shephard";
        String dog2 = "Husky";
        String dog3 = "Mutt";

        Character dog4 = new Character('s');

        EjercicioNueve nueve = new EjercicioNueve();
        nueve.dogs.add(dog1);
        nueve.dogs.add(dog2);
        nueve.dogs.add(dog3);
        
        for(int i=0; i<dogs.size(); i++){
            System.out.println(q.dogs.get(i)+",");
        }
    }
}
