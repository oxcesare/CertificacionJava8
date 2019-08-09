/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Clase para ejemplo de FlatMap
 *
 * @author cesaralducinruiz
 */
public class Persona {

    private String nombre;
    private List<Viaje> lista = new ArrayList<Viaje>();

    public String getNombre() {
        return nombre;
    }

    public void addViaje(Viaje v) {
        lista.add(v);
    }

    public List<Viaje> getLista() {
        return lista;
    }

    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
