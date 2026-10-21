import java.util.Scanner;

public class IT26102714Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i + ":");
            System.out.print("Enter marks: ");

            int m1 = input.nextInt();
            int m2 = input.nextInt();
            int m3 = input.nextInt();
            int m4 = input.nextInt();

            double average = (m1 + m2 + m3 + m4) / 4.0;

            String grade;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Grade is : " + grade);
            System.out.println();
        }

        input.close();
    }
}