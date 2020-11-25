package com.snowy.travsalesman.geneticalg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleVector2Tests {

    @Test
    public void shouldAddTwoVectors() {
        Vector2 firstVector = new SimpleVector2(3, 7);
        Vector2 secondVector = new SimpleVector2(-2, 13.2);
        Vector2 resultVector = firstVector.add(secondVector);
        assertEquals(1, resultVector.getX(), 0.000001);
        assertEquals(20.2, resultVector.getY(), 0.000001);
    }

    @Test
    public void shouldSubstractTwoVectors() {
        Vector2 firstVector = new SimpleVector2(4.9, -6.6);
        Vector2 secondVector = new SimpleVector2(3, -5.2);
        Vector2 resultVector = firstVector.substract(secondVector);
        assertEquals(1.9, resultVector.getX(), 0.000001);
        assertEquals(-1.4, resultVector.getY(), 0.000001);
    }

    @Test
    public void shouldCalculateDistance() {
        Vector2 firstVector = new SimpleVector2(-7, -4);
        Vector2 secondVector = new SimpleVector2(17, 6.5);
        double result = firstVector.distanceTo(secondVector);
        assertEquals(26.196374, result, 0.000001);
    }

}
