package StringToBeRepeated;

/**
 * @author Denis Cechina
 */
import java.util.Scanner;

public class StringToBeRepeated {

    private static void repeatStr(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    private static void print(String str) {
        System.out.print(str);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        String message = "Please enter the STRING that you would like to repeat -> ";
        print(message);
        String instr = sc.nextLine();
        message = "Please enter how many times would you like to repeat the STRING -> ";
        print(message);

        String nr = null;
        while (nr == null) {
            nr = sc.nextLine();
            try {
                n = Integer.valueOf(nr);
                repeatStr(instr, n);
                break;
            } catch (NumberFormatException e) {
                print("Expected numeric value, not: '" + nr + "', please try again.\n");
                nr = null;
                print(message);
            }
        }
    }

}
