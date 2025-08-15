import java.util.Scanner;

public class GaussJordan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of variables: ");
        int n = input.nextInt();
        
        double[][] matrix = new double[n][n + 1];

        // Input augmented matrix
        System.out.println("Enter the augmented matrix (coefficients and constants):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Gauss-Jordan Elimination
        for (int i = 0; i < n; i++) {
            // Make the diagonal element 1
            double divisor = matrix[i][i];
            for (int j = 0; j <= n; j++) {
                matrix[i][j] /= divisor;
            }

            // Make other elements in current column 0
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matrix[k][i];
                    for (int j = 0; j <= n; j++) {
                        matrix[k][j] -= factor * matrix[i][j];
                    }
                }
            }
        }

        // Display the result
        System.out.println("Solution:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.3f\n", (i + 1), matrix[i][n]);
        }

        input.close();
    }
}
