import java.util.Scanner;
 public class HomeWork4{

 	public static void main (String [] args){
 		Scanner sc = new Scanner(System.in);

 		System.out.println("Welcome to Exponentiation APP");
 		System.out.print("Please enter the number that will be raise to the same number \n-> ");
 		int num = sc.nextInt();
 		int sum = num;
 		for (int i=1;i<num;i++){
 			sum *=num;
 		}
 		System.out.print("The "+num+" raised by "+num+" will be -> "+sum);
 	}
 }