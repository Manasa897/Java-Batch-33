package strings;

import org.junit.Test;
import strings.Rotation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RotationTest {

    @Test
    public void testAreRotations() {
        assertTrue(Rotation.areRotations("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));
        assertFalse(Rotation.areRotations("hello", "holla"));
    }
    @Test
    public void testareRotate(){
        assertFalse(Rotation.areRotations("hello", "hell"));
        assertTrue(Rotation.areRotations("MBatch", "BatchM"));
    }
}