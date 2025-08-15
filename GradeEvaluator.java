public class GradeEvaluator {
    public static void main(String[] args) {
        char[] grades = {'A', 'B', 'X', 'C', 'Z', 'D', 'F'};

        

        for (char grade : grades) {
            System.out.println("Evaluating grade: " + grade);

            switch (grade) {
                case 'A':
                    System.out.println("Excellent");
                    break;
                case 'B':
                    System.out.println("Good");
                    break;
                case 'C':
                    System.out.println("Average");
                    break;
                case 'D':
                    System.out.println("Pass");
                    break;
                case 'F':
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Invalid grade: " + grade);
                    continue;
            }
        }
    }
}
