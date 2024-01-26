package hashmap;
import hashmap.StudentHashMap;
import org.junit.Test;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testGetStudentByName() {
        Student Manasa = new Student("Manasa", "a", 3.8);
        Student vijaya = new Student("vijaya", "v", 4.0);
        Student manu = new Student("manu", "m", 3.5);
        Student mounika = new Student("mounika", "m", 3.8);
        Student Ravi = new Student("Ravi", "s", 4.0);
        Student Mouni = new Student("Mouni", "l", 3.5);
        Student Swetha = new Student("Swetha", "p", 3.8);
        Student sunitha = new Student("sunitha", "s", 4.0);

        StudentHashMap stud = new StudentHashMap();
        stud.addStudent(Manasa);
        stud.addStudent(vijaya);
        stud.addStudent(manu);
        stud.addStudent(mounika);
        stud.addStudent(Ravi);
        stud.addStudent(Mouni);
        stud.addStudent(Swetha);
        stud.addStudent(sunitha);

        assertEquals(Manasa, stud.getStudentByName("manasa"));
        assertEquals(vijaya, stud.getStudentByName("vijaya"));
        assertEquals(sunitha, stud.getStudentByName("sunitha"));

    }

}