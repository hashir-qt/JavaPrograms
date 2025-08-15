//Reading Names from a File into an Array
import java.io.*;
import java.util.*;

public class ReadNames {
    public static void main(String[] args) {
        String[] names = new String[100];
        int count = 0;

        try {
            Scanner sc = new Scanner(new File("names.txt"));
            while (sc.hasNextLine() && count < names.length) {
                names[count] = sc.nextLine();
                count++;
            }
            sc.close();

            System.out.println("Names read from file:");
            for (int i = 0; i < count; i++) {
                System.out.println(names[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
