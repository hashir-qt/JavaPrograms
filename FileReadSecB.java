import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadSecB {
    public static void main(String[] args) {
        String path = "C:\\Program Files\\Sales.txt";
        Scanner inp;
        try {
            File f1 = new File(path);
            inp = new Scanner(f1);
            String[] fields;
            String line;
            int amount, total = 0;
            int qty, uPrice;
            inp.nextLine(); // Skip header

            if (inp.hasNextLine()) {
                line = inp.nextLine();
                fields = line.split("\t");

                
                String empID = fields[2];

                while (inp.hasNextLine()) {
                    total = 0;

                    while (fields.length == 6 && fields[2].equals(empID)) {
                        try {
                            qty = Integer.parseInt(fields[4]);
                            uPrice = Integer.parseInt(fields[5]);
                            amount = qty * uPrice;
                            total += amount;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number in line, skipping...");
                        }

                        if (inp.hasNextLine()) {
                            line = inp.nextLine();
                            fields = line.split("\t");
                        } else {
                            break;
                        }
                    }

                    System.out.println(empID + "\t" + total);

                    if (!inp.hasNextLine()) {
                        break;
                    } else if (fields.length >= 6) {
                        empID = fields[2];
                    } else {
                        break;
                    }
                }
            }

            inp.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File can't be opened");
        }
    }
}
