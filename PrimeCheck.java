import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter an integer to check if it's a prime: ");
        int number = input.nextInt();

        // Handle edge cases
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } 
        else {
            boolean isPrime = true;
            int divisor = 2;

            // Check divisibility up to the square root of the number
            while (divisor * divisor <= number) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }

            // Output result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } 
            else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
