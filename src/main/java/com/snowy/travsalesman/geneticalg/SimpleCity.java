package com.snowy.travsalesman.geneticalg;

public class SimpleCity implements City {
    private String name;
    private Vector2 location;

    public SimpleCity(String name, Vector2 location) {
        this.name = name;
        this.location = location;
    }

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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SimpleCity)) {
            return false;
        }

        City toCompare = (SimpleCity) o;

        if (!toCompare.getName().equals(this.name) || toCompare.getLocation().equals(this.location)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.location.hashCode();
    }

}
