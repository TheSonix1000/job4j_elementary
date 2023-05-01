package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double lenght = height * k;
        double square = lenght * height;
        return square;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, real = " + result1);
        double result2 = SqArea.square(8, 2);
        System.out.println(" p = 4, k = 1, real = " + result2);
    }
}
