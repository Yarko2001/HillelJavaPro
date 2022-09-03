package dehtiar.homeworks.homework_5.part_1.model;

import dehtiar.homeworks.homework_5.part_1.Figure;

public class Square implements Figure {
    private double border;

    public Square(double border) {
        this.border = border;
    }

    @Override
    public double calculateSquare() {
        return Math.pow(border, 2);
    }

    public double getBorder() {
        return border;
    }

    public void setBorder(double border) {
        this.border = border;
    }
}
