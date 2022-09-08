package dehtiar.homeworks.homework_6;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords(new String[]{"Orange", "Banana", "Apple"});
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkNumbers(9, 1));
        checkPositiveNumber(-32);
        System.out.println(checkNegativeNumber(-8));
        outputStringAFewTimes("Hello", 5);
        System.out.println(isLeapYearOrNot(2022));
    }

    private static void printThreeWords(String[] fruit) {
        for (String s : fruit) {
            System.out.println(s);
        }
    }

    private static void checkSumSign() {
        int a = 10;
        int b = 5;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Number: " + result + " is positive ");
        } else {
            System.out.println("Number :" + result + " is negative ");
        }
    }

    private static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    private static void compareNumbers() {
        int a = 5;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static boolean checkNumbers(int a, int b) {
        int value = a + b;
        return value >= 10 && value <= 20;
    }

    private static void checkPositiveNumber(int d) {
        if (d < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
    }

    private static boolean checkNegativeNumber(int c) {
        return c < 0;
    }

    private static void outputStringAFewTimes(String someString, int someValue) {
        for (int i = 0; i < someValue; i++) {
            System.out.println(someString);
        }
    }

    private static boolean isLeapYearOrNot(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
