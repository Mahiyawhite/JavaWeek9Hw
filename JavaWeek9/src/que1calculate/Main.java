package que1calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Please enter one of symbol +,-,*,/: ");
        char symbol = scan.next().charAt(0);

        System.out.print("Enter second Number: ");
        int num2 = scan.nextInt();

        calculator.calculateResult(num1, num2, symbol);

    }
}
