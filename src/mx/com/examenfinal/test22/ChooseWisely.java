/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test22;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase al convertirlo en byte busca el tipo primtivo
 * menor, pero como la suma es 2+1 =3 ya no cabe en un short por lo tanto 
 * se va con el int e imprime 5
 */
public class ChooseWisely {

    public ChooseWisely() {
        super();
    }

    public int choose(int choice) {
        return 5;
    }

    public int choose(short choice) {
        return 2;
    }

    public int choose(long choice) {
        return 11;
    }

    public static void main(String[] path) {
        System.out.print(new ChooseWisely().choose((byte) 2+1));
    }

}
