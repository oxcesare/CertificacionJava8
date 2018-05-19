/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.tres.genericos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author consultor006
 */
public class Intercambiando {
 
    public static void main(String[] args) {
    
        //Creo un Mapas
        Map<String,String> mapa = new HashMap<String, String>();
        mapa.put("1", "A");
        mapa.put("2", "B");
        mapa.put("3", "C");
        mapa.put("4", "D");
        
        //Creo una lista de tipo ArrayList y guardo los valores del Mapa.
        List<String> lista = new ArrayList(mapa.keySet());        
        
        System.out.println("Tamaño de la lista"+" "+ lista.size());
        //Recorro la lista e imprimo los valores        
        for (String string : lista) {
            System.out.println("Lista Proveniente de un Mapa"+" "+lista.toString());
        }
    }    
}
