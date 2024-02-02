package functionalinterfaces;


import functionalinterfaces.Sum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {
    @Test
    public void checksumtest(){
        int[] arr=new int[2];
        arr[0]=23;
        arr[1]=45;
        int result= Sum.sumofarray(arr);
        assertEquals(68,result);
    }
    @Test
    public void checksumtest1(){
        int[] arr=new int[1];
        arr[0]=23;
        int result= Sum.sumofarray(arr);
        assertEquals(23,result);
    }
}