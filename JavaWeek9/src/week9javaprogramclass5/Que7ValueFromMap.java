package week9javaprogramclass5;
/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/

import java.util.HashMap;

public class Que7ValueFromMap {
    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();

        people.put("Dipak", 42);
        people.put("Vaishali", 39);
        people.put("Mahi", 14);
        people.put("Diya", 11);

        System.out.println("value from Map: ");
        for (Integer age : people.values()) {

            System.out.println(people);
            break;

            }
        }
    }

