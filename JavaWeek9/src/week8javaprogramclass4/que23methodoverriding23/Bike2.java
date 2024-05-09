package week8javaprogramclass4.que23methodoverriding23;

public class Bike2 extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 b = new Bike2();
        b.run();
    }


}
