
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeManager gm = new GradeManager();
        while (true) {
            System.out.println("====Student Grade Management System====");
            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Calculate Average");
            System.out.println("4.Maximum marks");
            System.out.println("5.Minimum marks");
            System.out.println("6.Generate Report");
            System.out.println("7.Exit");
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 7) {
                break;
            } else if (choice == 1) {
                System.out.println("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.println("Enter Marks: ");
                int marks = sc.nextInt();

                gm.addStudent(name, marks);
            } else if (choice == 2) {
                gm.viewStudents();
            } else if (choice == 3) {
                double avg = gm.averageCalculator();
                System.out.println(avg);
            } else if (choice == 4) {
                int max = gm.getMaximumMarks();
                System.out.println(max);
            } else if (choice == 5) {
                int min = gm.getMinimumMarks();
                System.out.println(min);
            } else if (choice == 6) {
                gm.generateReport();
            }
        }
        sc.close();
    }
}