package com.snowy.travsalesman.geneticalg;

public interface City {
    public String getName();
    public Vector2 getLocation();
    public double distanceTo(City other);
}
