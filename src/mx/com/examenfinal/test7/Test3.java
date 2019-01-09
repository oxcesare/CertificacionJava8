/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test7;

/**
 *
 * @author cesaralducinruiz
 *
 * En esta clase recordar que el operador "+" si se combina con String-int o
 * double representa una concatenacion.
 *
 * a diferencia que si se hace con int- int hace la suma al utlizar el operador
 * "+".
 */
public class Test3 {
    
    
   static int n;
   static short p;
   static double t;

    public static void main(String[] args) {
        System.out.println(""+n);
        System.out.println(""+p);
        System.out.println(""+t);
        //b();
    }

    public static void a() {
        double d1 = 5f;
        double d2 = 5.0;
        float f1 = 5f;
        //float f2 = 5.0; //error se intenta convertir un double a float
    }

    public static void b() {

        String title = "Weather";
        int hot = 1;
        double cold = 5.0;
        System.out.println(hot + " " + title);
    }
    
    public static void c(){
        
    }
}
