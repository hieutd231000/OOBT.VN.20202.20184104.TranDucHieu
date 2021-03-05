package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        boolean quit = false;
        System.out.println("Input month and year: ");
	    int month = scanner.nextInt();
	    int year = scanner.nextInt();
	    DayInMonth days = new DayInMonth(month,year);
	    while(days.isValid() == false){
            System.out.println("Input again: ");
            month = scanner.nextInt();
            year = scanner.nextInt();
            days = new DayInMonth(month,year);
        }
	    days.dayInMonth();
    }
}
