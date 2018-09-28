/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class Listas {

    public static void main(String[] args) {
        List<String> listaNumeros = new ArrayList<String>();
        int c = 0;
        int i = 0;
        listaNumeros = obtenerListaNumeros("C:\\Revisión KIT a crédito Líneas que no Tenemos\\Procesa Líneas\\Region8.txt");

        List<String> proceso = new ArrayList<String>();
        int j = 0;
        proceso = obtenerListaNumeros("C:\\Revisión KIT a crédito Líneas que no Tenemos\\Procesa Líneas\\Region8_8.txt");

        if (listaNumeros.size() > 0) {
            listaNumeros.removeAll(proceso);
        }

        for (String listaFinal : listaNumeros) {
            System.out.println(listaFinal);
        }
    }

    public static List<String> obtenerListaNumeros(String pathFile) {
        List<String> lista = new ArrayList<String>();
        String cadena;
        FileReader f;
        try {
            f = new FileReader(pathFile);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                lista.add(cadena);
            }
            b.close();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return lista;
    }
}
