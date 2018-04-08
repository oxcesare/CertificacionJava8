/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 * En una clase solo puede haber una llamada al constructor de la clase
 * padre.
 * 
 * Recordar que debe de ser del mismo tipo que lo invoca la subclase.
 */
class SuperClass {

    
    public SuperClass(int a, int b){
        
    }
    
    
    public SuperClass(int m){
        
    }
    
}

public class SubClass extends SuperClass {

    int i, j, k;

    public SubClass(int m, int n) {
        i = m;
        j = m;
    } //1 
    public SubClass( int m )  {   super(m );   
    } //2
}
