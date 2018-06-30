/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.interfaces.funcionales.dos;

import java.util.function.Predicate;

/**
 *
 * @author consultor006
 */
public class Main3 {

  public static void main(String[] args) {
    Predicate<String> i  = (s)-> s.length() > 5;
   
    System.out.println(i.test("java2s.com "));
  }
}