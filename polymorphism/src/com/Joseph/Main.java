package com.Joseph;

// Polymorphism is the ability of an object to take on many forms
// Polymorphism is one of the OOPs feature that allows us to perform a single action in different ways.

// In Java polymorphism is mainly divided into two types:

//        1) Compile time Polymorphism
//        2)  Runtime Polymorphism

// Compile time polymorphism: It is also known as static polymorphism.
// This type of polymorphism is achieved by function overloading or operator overloading.

// Method Overloading:
// - When there are multiple functions with same name
// - but different parameters then these functions are said to be overloaded.

// Runtime polymorphism: It is also known as Dynamic Method Dispatch.
// - It is a process in which a function call to the overridden method is resolved at Runtime.
// - This type of polymorphism is achieved by Method Overriding.

// Method overriding
// - occurs when a derived class has a definition for one of the member functions of the base class.
// That base function is said to be overridden.


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "there is no plot";
    }

    public String getName() {
        return this.name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Shark eat alot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}




public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " +
                                "Plot " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number is " + randomNumber);

        switch(randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

        }
        return null;
    }
}
