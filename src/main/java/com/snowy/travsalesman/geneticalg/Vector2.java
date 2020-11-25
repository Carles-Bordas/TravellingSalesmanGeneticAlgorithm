package com.snowy.travsalesman.geneticalg;

public interface Vector2 {
    public double getX();
    public double getY();
    public void setX(double x);
    public void setY(double y);
    public Vector2 add(Vector2 other);
    public Vector2 substract(Vector2 other);
    public double distanceTo(Vector2 other);
}
