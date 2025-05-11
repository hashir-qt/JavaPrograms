public class ByteOverflowDemo {
    public static void main(String[] args) {
        byte value = 1; // Initial value

        System.out.println("Multiplying byte value by 2 for 8 times:");

        for (int i = 1; i <= 8; i++) {
            System.out.println("Iteration " + i + ": " + value);
            value = (byte)(value * 2); // Multiplying and casting back to byte
        }

        // Final explanation
        System.out.println("\nExplanation:");
        System.out.println("The byte data type can hold values from -128 to 127.");
        System.out.println("After crossing 127, it wraps around to the negative range (overflow).");
    }
}
