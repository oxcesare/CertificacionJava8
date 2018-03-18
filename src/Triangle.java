/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author consultor006
 * 
 * Un metodo que no contenga cuerpo no puede ser declarado como estatico
 */
public class Triangle {
    public int base;
    public int height;
    private static double ANGLE;

    public static double getAngle();
    
    public static void Main(String[] args) {
        System.out.println(getAngle());
    }
}
