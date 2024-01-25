package collectionsTest;
import collections.Student;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
public class StudentTest {
    @Test
    public void testFilterStudents() {
        ArrayList<Student> sl = new ArrayList<>();
        sl.add(new Student("Sravs", "M", 3.9));
        sl.add(new Student("Manasa", "A", 3.0));
        sl.add(new Student("Ravi", "A", 2.0));
        sl.add(new Student("Swetha", "M", 4.0));

        Student.filterStudents(sl);
        assertEquals(2, sl.size());
    }
}