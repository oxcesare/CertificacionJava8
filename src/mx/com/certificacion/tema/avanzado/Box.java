/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

/**
 *
 * @author consultor006
 */
public class Box<T> {
    T value;
    
    public Box(T value){
        this.value= value;
    }
    
    public T getValue(){
        return value;
    }
    
    public static void main(String[] args) {
        Box<String> one = new Box<>("String");
        Box<Integer> two = new Box<>(123);
        System.out.println(one.getValue());
        System.out.println(two.getValue());                
    }
}


