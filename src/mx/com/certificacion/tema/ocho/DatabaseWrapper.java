/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 */
public class DatabaseWrapper {

    static String url = "jdbc://derby://localhost:1527//mydb";

    static DatabaseWrapper getDatabase() {
        System.out.println("Getting DB");
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getDatabase().url);
    }
}
