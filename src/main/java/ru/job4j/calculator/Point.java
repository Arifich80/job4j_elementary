package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rslX = x2 - x1;
        double rslY = y2 - y1;
        double rslX1 = Math.pow(rslX, 2);
        double rslY1 = Math.pow(rslY, 2);
        double rslSum = rslX1 + rslY1;
        double rsl = Math.sqrt(rslSum);
        return rsl;
    }

    public static void main(String[] args) {

        double result = Point.distance(2, 3, 4, 5);

        System.out.println("result (2, 3) to (4, 5) " + result);
    }
}