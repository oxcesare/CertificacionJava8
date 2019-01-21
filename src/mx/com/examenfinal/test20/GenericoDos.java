/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test20;

/**
 *
 * @author cesaralducinruiz
 */
public class GenericoDos<T> {

    private String uno;
    private String dos;
    private String tres;

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public String getTres() {
        return tres;
    }

    public void setTres(String tres) {
        this.tres = tres;
    }

    public static <T> GenericoDos<T> mensaje(GenericoDos<T> generico) {
        return new GenericoDos<>();
    }

}
