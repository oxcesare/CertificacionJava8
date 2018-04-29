/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cuatro.Stream;

/**
 *
 * @author consultor006
 */
class Printer<String> {
    private String t;
    Printer(String t){
        this.t = t;
    }
}


class Pruebas {
    public static void main(String[] args) {
        Printer<Boolean> obj = new Printer<>(true);
        System.out.println(obj);
    }
}