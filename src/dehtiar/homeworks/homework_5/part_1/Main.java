package dehtiar.homeworks.homework_5.part_1;

import dehtiar.homeworks.homework_5.part_1.model.Circle;
import dehtiar.homeworks.homework_5.part_1.model.Square;
import dehtiar.homeworks.homework_5.part_1.model.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure[] array = {new Circle(5), new Triangle(4, 4, 4), new Square(3)};
        calculateAmountOfFigures(array);
    }

    private static void calculateAmountOfFigures(Figure[] array) {
        int total = 0;
        for (Figure figure : array) {
            total += figure.calculateSquare();
        }
        System.out.println("Total of the figures :" + total);
    }
}
