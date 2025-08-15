//Reading Words and Counting Word Lengths
import java.io.*;
import java.util.*;

public class WordLengthCount {
    public static void main(String[] args) {
        String[] words = new String[100];
        int count = 0;

        try {
            Scanner sc = new Scanner(new File("words.txt"));
            while (sc.hasNext() && count < words.length) {
                words[count] = sc.next();
                count++;
            }
            sc.close();

            System.out.println("Words and their lengths:");
            for (int i = 0; i < count; i++) {
                System.out.println(words[i] + " -> " + words[i].length() + " characters");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
