/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 */

interface uno extends dos  {
    
}

interface dos {
    
}



class Point {

}

class ColoredPoint extends Point {

    int color;
}

class Test {

    static void test(ColoredPoint p, Point q) {
        System.out.println("(ColoredPoint, Point)");
    }

    static void test(Point p, ColoredPoint q) {
        System.out.println("(Point, ColoredPoint)");
    }
    
    static void test (ColoredPoint x, ColoredPoint y){
       System.out.println("Objetos ColoredPoint ");
    }

    public static void main(String[] args) {
        ColoredPoint cp = new ColoredPoint();
        test(cp, cp); // referencia ambigua, ya que estamos enviando dos objetos de la misma instancia 
        
    }
}
