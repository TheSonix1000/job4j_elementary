package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        int number = 4;
        String name;
        switch (number) {
            case 1 :
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }
}
