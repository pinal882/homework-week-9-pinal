package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a java program to retrieve an element (at a specified index) from a given array list
 */
public class Program_6_RetrieveAnElementFromArrayList {
    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>();
        list.add("Pink");
        list.add("Black");
        list.add("Red");
        list.add("Orange");
        list.add("White");
// Print the list
        System.out.println(list);
        //Retrieve the first and third element
        String element = list.get(0);
        System.out.println("First element: " +element);
        element = list.get(2);
        System.out.println("Third element: " + element);

    }

}
