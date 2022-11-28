package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                if (val < 0) {
                    array[row][cell] = 0;
                    System.out.println("row : " + row + ", cell : " + cell);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = {
                {-1, 2, 3},
                {3, -2, 1},
                {2, 3, -1}
        };
        SkipNegative.skip(array);
    }
}