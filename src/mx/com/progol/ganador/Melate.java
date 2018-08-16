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
 * En el ultimo resultado de melate fue : 03, 14 16 23 40 45 47 
 * 
 * tomo 1 de la primera casiilla
 * dos de l segunda
 * tomo 1 de la tercer 
 * 3 de la ultima casilla 
 * 
 * ultimo juego 4,16,19,27,30,35 12 de agosto 2018 
 * 
    3201	08/08/2018	03 14 16 23 40 45-47
    3200	05/08/2018	13 15 37 39 50 52-34
    3199	01/08/2018	19 35 36 38 43 53-55
    3198	29/07/2018	25 39 43 44 45 53-26
    3197	25/07/2018	15 21 38 40 46 50-05
    3196	22/07/2018	24 28 29 44 51 53-39
    3195	18/07/2018	01 09 15 34 44 52-05
    3194	15/07/2018	02 07 12 19 29 40-45
    3193	11/07/2018	18 27 35 41 45 49-47
    3192	08/07/2018	08 21 33 41 48 51-303
    3191	04/07/2018	07 21 26 37 48 52-30
    3190	01/07/2018	11 15 20 36 39 45-27
    3189	27/06/2018	22 27 33 37 43 52-54
    3188	24/06/2018	13 30 31 33 46 50-26
    3187	20/06/2018	11 16 19 22 26 32-01
* 
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
