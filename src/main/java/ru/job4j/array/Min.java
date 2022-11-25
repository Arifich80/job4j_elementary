package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                array[0] = array[index];
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 455, 5, 6};
        System.out.println(Min.findMin(array));
    }
}