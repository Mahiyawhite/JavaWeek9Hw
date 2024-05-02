package que3to11javaclass5;
/*Write a Java program to test an array list is empty or not. Define array list with
underground tube names*/

import java.util.ArrayList;

public class Que5Underground {
    public static void main(String[] args) {
        ArrayList<String> tubeName = new ArrayList<>();

        tubeName.add("Piccadilly line");
        tubeName.add("Central Line");
        tubeName.add("District Line");
        tubeName.add("Jubilee Line");

        if (tubeName.isEmpty()) {
            System.out.println("Underground tube arraylist is empty");
        } else {
            System.out.println("Underground tube arraylist is not empty");
            System.out.println("tube names of list: ");
            for (String tubeNames : tubeName);
                System.out.println(tubeName);
            }
        }
    }





