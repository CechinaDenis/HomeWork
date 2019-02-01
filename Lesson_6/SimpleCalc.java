import java.util.Scanner;

public class SimpleCalc {
    //Global variables

    public static Scanner sc = new Scanner(System.in);
    public static int in = 0;
    public static String message = "\nERROR you've entered wrong input please enter an INTEGER NUMBER FROM '1' TO '5'\n";
    public static boolean b = false;
    //add function

    public static void add() {
        while (b == false) {
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                int x = sc.nextInt();//initializating an integer variable and assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                int y = sc.nextInt();
                int z = x + y;//initializating and assigning a value fromn adding 2 integers
                System.out.println("\n" + x + "+" + y + "=" + z + "\n");
                b = true;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        b = false;
    }
    //substract function

    public static void substract() {
        while (b == false) {
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                int x = sc.nextInt();//initializating an integer variable and assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                int y = sc.nextInt();
                int z = x - y;//initializating and assigning a value fromn substracting 2 integers
                System.out.println("\n" + x + "-" + y + "=" + z + "\n");
                b = true;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        b = false;
    }
    //multiply function

    public static void multiply() {
        while (b == false) {
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                int x = sc.nextInt();//initializating an integer variable and assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                int y = sc.nextInt();
                int z = x * y;//initializating and assigning a value fromn multiplying 2 integers
                System.out.println("\n" + x + "*" + y + "=" + z + "\n");
                b = true;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        b = false;
    }
    //split function

    public static void split() {
        while (b == false) {
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                double x = sc.nextDouble();//initializating an integer variable and assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                double y = sc.nextDouble();
                double z = x / y;//initializating and assigning a value fromn spliting 2 integers
                System.out.println("\n" + x + "/" + y + "=" + z + "\n");
                b = true;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        b = false;
    }
    public static void rest() {
        while (b == false) {
            try {
                System.out.print("Please enter First INTEGER NUMBER -> ");
                int x = sc.nextInt();//initializating an integer variable and assigning the value from the usser
                System.out.print("Please enter Second INTEGER NUMBER -> ");
                int y = sc.nextInt();
                int z = x % y;//initializating and assigning a value fromn rest 2 integers
                System.out.println("\n" + x + "%" + y + "=" + z + "\n");
                b = true;
            } catch (Exception e) {
                System.out.println("\nERROR you've entered wrong input please enter an INTEGER NUMBER\n");
                sc = new Scanner(System.in);
            }
        }
        b = false;
    }
    //Main class

    public static void main(String[] args) {

        System.out.println("------------Welcome to -=Calculater=- application------------\n");
        //while cycle
        while (b == false) {
            //try & catch blok
            try {
                System.out.println("Please enter '1' if you whant to add two numbers (+)");
                System.out.println("Please enter '2' if you whant to substract tow numbers (-)");
                System.out.println("Please enter '3' if you whant to multiply tow numbers (*)");
                System.out.println("Please enter '4' if you whant to split tow numbers (/)");
                System.out.println("Please enter '5' if you whant to % tow numbers (%)");
                System.out.println("Please enter '6' if you whant to Quit");
                System.out.print("Waiting for IMPUT -> ");
                in = sc.nextInt();
                //while cycle
                while (!(in == 1 || in == 2 || in == 3 || in == 4 || in == 5||in==6)) {
                    System.out.println(message);
                    System.out.println("Please enter '1' if you whant to add two numbers (+)");
                    System.out.println("Please enter '2' if you whant to substract tow numbers (-)");
                    System.out.println("Please enter '3' if you whant to multiply tow numbers (*)");
                    System.out.println("Please enter '4' if you whant to split tow numbers (/)");
                    System.out.println("Please enter '5' if you whant to % tow numbers (%)");
                    System.out.println("Please enter '6' if you whant to Quit");
                    System.out.print("Waiting for IMPUT -> ");
                    in = sc.nextInt();
                }
            } catch (Exception e) {
                System.out.println(message);
                sc = new Scanner(System.in);

            }

            if (in == 1) {
                add();
            } else if (in == 2) {
                substract();
            } else if (in == 3) {
                multiply();
            } else if (in == 4) {
                split();
            } else if (in == 5){
            	rest();
            } else if (in == 6) {
                break;
            }
        }
    }
}
