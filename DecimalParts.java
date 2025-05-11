public class DecimalParts {
    public static void main(String[] args) {
        double value = 1234.5678;

        // Extract the integer part
        long integerPart = (long) value;

        // Extract fractional part
        double fractionalPart = value - integerPart;

        // Shift decimal to get the first 4 digits of fractional part
        int shiftedFraction = (int)(fractionalPart * 10000);

        // Store in a short variable
        short fractionalDigits = (short) shiftedFraction;

        // Display results
        System.out.println("Original double value: " + value);
        System.out.println("Integer part (long): " + integerPart);
        System.out.println("First 4 digits of fractional part (short): " + fractionalDigits);
    }
}
