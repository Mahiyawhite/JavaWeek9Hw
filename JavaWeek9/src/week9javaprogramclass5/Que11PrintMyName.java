package week9javaprogramclass5;
/*Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.*/

public class Que11PrintMyName {
    public static String myName = "Vaishali";

    public static void main(String[] args) {
        String[] groupNames = {"Kinjal", "Dhara", "Deval", "Priya", "Vaishali"};

        for (String member : groupNames) {
            if (member.equals(myName)) {
                System.out.println("My Name is " + myName);
            }
        }
    }
}
