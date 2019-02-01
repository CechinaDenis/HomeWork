import java.util.Scanner;//Import Scanner Class

public class OddOrEven{

	public static void main(String [] args){//Main Class
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n------= Welcom to 'ODD OR EVEN NUMBER' Application =------\n");
		System.out.print("Pleas enter the INTEGER NUMBER -> ");
		int in=sc.nextInt();
		in %= 2;
		System.out.println(in==0?"\nYou've entered an ODD Number":"\nYou've entered an EVEN Number");
	}
}