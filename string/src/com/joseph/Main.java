package com.joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Creating a String

        // - Use a String literal value
        String string = "Joseph";

        // - Use a String constructor
        String string2 = new String("Jose");

        // Replacement Methods
        // Characters of the current string may be replaced using the replace, replaceAll or replaceFirst method;
        // - replace (replaces all the occurrences of a character or sequence in this string with a new one)
        // - replaceAll (replaces each substring of this string that matches the given regular expression)
        // - replaceFirst

        String oldString = "Flatiron School";
        String newString = oldString.replaceAll("\\s", "-");
        System.out.println(newString);

        // Method split - splits the current string around matches of the given regular expression

        // Method concat - concatenates the specified string to the end of the current string

        // Method join - returns a new String composed of copies of the elements joined together

        // Method format - returns a formatted string using the specified format string and arguments

    }
}
