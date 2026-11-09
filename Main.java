class Student {

    // Instance Variables
    int studentId;
    String studentName;
    String courseName;

    // Static Variables
    static String instituteName = "Bala Labs";
    static int totalStudents = 0;

    // Static Block
    static {
        System.out.println("Student Management System Initialized");
    }

    // Parameterized Constructor
    Student(int studentId, String studentName, String courseName) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;

        totalStudents++;
    }

    // Static Method
    static void displayTotalStudents() {

        System.out.println("Total Students: " + totalStudents);
    }

    // Instance Method
    void displayStudentDetails() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Course: " + courseName);
        System.out.println("Institute: " + instituteName);

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating Three Student Objects

        Student s1 = new Student(101, "Arun", "Java Full Stack");

        Student s2 = new Student(102, "Priya", "Python Full Stack");

        Student s3 = new Student(103, "Karthik", "MERN Stack");

        // Displaying Student Details

        s1.displayStudentDetails();

        s2.displayStudentDetails();

        s3.displayStudentDetails();

        // Display Total Students

        Student.displayTotalStudents();

        // Updating Static Variable Using Class Name

        Student.instituteName = "Bala Labs Academy";

        System.out.println("After Updating Institute Name:");

        // Displaying Updated Student Details

        s1.displayStudentDetails();

        s2.displayStudentDetails();

        s3.displayStudentDetails();

        // Creating Anonymous Object

        System.out.println("Anonymous Object:");

        new Student(104, "Divya", "Java Full Stack").displayStudentDetails();

        // Display Total Students Again

        Student.displayTotalStudents();
        

    }
}