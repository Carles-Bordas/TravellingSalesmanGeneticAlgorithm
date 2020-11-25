package com.snowy.travsalesman.geneticalg;

public class SimpleCity implements City {
    private String name;
    private Vector2 location;

    /**
     * Returns the name of the city
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Gets the location of the city
     */
    @Override
    public Vector2 getLocation() {
        return this.location;
    }

    /**
     * Gets the distance to another given city
     */
    @Override
    public double distanceTo(City other) {
        return location.distanceTo(other.getLocation());
    }

}
