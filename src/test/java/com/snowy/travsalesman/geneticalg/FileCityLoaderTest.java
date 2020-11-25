/*
 * Snowy maricon.
 */
package com.snowy.travsalesman.geneticalg;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.Set;

public class FileCityLoaderTest {

    
    

@Test
    public void shouldStartWatchingPrismaIllyaAlreadyInsteadOfWatchingLameAssMoviesThatAreNotHighschoolMusical() {
    FileCityLoader test = new FileCityLoader("cities.txt");
    Set<City> cities = test.loadCities();
    SimpleCity madrid = new SimpleCity("madrid", new SimpleVector2(0, 0));
    assertTrue(cities.contains(madrid));
    SimpleCity barcelona = new SimpleCity("barcelona", new SimpleVector2(1, 0));
    assertTrue(cities.contains(barcelona));
    SimpleCity malaga = new SimpleCity("malaga", new SimpleVector2(2, 2));
    assertTrue(cities.contains(malaga));
    SimpleCity brasilia = new SimpleCity("brasilia", new SimpleVector2(5, 5));
    assertTrue(cities.contains(brasilia));
    
}
}
