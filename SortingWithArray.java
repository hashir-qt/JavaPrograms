import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortingWithArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Load data from file
        String[][] data = loadData("sales.txt");
        if (data == null) {
            System.out.println("Error loading data.");
            return;
        }

        int choice;
        do {
            System.out.println("\n=== Sort Sales Records ===");
            System.out.println("1. Sort by Product");
            System.out.println("2. Sort by Region");
            System.out.println("3. Sort by Rep ID");
            System.out.println("4. Sort by Quantity");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sortByString(data, 3); // Product
                    displayData(data);
                    break;
                case 2:
                    sortByString(data, 1); // Region
                    displayData(data);
                    break;
                case 3:
                    sortByString(data, 2); // Rep ID
                    displayData(data);
                    break;
                case 4:
                    sortByInt(data, 4); // Quantity
                    displayData(data);
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 0);
    }

    // Function to load file data into 2D String array
    public static String[][] loadData(String filename) {
        String[][] temp = new String[100][6]; // Assume max 100 rows
        int row = 0;

        try {
            Scanner fileScanner = new Scanner(new File(filename));
            fileScanner.nextLine(); // skip header
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\t");
                if (parts.length == 6) {
                    for (int i = 0; i < 6; i++) {
                        temp[row][i] = parts[i];
                    }
                    row++;
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return null;
        }

        // Copy to exact-sized array
        String[][] data = new String[row][6];
        for (int i = 0; i < row; i++) {
            System.arraycopy(temp[i], 0, data[i], 0, 6);
        }

        return data;
    }

    // Display data
    public static void displayData(String[][] data) {
        System.out.println("Date\tRegion\tRep ID\tProduct\tQty\tUnit Price");
        for (String[] row : data) {
            for (String item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    // Sort by string field
    public static void sortByString(String[][] data, int colIndex) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i][colIndex].compareTo(data[j][colIndex]) > 0) {
                    // Swap entire rows
                    String[] temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    // Sort by integer field
    public static void sortByInt(String[][] data, int colIndex) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                int a = Integer.parseInt(data[i][colIndex]);
                int b = Integer.parseInt(data[j][colIndex]);
                if (a > b) {
                    // Swap entire rows
                    String[] temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
