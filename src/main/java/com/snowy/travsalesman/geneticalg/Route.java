package com.snowy.travsalesman.geneticalg;

import java.util.List;

public interface Route extends Iterable<City> {
    public Route clone();

    public void permutate(int index1, int index2);

    public int length(); // Number of cities

    public double totalDistance(); // Distance between all cities

    public City getInitialCity();

    public List getCities();
}
