/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author consultor006
 */
public class SolucionDos {

    
      private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int[][] arr3 = new int[3][0]; //Tomar 3 elementos de la posicion 0

        int sumaX = 0;
        int contador = 0;
        int fila = 0;
        int a = 1;
        int[] p1 = new int[0];
        int[][] p2 = new int[0][1];
        int[][] p3 = new int[0][2];

        //Filas
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            //Columnas
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        calculaRelojDeArena(arr);
    }

    public static void calculaRelojDeArena(int[][] arr) {
        int suma = 0;
        int longitud = arr.length;
        int t = 0;
        int x = 3;
        int p = 0;
        int f = 0;
        int[] relojes = new int[5];
        int[] relojFinal = new int[5];

        for (int i = 0; i < 6; i++) {
            if (i == 4 || i == 5) {

            } else {
                if (i == 0) {
                    f = 1;
                    for (int r = 0; r < 4; r++) {
                        for (int a = t; a < x; a++) {
                            suma += arr[0][a];
                        }
                        for (int a = t; a < x; a++) {
                            if (a == f) {
                                suma += arr[1][a];
                            }
                        }
                        for (int a = t; a < x; a++) {
                            suma += arr[2][a];
                        }

                        relojes[r] = suma;
                        suma = 0;
                        t++;
                        x++;
                        f++;

                    }
                    int numeromayor = relojes[0];

                    for (int mayores = 0; mayores < relojes.length; mayores++) {
                        if (relojes[mayores] > numeromayor) {
                            numeromayor = relojes[mayores];
                        }
                    }

                    relojFinal[0] = numeromayor;

                }
                if (i == 1) {
                    suma = 0;
                    t = 0;
                    x = 3;
                    f = 1;
                    for (int r = 0; r < 4; r++) {
                        for (int a = t; a < x; a++) {
                            suma += arr[1][a];
                        }
                        for (int a = t; a < x; a++) {
                            if (a == f) {
                                suma += arr[2][a];
                            }

                        }
                        for (int a = t; a < x; a++) {
                            suma += arr[3][a];
                        }

                        relojes[r] = suma;
                        suma = 0;
                        t++;
                        x++;
                        f++;
                    }

                    int numeromayor = relojes[0];

                    for (int mayores = 0; mayores < relojes.length; mayores++) {
                        if (relojes[mayores] > numeromayor) {
                            numeromayor = relojes[mayores];
                        }
                    }

                    relojFinal[1] = numeromayor;

                }

                //Siguiente cuadrante de Relojs de arena
                if (i == 2) {
                    f = 1;
                    suma = 0;
                    t = 0;
                    x = 3;
                    for (int r = 0; r < 4; r++) {
                        for (int a = t; a < x; a++) {
                            suma += arr[2][a];
                        }
                        for (int a = t; a < x; a++) {
                            if (a == f) {
                                suma += arr[3][a];
                            }
                        }
                        for (int a = t; a < x; a++) {
                            suma += arr[4][a];
                        }
                        relojes[r] = suma;
                        suma = 0;
                        t++;
                        x++;
                        f++;
                    }

                    int numeromayor = relojes[0];

                    for (int mayores = 0; mayores < relojes.length; mayores++) {
                        if (relojes[mayores] > numeromayor) {
                            numeromayor = relojes[mayores];
                        }
                    }
                    relojFinal[2] = numeromayor;
                }

                if (i == 3) {
                    suma = 0;
                    t = 0;
                    x = 3;
                    f = 1;
                    for (int r = 0; r < 4; r++) {
                        for (int a = t; a < x; a++) {
                            suma += arr[3][a];
                        }
                        for (int a = t; a < x; a++) {
                            if (a == f) {
                                suma += arr[4][a];
                            }
                        }
                        for (int a = t; a < x; a++) {
                            suma += arr[5][a];
                        }

                        relojes[r] = suma;
                        suma = 0;
                        t++;
                        x++;
                        f++;
                    }

                    int numeromayor = relojes[0];

                    for (int mayores = 0; mayores < relojes.length; mayores++) {
                        if (relojes[mayores] > numeromayor) {
                            numeromayor = relojes[mayores];
                        }
                    }
                    relojFinal[3] = numeromayor;

                }

            }
        }

        /**
         * Calculo del reloj de arena mayor
         */
        int numeromayor = relojFinal[0];

        for (int mayores = 0; mayores < relojFinal.length; mayores++) {
            if (relojFinal[mayores] > numeromayor) {
                numeromayor = relojFinal[mayores];
            }
        }

        System.out.println("Numero Mayor Final" + " " + numeromayor);

    } 
    
}
