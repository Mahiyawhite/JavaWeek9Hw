package que3to11javaclass5;
/*Write program and add all group members names in to array and iterates
through for each loop and print your name.*/

import java.util.ArrayList;

public class Que10GroupMembers {
    public static void main(String[] args) {
        ArrayList<String> membersname = new ArrayList<>();

        membersname.add("Kinjal");
        membersname.add("Vaishali");
        membersname.add("Deval");
        System.out.println(membersname.get(1));
    }
}
