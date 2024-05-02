package week9javaprogramclass5;
/*Write program and add all group names in to array and iterates through for
each loop.*/

import java.util.ArrayList;

public class Que9GroupNames {
    public static void main(String[] args) {

        ArrayList<String> groupname = new ArrayList<>();

        groupname.add("Java1");
        groupname.add("Java2");
        groupname.add("Java3");
        groupname.add("Java4");

        System.out.println("Group Name:");
        for (String group : groupname);
        System.out.println(groupname);

    }
}
