package lambdas;
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
public class MathOp{
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        int result = addition.operate(5, 3);

        System.out.println("Result of addition: " + result);
    }
}