package com.company;


import java.util.Scanner;


public class TestOne {

    public static void displayDates(CalendarDate date) {
        System.out.println("today's date: " + date);
        System.out.println("tomorrow's date " + date.tomorrow() + "\n");
    }

    public static void main(String[] args) {

        System.out.println("Test last day of the month: ");
        displayDates(new CalendarDate(1, 31, 1999));
        displayDates(new CalendarDate(2, 28, 1999));
        displayDates(new CalendarDate(2, 28, 1800));
        displayDates(new CalendarDate(2, 29, 1801));
        displayDates(new CalendarDate(2, 29, 1804));
        displayDates(new CalendarDate(2, 29, 2400));
        displayDates(new CalendarDate(3, 31, 1900));
        displayDates(new CalendarDate(4, 30, 1888));
        displayDates(new CalendarDate(5, 31, 1907));
        displayDates(new CalendarDate(6, 30, 1900));
        displayDates(new CalendarDate(7, 31, 1917));
        displayDates(new CalendarDate(8, 31, 1901));
        displayDates(new CalendarDate(9, 30, 1907));
        displayDates(new CalendarDate(10, 31, 1900));
        displayDates(new CalendarDate(11, 30, 1857));
        displayDates(new CalendarDate(12, 31, 1809));

        displayDates(new CalendarDate(-1, 400, 1001));
        displayDates(new CalendarDate(14, -23, 1957));
        displayDates(new CalendarDate(12000, 1000, 1909));

    }

}

