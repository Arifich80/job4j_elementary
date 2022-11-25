package ru.job4j.array;
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 455, 5, 6, 20, 55};
        System.out.println(MinDiapason.findMin(array, 2, 4));
    }
}