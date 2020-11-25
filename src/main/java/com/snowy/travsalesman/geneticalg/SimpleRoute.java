package com.snowy.travsalesman.geneticalg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleRoute implements Route {
    List<City> cities = new ArrayList<>();

    public SimpleRoute(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public Iterator<City> iterator() {
        return cities.iterator();
    }

    @Override
    public Route clone() {
        return new SimpleRoute(this.cities);
    }

    @Override
    public void permutate(int index1, int index2) {
        City firstCity = cities.get(index1);
        cities.set(index1, cities.get(index2));
        cities.set(index2, firstCity);
    }

    @Override
    public int length() {
        return this.cities.size();
    }

    @Override
    public double totalDistance() {
        double result = 0;
        for (int i = 0; i < cities.size() - 1; i++) {
            result += cities.get(i).distanceTo(cities.get(i + 1));
        }
        return result;
    }

    @Override
    public City getInitialCity() {
        return cities.get(0);
    }

}
