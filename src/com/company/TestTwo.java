package com.company;


import java.util.Scanner;


public class TestTwo {

    public static void displayDates(CalendarDate date) {
        System.out.println("today's date: " + date);
        System.out.println("tomorrow's date " + date.tomorrow() + "\n");
    }

    public static void main(String[] args) {


        System.out.println("Enter the month, day, and year at the prompts");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the day: ");
        int day = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        CalendarDate cd = new CalendarDate(month, day, year);
        System.out.println("The month as a String is " + cd.getMonthAsString());
        System.out.println("The month as an int is " +  cd.getMonth());
        System.out.println("The day is " +  cd.getDay());
        System.out.println("The year is " +  cd.getYear() +"\n");

        System.out.println("Change the month, day, and year at the prompts");
        System.out.print("Enter the month: ");
        month = input.nextInt();
        System.out.print("Enter the day: ");
        day = input.nextInt();
        System.out.print("Enter the year: ");
        year = input.nextInt();
        cd.setDate(year, month, day);
        displayDates(cd);




    }

}
