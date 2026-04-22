package com.pluralsight;

public class Menu {
    // create a main method
    public static void main(String[] args) {
        Menu menu = new Menu();
        String menuDisplay = menu.displayMenu();
        System.out.println(menuDisplay);
        String menuDisplay2 = menu.displayMenu();
        System.out.println(menuDisplay2);
    }

    //create a displayMenu method
    public String displayMenu() {
        String header = "=== MENU ===";
        String opt1 = "1. Coffee - $3.99";
        String opt2 = "2. Tea - $2.99";
        String opt3 = "3. Cookie - $1.99";
        return header + "\n" + opt1 + "\n" + opt2 + "\n" + opt3;
    }
}
