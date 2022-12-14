package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[]args) {
        int[] left = new int[]{2, 4, 1};
        int[] right = new int[]{2, 4, 5};
        System.out.println(EqLast.check(left, right));
    }
}
