package dehtiar.homeworks.homework_5.part_1.model;

import dehtiar.homeworks.homework_5.part_1.Figure;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
