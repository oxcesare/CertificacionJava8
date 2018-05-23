/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.tres;

/**
 *
 * @author consultor006
 * 
 * El error esta en el constructor con dos parametros int 
 * de la clase Subclass.
 */
public class SubClass extends SuperClass {

    int i, j, k;

//    public SubClass(int m, int n) {
//        i = m;
//        j = m; //1      
//    } 

    public SubClass(int m) {
        super(m); //2 
    } 
} 

class SuperClass{
    
    int i, j, k;
      
     public SuperClass(int m) {
        
    }
     
     public SuperClass(int m, int n) {
        i = m;
        j = m; //1      
    }
}
