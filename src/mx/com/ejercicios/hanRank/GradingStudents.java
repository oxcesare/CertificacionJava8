/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.io.*;
import java.util.*;

/**
 *
 * @author consultor006
 */
public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {

        int[] arr = new int[grades.length];

        /**
         * De momento solo quiero que meta en el arreglo los que son multiplos
         * de 5
         */
        for (int i = 0; i < grades.length; i++) {

            //Tomo el primer elemento y le sumo 3
            int aux = grades[i];
            int auxT = aux;

            int x = 1;
            boolean n = false;

            for (int j = 1; j < 3; j++) {
                auxT += x;
                if (auxT % 5 == 0 && auxT >= 40) {
                    arr[i] = auxT;
                    n=false;
                    break;
                } else {
                    n = true;
                }                
            }

            if (n) {
                //No es multiplo4 de 5 y lo almaceno con su valor original 
                arr[i] = grades[i];
            }

        }
        /**
         * Recorro los elementos de mi nuevo arreglo
         */

        for (int i : arr) {
            System.out.println("Elementos que son multiplios" + " " + i);
        }
        return arr;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //    BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //Numero de estudiantes
        int n = Integer.parseInt(scan.nextLine().trim());

        //creo un arreglo con el número de estudiantes
        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        //Recorro las calificaciones de los alumnos
        for (int grade : grades) {
            System.out.println("grades" + " " + grade);
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            //    bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                //      bw.write("\n");
            }
        }

        //bw.newLine();
        //bw.close();
    }

}
