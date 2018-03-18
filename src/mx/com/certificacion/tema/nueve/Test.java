/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.nueve;

/**
 *
 * @author consultor006
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.processPhoneNumber("2288603055");
    }
    public void a() {
        try {

        } catch (Exception e) {
        } finally {

        }
    }
    public void b() {
        try {
        } finally {
        }
    }
    public void processPhoneNumber(String number) {
        assert number != null && number.length() == 10 : "Invalid phone number";        
    }
}
