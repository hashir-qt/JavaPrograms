import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] n = new double[10];
        int i = 0;
      while (n[i] != 0) {
        n[0] = inp.nextDouble();
        
        double t = 0;
        while (n[i] != 0) {
            t += n[i];
            i += 1;
            System.err.println(t);
        }
      }
       
    }
}
