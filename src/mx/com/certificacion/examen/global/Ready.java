/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global;

import java.util.function.Supplier;

/**
 *
 * @author consultor006
 *
 * La siguiente clase contiene un error de sintaxis e indica cuantos movimientos
 * necesitamos realizar para que corra correctamente.
 * 
 * La interface funcional Supplier<T> indica que recibe un generico y ese generico
 * no puede ser del tipo primitivo.
 * 
 * Por lo tanto si queremos hacer esto Supplier<double> el compilador mandara un error
 * 
 * 
 * 
 */
public class Ready {

    private static double getNumber() {
        return .007;
    }

    public static void math() {
        Supplier<Double> s = Ready::getNumber; // se utiliza el nombre de la clase :: llamada al método
        //Otro error es que Supplier es una interface funcional y recibe un Double objeto
        //mas no un double primitivo.
        double d = s.get();
        System.out.println(d);
    }

    
    public static void main(String[] args) {
        math();
    }
}
