package 
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        int countEven = 0;
        int countOdd = 0;

        System.out.println("----------=Welcom to EVEN OR ODD 10 NUMBER APP=----------");
        System.out.print("Please enter 10 integer numbers in one line separeted by BackSpase or by presing enter\n-> ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if(array[i] % 2 == 0) countEven++;
            else countOdd++;
        }//Old Code
//	int num1 = sc.nextInt();
//	int num2 = sc.nextInt();
//	int num3 = sc.nextInt();
//	int num4 = sc.nextInt();
//	int num5 = sc.nextInt();
//	int num6 = sc.nextInt();
//	int num7 = sc.nextInt();
//	int num8 = sc.nextInt();
//	int num9 = sc.nextInt();
//	int num10 = sc.nextInt();
//	int countEven = 0;
//	int countOdd = 0;
//
//	if (num1%2==0)countEven++;
//	else if(num1%2>0)countOdd++;
//	if (num2%2==0)countEven++;
//	else if(num2%2>0)countOdd++;
//	if (num3%2==0)countEven++;
//	else if(num3%2>0)countOdd++;
//	if (num4%2==0)countEven++;
//	else if(num4%2>0)countOdd++;
//	if (num5%2==0)countEven++;
//	else if(num5%2>0)countOdd++;
//	if (num6%2==0)countEven++;
//	else if(num6%2>0)countOdd++;
//	if (num7%2==0)countEven++;
//	else if(num7%2>0)countOdd++;
//	if (num8%2==0)countEven++;
//	else if(num8%2>0)countOdd++;
//	if (num9%2==0)countEven++;
//	else if(num9%2>0)countOdd++;
//	if (num10%2==0)countEven++;
//	else if(num10%2>0)countOdd++;
        System.out.print("Even numbers entered -> " + countEven + " Odd numbers entered -> " + countOdd);

    }
}
