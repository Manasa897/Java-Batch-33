package list;

import java.util.ArrayList;
public class Student {
    String firstName;
    String lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    public static void main(String[] args) {
        ArrayList<Student> sl = new ArrayList<>();

        sl.add(new Student("Manasa", "R", 3.9));
        sl.add(new Student("Vijaya", "p", 3.0));
        sl.add(new Student("Jahnavi", "S", 3.7));
        sl.add(new Student("mounika", "R", 4.0));

        double temp = 0;
        for (Student student : sl) {
            temp = temp+student.gpa;
        }
        double averageGPA = temp / sl.size();

        sl.removeIf(student -> student.gpa < averageGPA);

        System.out.println("Remaining Students:");
        for (Student student : sl) {
            System.out.println("firstName: " + student.firstName + "  LastName: " + student.lastName + ", GPA: " + student.gpa);
        }
    }
}