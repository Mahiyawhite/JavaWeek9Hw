package week8javaprogramclass4.encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate e = new Encapsulate();
        e.setName("Vaishali");
        e.setAge(25);
        e.setRollNo(12);
        System.out.println("Codebuster Name " + e.getName());
        System.out.println("Codebuster age " + e.getAge());
        System.out.println("codebuster rollNo " + e.getRollNo());
    }
}
