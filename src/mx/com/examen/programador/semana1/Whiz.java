/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

/**
 *
 * @author cesaralducinruiz
 * 
 * ejemplo de código de clase interna 
 * 
 * Error en la declaracion del metodo print en la clase
 * interna
 * 
 * no se permiten metodos estaticos dentro de una clase interna.
 */
public class Whiz {
    
    
    
    static int i=0;
    
    public class Inner{
        
        public static void print(){
            System.out.println(""+i);
        }
    }
    
    public static void main(String[] args) {
        Inner in = new Whiz().new Inner();
        in.print();
    }
   
    
}
