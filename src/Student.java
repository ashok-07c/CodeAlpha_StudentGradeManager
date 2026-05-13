public class Student {
    String name;
    int marks;

    public String getGrade() {
        if (marks >= 90) {
            return "S";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else if (marks >= 40) {
            return "E";
        } else {
            return "F";
        }

    }
}
