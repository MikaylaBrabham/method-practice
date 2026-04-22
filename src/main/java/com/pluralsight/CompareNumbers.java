package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        // call these within a sout to view if methods work or not

        System.out.println(isEven(5));
        System.out.println(isEven(4));
        System.out.println(isEven(13));
        System.out.println(isPositive(5.5));

    }
    public static boolean isEven (int number) {
        // create returns true if the number is even, false otherwise
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean isPositive (double number) {
        // create a returns true if > 0
        if (number > 0) {
            return true;
        } else {
            return false;
        }

    }
}
