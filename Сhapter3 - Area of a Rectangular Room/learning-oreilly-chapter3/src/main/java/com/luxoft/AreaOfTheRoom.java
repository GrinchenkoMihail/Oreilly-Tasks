package com.luxoft;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class AreaOfTheRoom implements Area {
    private final double CONVERSION_FACTOR = 0.09290304;

    private double length;
    private double width;

    public AreaOfTheRoom(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public double calculateInMeters() {
        double d = calculateArea() * CONVERSION_FACTOR;
        BigDecimal bigDecimal =BigDecimal.valueOf(d);
        bigDecimal = bigDecimal.setScale(3, RoundingMode.HALF_DOWN);
        return bigDecimal.doubleValue();
    }
}
