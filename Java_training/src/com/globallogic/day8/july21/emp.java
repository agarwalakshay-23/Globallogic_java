package com.globallogic.day8.july21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class emp {
	public static void main(String args[])
    {
        // Creating an empty ArrayList
        ArrayList<Integer> list
            = new ArrayList<Integer>();
  
        // Use add() method to add
        // elements into the list
        list.add(10);
        list.add(15);
        list.add(30);
        list.add(20);
        list.add(5);
  
        // Displaying the list
        System.out.println("The list is: \n"
                           + list);
        Collections.sort(list);
        // Create an iterator for the list
        // using iterator() method
        //Collections.sort(list);
        Iterator<Integer> iter = list.iterator();
        //Collections.sort(list);
  
        // Displaying the values
        // after iterating through the list
        System.out.println("\nThe iterator values"
                           + " of list are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

}
