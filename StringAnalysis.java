public class StringAnalysis {
    public static int stringLength(String s) {
        return s.length();
    }

    public static int wordCount(String s) {
        if (s.trim().isEmpty()) return 0;
        return s.trim().split("\\s+").length;
    }

    public static int sumOfLengthAndWords(String s) {
        return stringLength(s) + wordCount(s);
    }

    public static void main(String[] args) {
        String input = "Hello world from Java";
        int result = sumOfLengthAndWords(input);
        System.out.println("Sum of string length and word count: " + result);
    }
}
