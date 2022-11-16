package ru.job4j.condition;

import java.time.MonthDay;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;

            default -> -1;
        };
    }

    public static void main(String[] args) {
        String name = String.valueOf(MultipleSwitchWeek.numberOfDay("Понедельник"));
        System.out.println(name);

        String name1 = String.valueOf(MultipleSwitchWeek.numberOfDay("Monday"));
        System.out.println(name1);

        String name2 = String.valueOf(MultipleSwitchWeek.numberOfDay("Среда"));
        System.out.println(name2);

        String name3 = String.valueOf(MultipleSwitchWeek.numberOfDay("Wednesday"));
        System.out.println(name3);

        String name4 = String.valueOf(MultipleSwitchWeek.numberOfDay("Ошибка"));
        System.out.println(name4);
    }
}

