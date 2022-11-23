package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }

    public static void main(String[]args) {
        int[] array = new int[] {4, 1, 2, 3};
        System.out.println(Arrays.toString(Turn.back(array)));
    }
}
