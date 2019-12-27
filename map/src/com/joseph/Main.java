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

        // keySet return a set
        for(String key : languages.keySet()) {
            System.out.println(key + " " + languages.get(key));
        }


    }
}
