package ru.job4j.loop;

public class Counter2 {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i = start;
        for (i = start; i <= finish; i++) {
            sum = sum + start++;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        int i;
        for (i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}