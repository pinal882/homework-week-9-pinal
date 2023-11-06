package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a java program to create a new array list,add some colours(string) and
 * printout the collection using for each loop
 */
public class Program_4_NewArrayListStringColours {
    public static void main(String[] args) {
        ArrayList<String > colour = new ArrayList<>();//creating arrayList
        colour.add("Black");
        colour.add("Pink");
        colour.add("Orange");
        colour.add("Green");
        colour.add("Yellow");

        for (String list : colour){//using for each loop
            System.out.println(list);
        }

        }

}
