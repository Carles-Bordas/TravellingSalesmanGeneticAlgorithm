package com.snowy.travsalesman.geneticalg;

public class SimpleVector2 implements Vector2 {
    private double x;
    private double y;

    public SimpleVector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public Vector2 add(Vector2 other) {
        return new SimpleVector2(this.x + other.getX(), this.y + other.getY());
    }

    @Override
    public Vector2 substract(Vector2 other) {
        return new SimpleVector2(this.x - other.getX(), this.y - other.getY());
    }

    @Override
    public double distanceTo(Vector2 other) {
        double result = Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2);
        return Math.sqrt(result);
    }

}
