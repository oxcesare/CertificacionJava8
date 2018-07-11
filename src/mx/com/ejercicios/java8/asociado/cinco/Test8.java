/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 * 
 * En esta clase se declaran 2 atributos size y shape 
 * entonces cambiand de valor dentro del constructor, recordar
 * que el constructor de una clase es lo primero que se ejecuta 
 * a exception de cuando existe un bloque estatico. 
 */
public class Test8 {

    int size = 1;
    String shape = "none";

    Test8(){
        size = 10;
        shape = "round";  
    }
    
    public void Test() {
       
    }
    
    public int getSize(){
        return this.size;
    }
    
    public String getShape(){
        return this.shape;
    }

    public static void main(String[] args) {
         Test8 q = new Test8();
         System.out.println(q.getSize()+" " + q.getShape());                 
    }

}
