import java.util.Scanner;

public class WhatsUp{
	public static void main(String[]args){
		
		System.out.print("Please enter your Surename and Name -> ");
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		System.out.print("Please enter your Activity Domain -> ");
		String domain=sc.next();
		System.out.print("\nSow your Surename and Name is : "+name+" end your Activity Domain is : "+domain);
	}
}