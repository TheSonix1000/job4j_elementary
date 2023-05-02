package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {

        double first = Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
        return first;
    }

    public static void main(String[] args) {
        double rsl1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl1);
        double rsl2 = TrgArea.area(1, 1, 1);
        System.out.println("area (1, 1, 1) = " + rsl2);
    }
}
