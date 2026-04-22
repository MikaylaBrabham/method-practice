package com.pluralsight;

import java.util.Scanner;

public class Format {
    //add a scanner for user to use their name
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //prompt user to enter their first and last name
        System.out.println("Please enter your first name: ");
        String first = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        String last = scanner.nextLine();
        //call the formatName method to format the user's name
        formatName( last, first);
    }

//create a method to format the user's name
    public static void formatName(String first, String last) {

        String fullName = String.format("%s %s", first, last);
        System.out.println(fullName);
    }
}
