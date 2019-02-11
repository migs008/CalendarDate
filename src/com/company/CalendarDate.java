package com.company;
/*
    Author: Miguel Aquino

    Date: 2/10/2019

    Purpose: Represents a date from the Gregorian Calendar.
 */
public class CalendarDate {
    private int day;
    private int month;
    private int year;

    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /*
        Purpose: Constructor that takes int values for the month, day, and year as an argument
        Parameters: int month takes the numerical value of the month, int day takes the day's number in a month, int year takes the year of the date
        Return: N/A
     */
    public CalendarDate(int month, int day, int year) {
        setDate(year, month, day);
    }

    /*
        Purpose: an accessor method for year variable
        Parameters: N/A
        Return: the date's year variable
     */
    public int getYear() {
        return year;
    }

    /*
        Purpose: an accessor method for month variable
        Parameters: N/A
        Return: the date's month variable
     */
    public int getMonth() {
        return month;
    }

    /*
        Purpose: an accessor method for day variable
        Parameters: N/A
        Return: the date's day variable
     */
    public int getDay() {
        return day;
    }

    /*
        Purpose: a mutator method that applies parameter rules from the constructor
        Parameters: int month takes the numerical value of the month, int day takes the day's number in a month, int year takes the year of the date
        Return: N/A
     */
    public void setDate(int year, int month, int day) {

        if (month < 1) {
            this.month = 1;
        }
        else if (month > 12) {
            this.month = 12;
        }
        else {
            this.month = month;
        }

        if (day < 1) {
            this.day = 1;
        }
        else if (day > numDays[getMonth() - 1]) {
            this.day = numDays[getMonth() - 1];
        }

        else {
            this.day = day;
        }

        if (year < 1752) {
            this.year = 1752;
        }
        else {
            this.year = year;
        }

        if (year % 4 == 0 || year % 400 == 0) {
            this.numDays[1] = 29;
        }
        else {
            this.numDays[1] = 28;
        }
    }

    /*
        Purpose: an accessor method the months array
        Parameters: N/A
        Return: the date's month variable as a String
     */
    public String getMonthAsString() {
        return months[getMonth() - 1];
    }

    /*
        Purpose: method that converts int variables to String
        Parameters: N/A
        Return: String object that displays date represented
     */
    public String toString() {
        String str = getMonthAsString() + " " + getDay() + ", " + getYear();

        return str;
    }

    /*
        Purpose: a boolean method that check if this object and CalendarDate object in parameter are the same date
        Parameters: obj that holds object
        Return: true if the same and false if not
     */
    public boolean equals(Object obj) {
        return (this == obj);
    }

    /*
        Purpose: method that advances the date given by a day
        Parameters: N/A
        Return: nextDate object that represents the next date of the given date
     */
    public CalendarDate tomorrow() {

        CalendarDate nextDate = new CalendarDate(month, day, year);

        nextDate.day++;

        if (nextDate.day > numDays[getMonth() - 1]) {
            nextDate.day = 1;
            nextDate.month++;
            if (nextDate.getMonth() > 12) {
                nextDate.month = 1;
                nextDate.year++;
            }
        }

        return nextDate;
    }
}
