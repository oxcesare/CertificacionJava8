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
 * Esta clase tiene un error en tiempo de compilacion ya que RainForest extiende
 * Forest y esta clase padre tien un constructor definido al tenerlo la clase
 * hija debe de invocarlo mediante la palabra reservada super y enviarle el
 * constructor correspondiente.
 *
 * Para que esta clase compile sin problema solo hay que colocar Super() en el
 * constructor de la clase RainForest y el resultado es 7.
 */
public class RainForest extends Forest {

//    public RainForest(long treeCount) {
//        this.treeCount = treeCount + 1;
//    }
    public RainForest(long treeCount) {
        super(treeCount);
    }

    public static void main(String[] birds) {
        System.out.print(new RainForest(5).treeCount);
    }

}

class Forest {

    public long treeCount;

    public Forest(long treeCount) {
        this.treeCount = treeCount + 2;
    }
}
