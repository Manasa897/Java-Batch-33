package sets;
import org.junit.Test;
import sets.RemoveDuplicate;
public class RemoveDuplicatesTest {
    @Test
    public void runTestCases() {
        String input1 = "abcdef";
        System.out.println("Input: " + input1);
        System.out.println("Result: " + RemoveDuplicate.removeDuplicates(input1));
        System.out.println();
    }
    @Test
    public void runTestCasesDuplicate() {
        String input2 = "programmingg";
        System.out.println("Input: " + input2);
        System.out.println("Result: " + RemoveDuplicate.removeDuplicates(input2));
        System.out.println();
    }
    @Test
    public void runTestCasesEmpty() {
        String input3 = "";
        System.out.println("Input: " + input3);
        System.out.println("Result: " + RemoveDuplicate.removeDuplicates(input3));
        System.out.println();
    }
    @Test
    public void runTestCasesUpperandLower(){
        String input4 = "AbCdEeFf";
        System.out.println("Input: " + input4);
        System.out.println("Result: " + RemoveDuplicate.removeDuplicates(input4));
    }
}