/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.progol.ganador;

/**
 *
 * @author consultor006
 *
 * Clase Melate para generar 6 números aleatorios para Jugar Melate Semanal.
 *
 * Ganar - to Win
 */
public class Melate {

    public static void main(String[] args) {
        int numeros = 0;
        int arr[] = new int[6];

        for (int i = 0; i <= 5; i++) {
            numeros = (int) (Math.random() * 56) + 1;
            System.out.println("Números" + " " + numeros);
        }

    }
}
