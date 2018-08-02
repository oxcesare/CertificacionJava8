/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 *
 * @author consultor006
 *
 * Un Stream guarda una lista, y se puede aplicar una interface funcional y esta
 * a su vez ser recorrida por multiples filters
 * 
 * El metodo filter se debe de aplicar de manera individual es decir aplicar filter 
 * y su respectivo Predicate despues otro filter y su respectivo predicate.
 * 
 * La interface funcional Predicate recibe un generico 
 *
 *
 */
public class FilteringStuff {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(new Movie("On the Waterfront", Movie.Genre.DRAMA), new Movie("Psycho", Movie.Genre.THRILLER), new Movie("Oldboy", Movie.Genre.THRILLER), new Movie("Shining", Movie.Genre.HORROR));
        Predicate<Movie> horror = mov -> mov.getGenre() == Movie.Genre.HORROR;
        Predicate<Movie> name = mov -> mov.getName().startsWith("S");
       //1 INSERT CODE HERE   
        movies.stream().filter(horror).filter(name).forEach(mov -> System.out.println(mov.getName()));
    }
}

class Movie {

    static enum Genre {
        DRAMA, THRILLER, HORROR, ACTION
    };
    private Genre genre;
    private String name;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }
    //accessors not shown 

}
