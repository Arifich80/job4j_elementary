package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] data = new int[size][size];
        for (int row = 0; row < data.length; row++) {
            for (int cell = 0; cell < data[row].length; cell++) {
                int sum = (row + 1) * (cell + 1);
                data[row][cell] = sum;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        System.out.println(Matrix.multiple(2));
    }
}
