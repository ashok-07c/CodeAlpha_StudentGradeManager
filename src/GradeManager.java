import java.util.ArrayList;

public class GradeManager {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int marks) {
        Student s = new Student();
        s.name = name;
        s.marks = marks;
        students.add(s);
        System.out.println("Student added Successfully");
    }

    public void viewStudents() {
        if (students.size() == 0) {
            System.out.println("No Students Found");
            return;
        } else {
            for (Student s : students) {
                System.out.println("Name: " + s.name);
                System.out.println("Marks: " + s.marks);
            }
        }
    }

    public double averageCalculator() {
        if (students.size() == 0) {
            System.out.println("No Students Found");
            return 0;
        }
        int totalMarks = 0;
        for (Student s : students) {
            totalMarks += s.marks;
        }
        double avg = totalMarks / students.size();
        return avg;
    }

    public int getMaximumMarks() {
        if (students.size() == 0) {

            System.out.println("No Students Found");
            return 0;
        }

        int maxMarks = students.get(0).marks;

        for (Student s : students) {

            maxMarks = Math.max(maxMarks, s.marks);
        }

        return maxMarks;
    }

    public int getMinimumMarks() {

        if (students.size() == 0) {

            System.out.println("No Students Found");
            return 0;
        }

        int minMarks = students.get(0).marks;

        for (Student s : students) {

            minMarks = Math.min(minMarks, s.marks);
        }

        return minMarks;
    }

    public void generateReport() {
        if (students.size() == 0) {

            System.out.println("No Students Available");
            return;
        }

        System.out.println("\n====== FULL STUDENT REPORT ======");

        for (Student s : students) {

            System.out.println("Name   : " + s.name);
            System.out.println("Marks  : " + s.marks);
            System.out.println("Grade  : " + s.getGrade());

            System.out.println("---------------------------");
        }

        System.out.println("Total Students : " + students.size());

        System.out.println("Average Marks  : " + averageCalculator());

        System.out.println("Highest Marks  : " + getMaximumMarks());

        System.out.println("Lowest Marks   : " + getMinimumMarks());
    }

}
