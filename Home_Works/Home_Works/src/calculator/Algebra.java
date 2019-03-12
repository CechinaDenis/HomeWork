package calculator;

import java.util.Scanner;

/**
 * This is a class that contains algebra operations.
 *
 * @author Denis Cechina
 */
public class Algebra {

    public void detectOddOrEven(int number) {
        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println("\nResult: " + number + " is " + result + "\n");
    }

//add function
    public static boolean addTowNumbers(boolean calcAppRun) {
        while (calcAppRun == true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                int x = sc.nextInt();//initializating an integer variable and 
                //assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                int y = sc.nextInt();
                int z = x + y;//initializating and assigning a value fromn 
                //adding 2 integers
                System.out.println("\n" + x + "+" + y + "=" + z + "\n");
                calcAppRun = true;
                return calcAppRun;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please "
                        + "enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        
        return calcAppRun = true;
    }

//substract function
    public static boolean substractTowNumbers(boolean calcAppRun) {
        while (calcAppRun == true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                int x = sc.nextInt();//initializating an integer variable and 
                //assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                int y = sc.nextInt();
                int z = x - y;//initializating and assigning a value fromn 
                //substracting 2 integers
                System.out.println("\n" + x + "-" + y + "=" + z + "\n");
                calcAppRun = true;
                return calcAppRun;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please "
                        + "enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        return calcAppRun = true;
    }

//multiply function
    public static boolean multiplyTowNumbers(boolean calcAppRun) {
        while (calcAppRun == true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                int x = sc.nextInt();//initializating an integer variable and 
                //assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                int y = sc.nextInt();
                int z = x * y;//initializating and assigning a value fromn 
                //multiplying 2 integers
                System.out.println("\n" + x + "*" + y + "=" + z + "\n");
                calcAppRun = true;
                return calcAppRun;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please "
                        + "enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        return calcAppRun = true;
    }

//split function
    public static boolean splitTowNumbers(boolean calcAppRun) {
        while (calcAppRun == true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                double x = sc.nextDouble();//initializating an integer variable 
                //and assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                double y = sc.nextDouble();
                double z = x / y;//initializating and assigning a value fromn 
                //spliting 2 integers
                System.out.println("\n" + x + "/" + y + "=" + z + "\n");
                calcAppRun = true;
                return calcAppRun;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please "
                        + "enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        return calcAppRun = true;
    }
//rest function

    public static boolean numberRest(boolean calcAppRun) {
        while (calcAppRun == true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                int x = sc.nextInt();//initializating an integer variable and 
                //assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                int y = sc.nextInt();
                int z = x % y;//initializating and assigning a value fromn rest 
                //2 integers
                System.out.println("\n" + x + "%" + y + "=" + z + "\n");
                calcAppRun = true;
                return calcAppRun;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please "
                        + "enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        return calcAppRun = true;
    }

    public static void numberRiseSameNumber(int num) {
        int sum = num;
        for (int i = 0; i < num; i++) {
            sum *= sum;
        }
        System.out.print("The " + num + " raised by " + num + " will be -> " 
                + sum);
    }
}
