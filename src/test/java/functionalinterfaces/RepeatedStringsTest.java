package functionalinterfaces;

import functionalinterfaces.RepeatedStrings;
import org.junit.Test;
public class RepeatedStringsTest {
    @Test
    public void checkrepeatedstringstest(){
        String str="manasa";
        RepeatedStrings.repeatedchars(str);
    }

    @Test
    public void checkrepeatedstringstest1(){
        String str="Hello World";
        RepeatedStrings.repeatedchars(str);
    }
}