package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        } else if (second > third) {
            result = second;

        } else {
            result = third;
        }

        return result;
    }

            public static void main(String[]args) {
            int result = ThreeMax.max(10, 5, 1);
                System.out.println(result);
            }
}
