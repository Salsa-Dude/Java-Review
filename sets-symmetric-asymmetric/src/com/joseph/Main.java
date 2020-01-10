package com.joseph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");

        // Create a new HashSet populated with squares' numbers.
        // union contains both elements from squares and cubes
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements");

        // The returned set contains all elements that are contained by both backing sets
        //  retains all matching elements in the current Set instance that match all elements from the Collection Set passed as a parameter to the method.
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        System.out.println(natureWords);
        // This method takes the array natureWords which is required to be converted into a List.
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive"};
        divine.addAll(Arrays.asList(divineWords));




    }

}
