package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {

        boolean result1 = LogicNot.isEven(3);
        System.out.println(exist(1, 1, 1));
        System.out.println(exist(2, 1, 1));
        System.out.println(exist(1, 2, 1));
        System.out.println(exist(1, 1, 2));
    }
}