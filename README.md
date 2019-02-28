# CalendarDate
Math 140 Assignment 1: Due by Feb 11, 2019 11:59 pm.
Assignment: Write a Java class called CalendarDate in a file named CalendarDate.java
that represents a date from the Gregorian calendar.
Learning Outcome: Review how to write classes and create objects.
Required Features
Private Instance Variables.
int day
int month
int year
Public Constructor
CalendarDate (int month, int day, int year) — Initializes the instance variables. If the
month is below 1 then set it to 1. If the month is greater then 12 then set it to 12. If
the day is a negative integer then set it to 0. If the day is less than 1 then set it to
1. If the day is greater than the number of days in the month then set it to the last day
of the month.
The Gregorian calendar was established in 1752. Therefore, if the year is less than
1752 then set it to 1752.
Examples: new CalendarDate(13, 32, 1750) creates a CalendarDate object that
represents December, 31, 1752.
new CalendarDate(3, 40, 1800) creates a CalendarDate object that represents March,
30, 1800.
new CalendarDate(-3, -7, 1950) creates a CalendarDate object that represents January,
1, 1950.
Math 140 Assignment 1: Due by Feb 11, 2019 11:59 pm.
Public Methods
• int getYear() — accessor method for year
• int getMonth() — accessor method for month
• int getDay – accessor method for day
• void setDate (int year, int month, int day) — resets the instance variables to the
one specified by the parameters. Apply the parameters rules described in the
constructor section. (This is the only mutator method for this assignment.)
• String getMonthAsString() — returns the month as a String value. For instance,
if the month = 7 then the method returns “July”. (Suggestion: create a local
String array that contains the months of the year.)
• String toString() — returns a String representation of the date. Example: If the
month = 3, day = 11, and year = 2000 then return the String “March 11, 2000”.
• boolean equals (Object obj)—returns true if this object and the CalendarDate
object stored in the parameter represent the same date. Otherwise, return false.
• public CalendarDate tomorrow() — returns a reference to a new CalendarDate
object that represents the day after this object’s day. For example, if this object
is currently representing December 31, 1899 then tomorrow() will returns a
reference to a CalendarDate object representing January 1, 1900.
Make sure to follow the leap rules for the constructor and the tomorrow method:
Years that are divisible by 4 except for the following case: If the year is divisible by 100
but it is not divisible by 400 then the year is not a leap year.
Examples: 2004 is divisible by 4 but it is not divisible by 100. Therefore, it is a leap
year.
1800 is divisible by 4 and 100. However, it is not divisible by 400. Therefore, it is not a
leap year.
2400 is divisible by 4, 100, and 400. Therefore, 2400 is a leap year.
Math 140 Assignment 1: Due by Feb 11, 2019 11:59 pm.
Coding Instructions
1. Do not use any Java classes (such as the Date and Calendar classes) that
trivialize the problem.
2. Only declare the instance variables described in the problem description.
3. Each instance variable should be declared on a separate line.
4. You can write additional methods but they should be declared as private.
5. Test each of the methods. (I will post a file to test your code towards the end of
the week.)
6. Use consistent notation to format your code. Indent 4-spaces.
7. Variables and methods should start with a lower-case character. Each
abbreviation or word that appears in the middle of the identifier starts with an
uppercase character.
8. Do not use break statements.
9. Do not change the value of a counter variable to terminate a loop:
Example:
for (int i = 0; i < arr.length; i++){
 if (arr[i] < 0)
 i = arr.length;
}
10.Loops should not perform any irrelevant iterations.
11.Each method should have at most one return statement.
12.Do not use a return statement in a void method.
13.Do not use a while loop when an if statement is appropriate for the code
segment. (In other words, do not write a while that can is guaranteed to iterate
at most one time.)
14.Separate code segments with a most one blank line.
15.A block comment near the top of the Java file with the following information
/*
Author: Your name and an acknowledgement of any person who assisted you in
this project.
Date: The date you completed the assignment.
Purpose: A description of the class.
*/
Math 140 Assignment 1: Due by Feb 11, 2019 11:59 pm.
16. Write a block comment above each method and constructor with the following
information:
/*
 Purpose: A meaningful description of the method/constructor.
 Parameters: Describe the purpose of each parameter
 Return: A description of the return value.
*/
 
