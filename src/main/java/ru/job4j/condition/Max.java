package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;

    }

    public static int max(int left, int right, int third) {
        int result = Math.max(left, right) > third ? Math.max(left, right) : third;
        return result;
    }

    public static int max(int left, int right, int third, int fourth) {
        int result = Math.max(Math.max(left, right), third) > fourth ? Math.max(Math.max(left, right), third) : fourth;
        return result;
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 2, 3, 5);
        System.out.println(rsl);

    }
}