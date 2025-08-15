//Reading Integers and Calculating Average
import java.io.*;
import java.util.*;

public class AverageFromFile {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int count = 0, sum = 0;

        try {
            Scanner sc = new Scanner(new File("numbers.txt"));
            while (sc.hasNextInt() && count < numbers.length) {
                numbers[count] = sc.nextInt();
                sum += numbers[count];
                count++;
            }
            sc.close();

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Average of numbers: " + average);
            } else {
                System.out.println("No numbers found in file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
