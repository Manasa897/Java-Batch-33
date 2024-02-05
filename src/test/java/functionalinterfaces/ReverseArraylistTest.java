package functionalinterfaces;

import org.junit.Test;
import functionalinterfaces.ReverseArraylist;
import java.util.ArrayList;

public class ReverseArraylistTest {
    @Test
    public void reversetest(){
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<String> expected=new ArrayList<>();
        arr.add("Manasa");
        arr.add("hello");
        expected.add("hello");
        expected.add("Manasa");
        ArrayList result=ReverseArraylist.reversearraylist(arr);
    }
    @Test
    public void reversetest1(){
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<String> expected=new ArrayList<>();
        arr.add(" ");
        arr.add("h");
        expected.add("h");
        expected.add(" ");
        ArrayList result=ReverseArraylist.reversearraylist(arr);
    }
}