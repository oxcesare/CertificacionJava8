/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.dos;

/**
 *
 * @author consultor006
 * 
 * Si declaras metodos abstactos las clases deben de ser asbtractas tambien
 * 
 * Si un método no tiene cuerpo entonces debe de declararse como abstracto
 * 
 * Lo que si puedes tener es una clase abstracta sin métodos declarados como
 * asbractos
 */
public  class EjercicioCuatro {
    public static void main(String[] args) {
        
    }
    //public abstract void methodRun(); 
    public void methodHide(){
        
    }
    
}

abstract class TestAbstract{
    abstract void methodRun();
    abstract void methodHide();
    abstract void methodSeek();
}
