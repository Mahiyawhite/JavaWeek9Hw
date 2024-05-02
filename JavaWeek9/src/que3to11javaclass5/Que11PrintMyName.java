package que3to11javaclass5;
/*Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.*/

import java.util.ArrayList;

public class Que11PrintMyName {
    public String myName = "Vaishali";

    public static void main(String[] args) {
        ArrayList<String> groupName = new ArrayList<>();
        groupName.add("Kinjal");
        groupName.add("Vaishali");
        groupName.add("Deval");
        System.out.print("My Name: ");
        for (String name : groupName);
        System.out.println(groupName.get(1));

    }

}
