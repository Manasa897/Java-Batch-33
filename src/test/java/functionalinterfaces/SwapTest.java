package functionalinterfaces;

import functionalinterfaces.Swap;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapTest {
    @Test
    public void checkswaptest(){

        int temp1=2;
        int temp2=4;
        int[] result= Swap.swapnumbers(temp1,temp2);
        int[] expected=new int[2];
        expected[0]=temp2;
        expected[1]=temp1;
        assertArrayEquals(expected,result);
    }
}