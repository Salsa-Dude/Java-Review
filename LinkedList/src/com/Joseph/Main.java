package com.Joseph;


// Linked list is a alternative to arrays
// How it works is that it actually stores the actual link to the next item in the list
// - as well as the actual data so hence the name linked list.
// So in other words each element in the list actually holds a link to the item that
// - follows it, as well as the actual value you're wanting to actually store as well.

//        ListIterator that allows us to traverse the list in both directions (forward and backward).
//        A ListIterator has no current element;
//        its cursor position always lies between the element that would be returned by a call to previous()
//        and the element that would be returned by a call to next().


import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Richmond");
        addInOrder(placesToVisit, "San Miguel");
        addInOrder(placesToVisit, "Rome");
        addInOrder(placesToVisit, "Miami");
        addInOrder(placesToVisit, "Vegas");
        addInOrder(placesToVisit, "Paris");

        printList(placesToVisit);

        addInOrder(placesToVisit, "DC");
        addInOrder(placesToVisit, "Miami");

        printList(placesToVisit);
        visit(placesToVisit);



    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()) {
            System.out.println("Now visting " + i.next());
        }

        System.out.println("===========================================");


    }


    // Advanages of LinkedList

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
//        ListIterator that allows us to traverse the list in both directions (forward and backward).
//        A ListIterator has no current element;
//        its cursor position always lies between the element that would be returned by a call to previous()
//        and the element that would be returned by a call to next().
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            System.out.println(comparison);
            if (comparison == 0) {
                System.out.println(newCity + " is already included in the list");
                return false;
            } else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // Move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void printMenu() {
        System.out.println("Available action:\n press");
        System.out.println("0 - to quit\n" +
                        "1 - go to next city\n" +
                        "2 - go to previous city\n" +
                        "3 - print menu options");
    }


    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the list");
        } else {
            System.out.println("Now visting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }

                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now Visting " + listIterator.next());
                    } else {
                        System.out.println("Reach the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }

                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the array");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }

    }
}
