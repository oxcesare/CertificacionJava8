/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema;

/**
 *
 * @author consultor006
 * 
 * Este codigo compila y se ejecuta sin problema ya que 
 * es una clase que recibe un tipo de dato, se inicializa un atributo del tipo de dato
 * que va a recibir dentro del constructor de la clase y se crean 
 * dos instancia de este con su respectivo valor.
 * 
 */
public class Hello<T> {
    T t;
    
    public Hello(T t){
        this.t=t;
    }

    @Override
    public String toString() {
        return t.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        System.out.println(new Hello<String>("Hola"));
        System.out.println(new Hello("There"));
    }    
}
