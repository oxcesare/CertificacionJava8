/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.dos;

/**
 *
 * @author consultor006
 */
public class EjercicioUno {
    public static void main(String[] args) {
        EjercicioUno q = new EjercicioUno();
        String s = "hello";
        StringBuilder sb = new StringBuilder("World"); //Si se envía sb es por referencia 
        System.out.println(q.addString(s));// si se manda la s es por valor
        System.out.println(q.addSB(sb));
        System.out.println(s);
        System.out.println(sb);        
    }
    
    public String addString(String str){
        str += "world";
        return str;
    }
    
    public StringBuilder  addSB(StringBuilder strbl){
        strbl.insert(0, "hello");
        return strbl;
    }
}
