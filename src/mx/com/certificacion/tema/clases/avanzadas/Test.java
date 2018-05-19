/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

import java.util.List;

/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {
        String c = "[ERR]";
        String d = "ERRsdasd";

        if (c.indexOf("[ERR]") > -1) {
            System.out.println("SI 1");
        }

        if (d.indexOf("ERRsdasd") > -1) {
            System.out.println("SI  2");
        }
    }

    public static void myMethod(int x) throws ClassNotFoundException, NoSuchFieldException //Specify throws clause here  
    {
        try {
            if (x == 0) {
                throw new ClassNotFoundException();
            } else {
                throw new NoSuchFieldException();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void assertTestOne(List v) {
        assert v != null : v == null;
    }

    public void assertTestTwo(List v) {
        //assert v : v.add("1234"); //no se pueden hacer asignaciones en la evaluacion de un assert
    }

}
