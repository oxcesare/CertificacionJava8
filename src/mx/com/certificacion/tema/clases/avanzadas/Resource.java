/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 * 
 * Esta clase tiene implementando el metodo equals 
 * el cual recibe un objeto de la clase Resource.
 * 
 * Dependiendo el tipo de valor que estemos enviando
 * será la respuesta que nos devuelva equals. 
 * 
 * El atributo data esta inicializado y puede ser un valor enviado
 * al metodo equals.
 * 
 */
public class Resource {

    private String data = "DATA";

    String getData() {
        return data;
    }

    void setData(String data) {
        this.data = data == null ? "" : data;
    }

    boolean equals(Resource r) {
        return (r != null && r.getData().equals(this.getData()));
    }
    
    public static void main(String[] args) {
      Resource r = new Resource();
    }
}
