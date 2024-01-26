package hashmap;
import java.util.HashMap;
public class StudentHashMap{
    private HashMap<String, Student> s;

    public StudentHashMap() {

        this.s = new HashMap<>();
    }
    public void addStudent(Student student) {
        s.put(student.firstName, student);
    }

    public Student getStudentByName(String firstName) {
        return s.get(firstName);
    }

}