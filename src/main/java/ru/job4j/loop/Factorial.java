package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int calc = 1;
        for (int i = 2; i <= n; i++) {
            if (i == 0 || i == 1) return 1; {
                calc *= i;
            }
        }
        return calc;
    }
}

