package homeworkweek9;

import java.util.HashSet;

/**
 * Use a Hashset that stores integer objects. store the number 4,7 and 8 to sets.
 * show which numbers between 1 and 10 are in the set
 * hint: use for loop and if else
 */

public class Program_8_HashSetIntegerObjects {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
    //Add values to the set
numbers.add(4);
numbers.add(7);
numbers.add(8);

//Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <=10; i++){
            if (numbers.contains(i)){
                System.out.println(i + "was found in the set.");
            }else {
                System.out.println(i + " was not found in the set.");
            }
        }



}
}
