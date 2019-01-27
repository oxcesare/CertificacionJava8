/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test13;

import java.util.function.*;


/**
 * 
 * @author cesaralducinruiz
 * 
 * En esta clase el error se encuentra en la invocacion al metodo 
 * accept ya que no se encuentra en la definicion de la interface funcional.
 * 
 * UnaryOperator tiene un unico metodo identity()
 * 
 */
public class Doll {

    private int layer;

    public Doll(int layer) {
        super();
        this.layer = layer;
    }

    public static void open(UnaryOperator<Doll> task, Doll doll) {
//        while ((doll = task.accept(doll)) != null) {
//            System.out.print("X");
//        }
    }

//    public static void main(String[] wood) {
//        open(s -> {
//            if (s.layer <= 0) {
//                return null;
//            } else {
//                return new Doll(s.layer--); }, 
//            new Doll(5));
//    }

}
