import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        do {
            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            sc.nextLine();

            System.out.println("Choose operation (+, -, *, /):");
            char op = sc.nextLine().charAt(0);

            double result;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.println("--------------------------------------------------");
            System.out.println("Do you want to perform another calculation? (y/n):");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Thanks for using the calculator!");
        sc.close();
    }
}
