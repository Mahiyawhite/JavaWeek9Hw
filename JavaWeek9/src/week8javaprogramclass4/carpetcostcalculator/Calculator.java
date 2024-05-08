package week8javaprogramclass4.carpetcostcalculator;

public class Calculator {
    public Floor floor;
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
