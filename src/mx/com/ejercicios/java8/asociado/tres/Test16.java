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
 * En la herencia puedes sobrescribir el metodo de la clase padre o puedes ocupar directamente
 * la funcionalidad del método
 * 
 * En la herencia no es necesario sobrescribir los metodos de la clase padre
 */


public class Test16 extends SubTest16 {
    public static void main(String[] args) {
         Test16 qq = new Test16();
         qq.out();
    }
    
    /**
     * Se deja este metodo para demostrar que se puede sobreescribir el metodo
     * y cambiar la funcionalidad
     */
    public void out(){
        System.out.println("2 out");
    }
}

class  SubTest16 {
    protected void out(String x){
        System.out.println("1 out");
    }
}

    