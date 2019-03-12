package H_W_L_8;

import java.util.Scanner;

/**
 *
 * @author Cechina Denis
 */
public class H_W_L_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int countEven = 0;
        int countOdd = 0;
        System.out.println("----------=Welcom to EVEN OR ODD 10 NUMBER APP=----------");
        System.out.print("Please enter 10 integer numbers in one line separeted by BackSpase or by presing enter\n-> ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.print("Even numbers entered -> " + countEven + " Odd numbers entered -> " + countOdd);
    }
}
