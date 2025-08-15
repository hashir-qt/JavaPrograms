public class DaySelector {
    public static void main(String[] args) {
        int[] dayInputs = {1, 0, -8, 3, 5, 7}; // test inputs

        for (int day : dayInputs) {
            // Skip invalid input before switch
            if (day < 1 || day > 7) {
                System.out.println("Invalid day: " + day + " (Skipping)");
                continue;
            }

            // Valid day: use switch to print the corresponding name
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
}
