package oops;

// ACCESS FROM STUDENT CLASS
public class StudentDetails {
    public static void main(String[] args) {
        // OBJECT OF STUDENT CLASS
        Student std;
        std = new Student();

        // OBJECT VARIABLE
        std.studentId = 119384;
        std.studentName = "MAX";
        std.studentCity = "Texas";

        std.showDetails();
    }
}
