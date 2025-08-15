import java.util.Scanner;

public class ArrayStats {

    // Method to read integers into an array
    public static void readArray(int[] arr, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
    }

    // Method to find the maximum value
    public static int findMax(int[] arr, int size) {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the minimum value
    public static int findMin(int[] arr, int size) {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        readArray(numbers, size);

        int max = findMax(numbers, size);
        int min = findMin(numbers, size);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
