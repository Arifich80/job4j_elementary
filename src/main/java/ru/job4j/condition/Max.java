package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        return max(max(left, right), third);
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(max(max(left, right), third), fourth);
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 2, 3, 5);
        System.out.println(rsl);
    }
}