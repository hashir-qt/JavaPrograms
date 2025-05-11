import java.util.Random;

public class MonthValues {
    public static void main(String[] args) {
        // Array of month names
        String[] months = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December" };

        // Array to store 12 random decimal values
        double[] values = new double[12];

        // Random number generator
        Random random = new Random();

        // Fill the values array with random numbers between 0.0 and 100.0
        for (int i = 0; i < 12; i++) {
            values[i] = random.nextDouble() * 100;
        }

        // Display month names and corresponding values
        System.out.println("Month\t\tValue");
        System.out.println("------------------------");
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-10s\t%.2f\n", months[i], values[i]);
            sum += values[i];
        }

        // Calculate and display average
        double average = sum / 12;
        System.out.printf("\nAverage of the 12 values: %.2f\n", average);
    }
}
