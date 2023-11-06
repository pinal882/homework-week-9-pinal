package homeworkweek9;

import java.util.HashMap;

/**
 * Create a Hashmap object called people that will store String keys and integer values.
 * use for each loop to iterate the value from Map
 */
public class Program_9_HashMapObject {

    public static void main(String[] args) {
        //Creating Hashmap object called people
        HashMap<String,Integer> people = new HashMap<>();
        //Storing keys and values(Name,Age)
        people.put("John ", 32);
        people.put("Steve ", 30);
        people.put("Michael",40);
        //using for each loop
        for (String i : people.keySet()){
            System.out.println("Name:" + i + " Age: " + people.get(i));
        }


    }
}
