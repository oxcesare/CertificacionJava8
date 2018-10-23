/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author consultor006
 *
 * Clase FilteringStuff que muestra la funcionalidad de Predicate, una interface
 * funcional que recibe un generico como parametro Predicate<T>.
 */
class Movie {

    static enum Genre {
        DRAMA, THRILLER, HORROR, ACTION
    };
    private Genre genre;
    private String name;

    Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class FilteringStuff {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("On the Waterfront", Movie.Genre.DRAMA),
                new Movie("Psycho", Movie.Genre.THRILLER),
                new Movie("Oldboy", Movie.Genre.THRILLER),
                new Movie("Shining", Movie.Genre.HORROR));

        Predicate<Movie> horror = mov -> mov.getGenre() == Movie.Genre.THRILLER;
        Predicate<Movie> name = mov -> mov.getName().startsWith("O");
        /**
         * Con mi lista de peliculas meterlas en un stream e invocar al metodo filter pasando 
         * como argumento el predicate
         */
        movies.stream().filter(horror).filter(name).forEach(mov -> System.out.println(mov.getName()));

    }

}
