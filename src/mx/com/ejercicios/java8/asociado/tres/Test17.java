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
 * En esta clase  no se considera ambiguedad de métodos
 * debido a que el primer método go representa 
 * un arreglo de parametros del tipo string
 * y el segundo método solo es un parametro del tipo String.
 * 
 */
public class Test17 {
    public static void main(String[] args) {
        Test17 q = new Test17();
        q.go(5, "this, that");
        q.go(6, "this");
    }
    
    public void go(int i, String ...k){
        for(String l:k){
            System.out.println(l);
        }
    }    
    public void go(int i, String k){
        System.out.println(k+" done");
    }
}
