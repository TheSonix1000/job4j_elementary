package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double first = ((a + b + c) / 2) - a;
        double second = ((a + b + c) / 2) - b;
        double three = ((a + b + c) / 2) - c;
        double four = Math.sqrt((a + b + c) * first * second * three);
        return four;
    }

    public static void main(String[] args) {
        double rsl1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl1);
        double rsl2 = TrgArea.area(7, 7, 7);
        System.out.println("area (7, 7, 7) = " + rsl2);
    }
}
