/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author consultor006
 * 
 * Con el objeto friend se crea un stream, se filtran los elementos que sean menos que 30,
 * se guardan en un mapa y se obtiene la edad de cada objeto persona, se obtiene el promedio 
 * y se convierte a double. 
 * 
 * Al no existir un elemento que cumpla con edad menor a 30 ya no se cumple todo lo demas que evalua
 * el stream. 
 * 
 * El método average() retorna un OptionalDouble. es decir si existe una expresion de ese tipo.
 * 
 * El método  getAsDouble evalua si existe el optional de lo contrario manda una exception del tipo 
 * NoSuchElementException
 * 
 * Cambiando los valores que se envian como parametro a al constructor de la clase, 
 * esta ya no manda la exception antes mencionada.
 * 
 */

public class TestPerson {

    public static void main(String[] args) {
        List<Person> friends = Arrays.asList(
                new Person("Bob", 29),
                new Person("Paul", 38),
                new Person("John", 27));
        double averageAge = friends.stream().filter(f -> f.getAge() < 30).mapToInt(f -> f.getAge()).average().getAsDouble();
        System.out.println(averageAge);

    }
}
