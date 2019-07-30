/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana5;

/**
 * 
 * Uso de clases finales 
 * 
 * la variables finales se inicializan en el constructor.
 * 
 * un objeto marcado como final no cambia de valor solo internamente
 * cambia la referencia de su estado.
 * 
 * un metodo marcado como final se oculta internamente para que no pueda ser
 * sobreescrito.
 * 
 * 
 * @author cesaralducinruiz
 * 
 */
public class MyClass {
    
    final int i;
    
    public MyClass(){
        i=0;
    }
    
    
    public MyClass(int i){
        this.i=i;
    }
    
    
    
    
    
}
