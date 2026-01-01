import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayLists to store student data
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();

        System.out.println("===== Student Grade Tracker =====");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();   // clear buffer

        // Input section
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Student Name: ");
            String name = sc.nextLine();

            System.out.print("Student Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            studentNames.add(name);
            studentMarks.add(marks);
        }

        // Calculations
        int totalMarks = 0;
        int highestMarks = studentMarks.get(0);
        int lowestMarks = studentMarks.get(0);

        for (int marks : studentMarks) {
            totalMarks += marks;

            if (marks > highestMarks) {
                highestMarks = marks;
            }

            if (marks < lowestMarks) {
                lowestMarks = marks;
            }
        }

        double averageMarks = (double) totalMarks / n;

        // Summary Report
        System.out.println("\n===== Student Summary Report =====");
        System.out.println("Name\tMarks");
        System.out.println("----------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(studentNames.get(i) + "\t" + studentMarks.get(i));
        }

        System.out.println("----------------------");
        System.out.println("Average Marks : " + averageMarks);
        System.out.println("Highest Marks : " + highestMarks);
        System.out.println("Lowest Marks  : " + lowestMarks);

        sc.close();
    }
}
