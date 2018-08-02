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
 * Con el objeto de la clase EjercicioInterno12 se invoca los métodos
 * de la clase Ejericio12, 
 * en primera instancia  se invoca al metodo q.methodA2(); el cual imprime "A2"
 * 
 * Si dejamos la siguiente instruccion q.methodA1(); se esta invocando al metodo propio de la clase
 * ya que se tiene que diferenciar cual es statico y cual no lo es
 * 
 * Imprime B2 porque el metodo se esta sobrescribiendo de la clase padre
 * 
 * 
 */
public class Ejercicio12 extends EjercicioInterno12 {
    
    public static void main(String[] args) {
         EjercicioInterno12 q = new Ejercicio12();
         q.methodA1(); // Si se invoca con objeto entonces corresponde al método de la Padre
         methodA1(); //Si se invoca staticamente entonces corresponde al método de la clase Hija 
         q.methodA3();
    }
    static void methodA1(){
        System.out.println("Static B1");
    }   
    
    void methodA2(){
        System.out.println("B2");
    }
}

class EjercicioInterno12 {
     
     static void methodA1(){
         System.out.println("static A1");
     }    
     void methodA2(){
         System.out.println("A2");
     }     
     
     void methodA3(){
         System.out.println("A3");
     }  
}