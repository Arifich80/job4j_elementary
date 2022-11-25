package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[0] > array[index]) {
                int temp = array[0];
                array[0] = array[index];
                array[index] = temp;

            }
        }
        return min;
    }

    public static void main(String[] args) {
       int[] array = new int[]{8, 1, 5, 6};
        System.out.println(Min.findMin(array));

    }
}