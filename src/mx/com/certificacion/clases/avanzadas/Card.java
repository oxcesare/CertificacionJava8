/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.clases.avanzadas;

/**
 *
 * @author consultor006
 * 
 * Esta clase demuestra el correcto funcionamiento para
 * recorrer un ENUM
 */
enum Card {     HEART, CLUB, SPADE, DIAMOND; } 


class X {
    public static void main(String[] args) {
        for(Card c : Card.values()) System.out.print(c+" ");
        
    }
}