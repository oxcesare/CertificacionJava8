/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.tres.genericos;

/**
 *
 * @author consultor006
 */
public class AssertErrorTest extends Subclase {

    public void robustMethod(int[] intArray) throws AssertionError {
        //int[] newIA = //get new array by processing intArray      assert newIA != intArray;         
    }

    public static void main(String[] args) {
        assert args.length == 2 : "Must give two arguments";
    }

}

class Subclase {

    public void robustMethod(int[] intArray) throws Exception {
        String v = "";
        assert false : new Integer("");
    }
}
