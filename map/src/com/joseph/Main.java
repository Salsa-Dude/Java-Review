package com.joseph;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a complied high level, object oriented, platform independent language");
        languages.put("Python", "an interperted, object oriented, high level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");

        // retrieve values by using the get and specifying the key
        System.out.println(languages.get("Java"));

        // Since keys can only be unique, it overwrites the previous value
        languages.put("Java", "currently learing java");
        System.out.println(languages.get("Java"));

        // Check to see if key is already in map by using containKey method
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about java");
        }


        System.out.println("========================================================");

        // Removing a key/value pair in map
        // remove methods returns a boolean
        languages.remove("Java");

        // Removing a key/value only if matches
        if(languages.remove("Python", "testing")) {
            System.out.println("Python has been removed");
        } else {
            System.out.println("Python not removed, key and value don't match");
        }

        // Replacing a key in map
        languages.replace("Algol", "replace description");

        // Another way to replace keys
        // Only when both key/value matches
        if(languages.replace("Algol", "replace description", "has been replaced twice")) {
            System.out.println("Got it");
        }

        // keySet return a set
        for(String key : languages.keySet()) {
            System.out.println(key + " " + languages.get(key));
        }


    }
}
