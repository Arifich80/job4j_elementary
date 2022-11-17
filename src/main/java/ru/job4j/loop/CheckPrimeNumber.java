package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int i = 2;
        for (i = 2; i <= (number - 1); i++) {
            if (number % i == 0) {
                break;
            }
            i = i + 1;
        }
            return prime;
        }

    public static void main(String[] args) {
        System.out.println(check(111));
    }
}
