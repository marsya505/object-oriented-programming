import java.util.Scanner;
public class Practicum2Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result = 0;
        char op;

        System.out.print("Enter number 1: ");
        num1 = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        op = input.next().charAt(0);
        System.out.print("Enter number 2: ");
        num2 = input.nextDouble();

        if (op == '+') result = num1 + num2;
        else if (op == '-') result = num1 - num2;
        else if (op == '*') result = num1 * num2;
        else if (op == '/') {
            if (num2 != 0) result = num1 / num2;
            else {
                System.out.println("Error: Division by zero!");
                input.close();
                return;
            }
        } else {
            System.out.println("Invalid operator.");
            input.close();
            return;
        }
        System.out.println("Result: " + result);
        input.close();
    }
}
