import java.util.Random;

public class LotteryGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate 5 sets
        for (int set = 1; set <= 5; set++) 
        {
            int[] numbers = new int[6];
            int count = 0;

            while (count < 6) {
                int num = random.nextInt(49) + 1;
                boolean alreadyExists = false;

                // Check if number is already in the set
                for (int i = 0; i < count; i++) {
                    if (numbers[i] == num) {
                        alreadyExists = true;
                        break;
                    }
                }

                // If not duplicate, add to set
                if (!alreadyExists) {
                    numbers[count] = num;
                    count++;
                }
            }

            // Display the set
            System.out.print("Set " + set + ": ");
            for (int i = 0; i < 6; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }
}
