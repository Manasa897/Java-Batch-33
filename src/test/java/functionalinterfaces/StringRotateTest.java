package functionalinterfaces;
import functionalinterfaces.StringRotate;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class StringRotateTest {

    @Test
    public void Rotationtest() {
        assertTrue(StringRotate.isRotation("abcd", "dabc"));
    }
    @Test
    public void rotationtest1(){
        assertTrue(StringRotate.isRotation("", ""));
    }
    @Test
    public void Rotationtest2() {
        assertFalse(StringRotate.isRotation(null, null));
    }
}