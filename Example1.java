import java.util.Scanner;

public class Example1 {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int cube(int b) {
        return b * b * b;
    }

    public static int sumOfFunctions(int a, int b) {
        return multiply(a, b) + cube(b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        int result = sumOfFunctions(a, b);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
