/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana.uno.finaltest;

/**
 *
 * @author cesaralducinruiz
 */
public class PlaceHolder<K, V> {

    private K k;
    private V v;

    public PlaceHolder(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public static <X> PlaceHolder<X, X> getDuplicateHolder(X x) {
        return new PlaceHolder<X, X>(x, x);
    }

    public static void main(String[] args) {
        PlaceHolder<String, String> ph1 = PlaceHolder.getDuplicateHolder("b"); //1       
        PlaceHolder<String, String> ph2 = PlaceHolder.getDuplicateHolder("b"); //2     
        PlaceHolder<String, String> ph3 = PlaceHolder.getDuplicateHolder("b"); //3       
        PlaceHolder<String, String> ph4 = new PlaceHolder<String, String>("a", "b"); //4      
        PlaceHolder<?, ?> ph5 = new PlaceHolder(10, 10); //5            
    }
}
