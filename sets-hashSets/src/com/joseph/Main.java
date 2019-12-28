package com.joseph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
	// write your code here
        HeavenlyBody mercury = new HeavenlyBody("Mercury", 88);
        solarSystem.put(mercury.getName(), mercury);
        planets.add(mercury);

        HeavenlyBody venus = new HeavenlyBody("Venus", 225);
        solarSystem.put(venus.getName(), venus);
        planets.add(venus);

        HeavenlyBody earth = new HeavenlyBody("Earth", 365);
        solarSystem.put(earth.getName(), earth);
        planets.add(earth);

        HeavenlyBody moon = new HeavenlyBody("Moon", 27);
        solarSystem.put(moon.getName(), moon);
        earth.addMoon(moon);

        HeavenlyBody mars = new HeavenlyBody("Mars", 687);
        solarSystem.put(mars.getName(), mars);
        planets.add(mars);

        HeavenlyBody deimos = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(deimos.getName(), deimos);
        mars.addMoon(deimos); // temp is still Mars

        HeavenlyBody phobos= new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(phobos.getName(), phobos);
        mars.addMoon(phobos); // temp is still Mars

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        System.out.println("=================================================");

        HeavenlyBody earthBody = solarSystem.get("Earth");
        System.out.println("Moons of " + earthBody.getName());
        for(HeavenlyBody earthMoon : earthBody.getSatellites()) {
            System.out.println("\t" + earthMoon.getName());
        }

        HeavenlyBody mars2 = new HeavenlyBody("Mars", 687);
        solarSystem.put(mars.getName(), mars2);
        planets.add(mars2);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }







    }
}
