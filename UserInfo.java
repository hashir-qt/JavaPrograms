// public class OddNumberSwitch {
//     public static void main(String[] args) {
//         int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9};

//         for (int num : numbers) {
//             if (num % 2 == 0) {
//                 System.out.println("Skipping even number: " + num);

//                 continue;
//             }

//             switch (num) {
//                 case 3:
//                     System.out.println("Three");
//                     break;
//                 case 5:
//                     System.out.println("Five");
//                     break;
//                 case 7:
//                     System.out.println("Seven");
//                     break;
//                 default:
//                     System.out.println("Odd number: " + num);
//             }
//         }
//     }
// }
import java.util.Scanner;

public class UserInfo {

    public static int BigNum(int a, int b){
        
        if(a > b){
        return a; 
    }
else{
    return b;
}
    }
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number: ");
     int num1 = sc.nextInt();
  System.out.print("Enter number: ");
     int num2 = sc.nextInt();
    int result = BigNum(num1, num2); 
     System.out.println(result);
    }
}
//  public static void main(String[] args) {
//         String[] lines = new String[100]; // Adjust if more lines
//         int lineCount = 0;
//         String header = "";

//         try {
//             Scanner sc = new Scanner(new File("C:\\Program Files\\Sales.txt"));
//             if (sc.hasNextLine()) {
//                 header = sc.nextLine(); // store header
//             }
//             while (sc.hasNextLine()) {
//                 lines[lineCount++] = sc.nextLine();
//             }
//             sc.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("File not found.");
//             return;
//         }

//         // Bubble sort by Product (index 3)
//         for (int i = 0; i < lineCount - 1; i++) {
//             for (int j = 0; j < lineCount - i - 1; j++) {
//                 String[] fields1 = lines[j].split("\t");
//                 String[] fields2 = lines[j + 1].split("\t");
//                 if (fields1[3].compareTo(fields2[3]) > 0) {
//                     // Swap lines
//                     String temp = lines[j];
//                     lines[j] = lines[j + 1];
//                     lines[j + 1] = temp;
//                 }
//             }
//         }
//               if (!sc.hasNextLine()) {
//                         break;
//                     } else if (fields.length >= 6) {
//                         empID = fields[2];
//                     } else {
//                         break;
//                     }
//         // Print result
//         System.out.println(header);
//         for (int i = 0; i < lineCount; i++) {
//             System.out.println(lines[i]);
//         }
//     }