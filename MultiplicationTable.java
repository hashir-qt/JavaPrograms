public class MultiplicationTable {
  public static void main(String[] args) {
      int size = 12;

      // Printing the top header row
      System.out.print("     ");  // For the top-left empty corner
      // Columns header
      for (int i = 1; i <= size; i++) {
          System.out.printf("%4d", i );
      }
      System.out.println(); // for Moving to the next line

      // Print the table
      for (int row = 1; row <= size; row++) {
          System.out.printf("%4d-", row);   // Rows header

          for (int col = 1; col <= size; col++) {
              System.out.printf("%4d", row * col);
          }
          System.out.println(); // Move to the next row
      }
      System.out.println("             ------------------------");
  }
}
