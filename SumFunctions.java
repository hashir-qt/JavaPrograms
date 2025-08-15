public class SumFunctions {

    // Function to return the sum of two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to return the square of an integer
    public static int square(int x) {
        return x * x;
    }

    // Function that returns the sum of add(a, b) and square(a)
    public static int sumOfFunctions(int a, int b) {
        int sumResult = add(a, b);
        int squareResult = square(a);
        return sumResult + squareResult;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int result = sumOfFunctions(a, b);
        System.out.println("Sum of add(" + a + ", " + b + ") and square(" + a + ") is: " + result);
    }
}
