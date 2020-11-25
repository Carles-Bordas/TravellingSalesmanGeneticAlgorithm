package com.snowy.travsalesman.geneticalg;

public interface Route extends Iterable<City> {
    public Route clone();
    public void permutate(int index1, int index2);
    public int length(); // Number of cities
    public int totalDistance(); // Distance between all cities
    public City getInitialCity();
}
