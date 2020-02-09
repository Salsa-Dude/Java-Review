package com.joseph;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Creating a new instance: now, parse, of*, with*
        // - LocalDateTime.now();
        // - LocalDate.parse(CharSequence text);
        // - LocalTime.of(int hour, int minute, int second);
        // - LocalDateTime.withHour(int hour);

        // Getting date-time information: *get
        // - LocalDate.getYear()

        // Computing another instance of the same type: plus*, minus*
        // - LocalTime.plusMinutes(long minutesToAdd)
        // - LocalDate.minusWeeks(long weeksToSubtract)

        // The DataTimeFormatter Class
        // - The DateTimeFormatter class helps print the parse data-time object; it provides the entry point of printing and parsing, as well as commom implementations of DateTimeFormatter

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        LocalDate date = LocalDate.now();
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(formatter);
        System.out.println(date);
        System.out.println(text);
        System.out.println(parsedDate);


        // The Period Class
        // - The Period class models a quantity of amount of time in terms of years, months, and days.
        // Methods for creating a new instance: parse, of*, with*
        // - Period.parse(CharSequence text)
        // - Period.ofDays(int days)
        // - Period.withMonths(int months)

        // Methods for getting Period information: get*
        // Period.getYears()

        // Methods for computing another Period: plus*, minus*
        // Period.plusDays(long daysToAdd)
        // Period.minusDays(long daysToSubtract)

    }
}
