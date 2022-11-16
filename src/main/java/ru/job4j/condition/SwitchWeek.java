package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
                break;

        }
        return name;
    }

    public static void main(String[] args) {
        String day = SwitchWeek.nameOfDay(1);
        System.out.println(day);

        String day2 = SwitchWeek.nameOfDay(2);
        System.out.println(day2);

        String day3 = SwitchWeek.nameOfDay(3);
        System.out.println(day3);

        String day4 = SwitchWeek.nameOfDay(4);
        System.out.println(day4);

        String day5 = SwitchWeek.nameOfDay(5);
        System.out.println(day5);

        String day6 = SwitchWeek.nameOfDay(6);
        System.out.println(day6);

        String day7 = SwitchWeek.nameOfDay(7);
        System.out.println(day7);

        String day8 = SwitchWeek.nameOfDay(8);
        System.out.println(day8);

    }
}

