package functionalinterfaces;
import functionalinterfaces.Factorial;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void checkfactorialtest(){
        int input1=1;
        int result= Factorial.checkfactorial(input1);
        assertEquals(1,result);
    }
    @Test
    public void checkfactorialtest1(){
        int input1=12;
        int result=Factorial.checkfactorial(input1);
        assertEquals(479001600,result);
    }
}
