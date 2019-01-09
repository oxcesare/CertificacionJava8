/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Primera linea 
package mx.com.examenfinal.test6;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase manda un error la variable heigth debido a que por su alcance
 * solo aplica dentro del if (Condicional)
 * 
 * Se comenta la linea de codigo para no subir con errores al github
 * 
 */
public class Test2 {

    public static void main(String[] args) {
        String tree = "pine";
        int count = 0;
        if (tree.equals("pine")) {
            int height = 55;
            count = count + 1;
        }
        //System.out.print(height + count);
    }
}
