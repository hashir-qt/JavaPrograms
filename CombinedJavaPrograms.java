
import java.util.Scanner;
import java.time.LocalTime;

public class CombinedJavaPrograms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Java Mini Programs ---");
            System.out.println("1. Addition with User Input");
            System.out.println("2. Even or Odd Checker");
            System.out.println("3. Multiplication Table Generator");
            System.out.println("4. Greeting Based on Time");
            System.out.println("5. Square of a Number (OOP Method)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTwoNumbers(scanner);
                    break;
                case 2:
                    checkEvenOdd(scanner);
                    break;
                case 3:
                    printMultiplicationTable(scanner);
                    break;
                case 4:
                    greetBasedOnTime();
                    break;
                case 5:
                    calculateSquare(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    // 1. Addition
    public static void addTwoNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }

    // 2. Even or Odd
    public static void checkEvenOdd(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    // 3. Multiplication Table
    public static void printMultiplicationTable(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    // 4. Greeting Based on Time
    public static void greetBasedOnTime() {
        int hour = LocalTime.now().getHour();
        System.out.println(hour);
    }

    // 5. Square Calculation using Class
    public static void calculateSquare(Scanner scanner) {
        MathOperations math = new MathOperations();
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Square of " + num + " is: " + math.square(num));
    }
}

class MathOperations {
    int square(int number) {
        return number * number;
    }
}

