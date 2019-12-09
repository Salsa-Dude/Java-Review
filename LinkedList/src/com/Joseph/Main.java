package com.Joseph;


// Linked list is a alternative to arrays
// How it works is that it actually stores the actual link to the next item in the list
// - as well as the actual data so hence the name linked list.
// So in other words each element in the list actually holds a link to the item that
// - follows it, as well as the actual value you're wanting to actually store as well.


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("Barcelone");
        placesToVisit.add("San Miguel");
        placesToVisit.add("Rome");
        placesToVisit.add("Miami");
        placesToVisit.add("Vegas");
        placesToVisit.add("Paris");

        printList(placesToVisit);

        placesToVisit.add(1, "Costa rica");

        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

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
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
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
    }
}
