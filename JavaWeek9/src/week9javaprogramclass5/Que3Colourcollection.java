package week9javaprogramclass5;
/*Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.*/

import java.util.ArrayList;

public class Que3Colourcollection {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>();

        colour.add("Red");
        colour.add("Blue");
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Pink");
        System.out.println("Colours collection: ");
        for (String colours : colour);
        System.out.println(colour);

        //System.out.println(colour.get(2));
    }
}
