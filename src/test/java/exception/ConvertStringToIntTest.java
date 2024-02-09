package exception;
import exceptions.ConvertStringToInt;
import org.junit.Test;

public class ConvertStringToIntTest {
    @Test
    public void Testcase1(){
        ConvertStringToInt.convertToInt("23");
        ConvertStringToInt.convertToInt("45.67");
        ConvertStringToInt.convertToInt("test");
        ConvertStringToInt.convertToInt("123f");
    }
}