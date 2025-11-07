import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReadRegionSales {

    // 📘 Method to calculate total sales grouped by the chosen field
   

    // 🧮 Main program with menu
    public static void main(String[] args) {
        String path = "Sales.txt";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sales Grouping Menu ===");
            System.out.println("1. Group by Date");
            System.out.println("2. Group by Region");
            System.out.println("3. Group by Rep ID");
            System.out.println("4. Group by Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }

            int fieldIndex;
            switch (choice) {
                case 1: fieldIndex = 0; break; // Date
                case 2: fieldIndex = 1; break; // Region
                case 3: fieldIndex = 2; break; // Rep ID
                case 4: fieldIndex = 3; break; // Product
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            calculateGroupSales(path, fieldIndex);
        }

        sc.close();
    }


     public static void calculateGroupSales(String path, int fieldIndex) {
        try {
            File f1 = new File(path);
            Scanner inp = new Scanner(f1);
            Map<String, Integer> fieldSales = new HashMap<>();

            inp.nextLine(); // Skip header line

            while (inp.hasNextLine()) {
                String line = inp.nextLine();
                String[] fields = line.split("\t");

                if (fields.length < 6) continue;

                try {
                    String key = fields[fieldIndex]; // field based on user's choice
                    int qty = Integer.parseInt(fields[4]);
                    int uPrice = Integer.parseInt(fields[5]);
                    int amount = qty * uPrice;

                    fieldSales.put(key, fieldSales.getOrDefault(key, 0) + amount);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number in line, skipping...");
                }
            }

            inp.close();

            System.out.println("\nGroup\tTotal Sales");
            System.out.println("----------------------");
            for (Map.Entry<String, Integer> entry : fieldSales.entrySet()) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("File can't be opened: " + fnfe.getMessage());
        }
    }
}
