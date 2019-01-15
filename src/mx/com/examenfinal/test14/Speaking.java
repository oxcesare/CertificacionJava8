/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test14;

import java.util.Map;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 *
 * Esta clase hace uso de Stream,
 *
 * Se crea un Mapa que almacena el nombre y la suma del score de los elementos
 * que le digamos que traiga.
 *
 * En el System.out.println que esta al final del codigo, le mandamos el nombre
 * la persona que queremos que nos traiga la suma del score.
 *
 * la suma de los score lo hace el metodo summingInt
 *
 * that produces the sum of a integer-valued function applied to the input
 * elements.
 *
 *
 *
 *
 * Nueva forma de invocar a los metodos en Java 8
 *
 * Ballot::getName
 *
 */
public class Speaking {

    public static void main(String[] args) {
        Stream<Ballot> ballots = Stream.of(
                new Ballot("Mario", 1, 10),
                new Ballot("Christina", 1, 8),
                new Ballot("Mario", 2, 9),
                new Ballot("Christina", 2, 8),
                new Ballot("Christina", 2, 8));

        Map<String, Integer> scores = ballots.
                collect(groupingBy(Ballot::getName, summingInt(Ballot::getScore)));
        System.out.println(scores.get("Christina"));

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            System.out.println("key" + key);
            Integer value = entry.getValue();
            System.out.println("value" + value);

        }

    }
}
