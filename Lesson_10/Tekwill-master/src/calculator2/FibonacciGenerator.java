package calculator2;

/**
 *
 * @author sscerbatiuc
 */
public class FibonacciGenerator {

    public void generateFibonacciList(int count) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println("\n");
    }
}