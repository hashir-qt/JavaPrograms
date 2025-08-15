import java.util.Random;
import java.util.Scanner;

public class RandomConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Allowed capital letters excluding vowels
        String alphabets = "BCDFGHJKLMNPQRSTVWXYZ";
        for(int i = 0; i <= alphabets.length() - 1;i++){
           System.out.print(alphabets.codePointAt(i));
        }
        
        // Ask the user how many letters to generate
        System.out.print("Enter how many random letters you want to generate (without vowels): ");
        int count = input.nextInt();

        // Generate and print the sequence
        System.out.print("Random sequence: ");
        int i = 0;
        while (i < count) {
            int index = random.nextInt(alphabets.length());
            char letter = alphabets.charAt(index);
            System.out.print(letter);
            i++;
        }

        System.out.println();
        input.close();
    }
}
