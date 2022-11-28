package ru.job4j.array;

import java.util.Arrays;

import static ru.job4j.array.SwitchArray.swap;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            swap(data, min, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[]{4, 2, 3, 1, 5};

            System.out.println(Arrays.toString(SortSelected.sort(data)));
        }
    }
