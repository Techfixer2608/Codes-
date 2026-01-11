import java.util.Scanner;

public class LargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2;

        do {
            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Factorial");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    if (num2 != 0)
                        System.out.println("Result = " + (num1 / num2));
                    else
                        System.out.println("Cannot divide by zero!");
                    break;

                case 5:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 % num2));
                    break;

                case 6:
                    System.out.print("Enter base and power: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(num1, num2));
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Square Root = " + Math.sqrt(num1));
                    break;

                case 8:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial = " + fact);
                    break;

                case 9:
                    System.out.println("Exiting Calculator...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 9);

        sc.close();
    }
}
