package collections;
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
    public static void filterStudents(ArrayList<Student> stu) {
        double temp = 0;
        for (Student student : stu) {
            temp = temp+student.gpa;
        }
        double averageGPA = temp / stu.size();

        stu.removeIf(student -> student.gpa < averageGPA);
    }
    public static void main(String[] args) {
        ArrayList<Student> sl = new ArrayList<>();

        sl.add(new Student("Sravs", "M", 3.9));
        sl.add(new Student("Manasa", "A", 3.2));
        sl.add(new Student("Ravi", "A", 3.0));
        sl.add(new Student("Swetha", "M", 4.0));

        filterStudents(sl);

        System.out.println("Remaining Students:");
        for (Student student : sl) {
            System.out.println("firstName: " + student.firstName + "  LastName: " + student.lastName + ", GPA: " + student.gpa);
        }
    }
}