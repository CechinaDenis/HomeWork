package calculator;

/**
 *This is a class that contains Fibonacci Generators
 * 
 * @author Cechina Denis
 */
public class FibonacciGenerator {

    public void generateFibonacciListFor(int count) {
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

    public void generateFibonacciListWhile(int count) {
        int num1 = 0;
        int num2 = 1;
        int i = 1;
        while (i <= count) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
        System.out.println("\n");
    }

    public void generateFibonacciListDoWhile(int count) {
        int num1 = 0;
        int num2 = 1;
        int i = 1;
        do {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        } while (i <= count);
        System.out.println("\n");
    }
}
