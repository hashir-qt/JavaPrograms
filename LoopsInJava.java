import java.util.Scanner;

public class LoopsInJava {
    public static void main(String[] args) {
        // int num = 5;
        // int i = 1;
        // int p =1;
        //  while (i <= num) {
        //     int j = 1;
        //     while (j <= i) {
        //         System.out.print("*");
        //         j += 1;
        //     }
        //        System.out.println("");
        //        i += 1;
        //  }
        //  i = 4;
        //  while (i >= 1) {
        //      p = 1;
        //      while (p <= i) {
        //         System.out.print("*");
        //         p += 1;
        //      }
        //        System.out.println("");
        //        i -= 1;
        //  }

        
        Scanner num;
        num = new Scanner (System.in);
        int c = 1;
        int i = 1;
         int n = num.nextInt();
         while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(c+ " ");
                c += 1;
                j += 1;
            }
            System.out.println(" ");
            i += 1;
         }

    }
}
