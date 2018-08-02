/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.genericos;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author consultor006
 */

class BeanGenerico {
    
}

class OtroBeanGenerico {
    
}


public class MismosGenericos {
    public static void main(String[] args) {
     
        /**
         * Cualquier cosa que represente un Objeto,
         * pero no uno como tal 
         */
        List<?> lista = new ArrayList<String>();
        
        
        /**
         * La segunda lista acepta object que son la clase padre de Java
         * 
         */
        List<Object> listaDos = new ArrayList<Object>();
        OtroBeanGenerico gen = new OtroBeanGenerico();
        String generico = new String();
        listaDos.add(gen);
        listaDos.add(generico);
        
        List<? extends Number> intList = new ArrayList<>();
               
    }    
}
