package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if ((data[i] != data[data.length - i - 1]) || (data[i] != data[data.length - 2])) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] data = new boolean[]{true, false, true};
        System.out.println(Check.mono(data));
    }
}