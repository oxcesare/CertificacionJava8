/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.diez;

/**
 *
 * @author consultor006
 * 
 * Ejemplo del uso de expresiones lambda e interfaces funcionales,
 * 
 * recordar que estás solo deben de llevar un método abstracto y 
 * la anotacion correspondiente. 
 * 
 * Si se declara más de un método en lda interface entonces
 * deja de ser funcional y manda un error en tiempo de compilacion, se tendría 
 * que quitar la anotacion para que se considere una interface no funcional.
 * 
 */

@FunctionalInterface
interface Sprint {
    public void sprint();
}

public class Tiger implements Sprint{
    public void sprint(){
        System.out.println("Implementacion de la interface funcional");
    }
}
