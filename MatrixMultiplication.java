public class MatrixMultiplication {
    public static void main(String[] args) {
        // 3x4 Matrix A
        int[][] A = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // 4x2 Matrix B
        int[][] B = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8}
        };

        // Resultant 3x2 Matrix C
        int[][] C = new int[3][2];

        // Matrix multiplication logic (3 nested loops)
        for (int i = 0; i < 3; i++) {          // Rows of A
            for (int j = 0; j < 2; j++) {      // Columns of B
                C[i][j] = 0;
                for (int k = 0; k < 4; k++) {  // Columns of A / Rows of B
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print Result
        System.out.println("Resultant Matrix (A × B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
