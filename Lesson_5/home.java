import java.util.Scanner;

public class home{

	public static add(int x, y){
		return;
	}

	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);

		String message="ERROR you've entered wrong input please enter an INTEGER NUMBER FROM '1' TO '4'";

		boolean b=false;

		System.out.println("------------Welcome to -=Calculater=- application------------");

		while(b==false){
			try{
				System.out.println("Please enter '1' if you whant to add two numbers (+)");
				System.out.println("Please enter '2' if you whant to substract tow numbers (-)");
				System.out.println("Please enter '3' if you whant to multiply tow numbers (*)");
				System.out.println("Please enter '4' if you whant to split tow numbers (/)");
				System.out.print("Waiting for IMPUT -> ");
				int in=sc.nextInt();

				while(!(in==1||in==2||in==3||in==4)){
					System.out.println(message);
					System.out.println("Please enter '1' if you whant to add two numbers (+)");
					System.out.println("Please enter '2' if you whant to substract tow numbers (-)");
					System.out.println("Please enter '3' if you whant to multiply tow numbers (*)");
					System.out.println("Please enter '4' if you whant to split tow numbers (/)");
					System.out.print("Waiting for IMPUT -> ");
					in=sc.nextInt();
				}
				b=true;
			}catch(Exception e){
				System.out.println(message);
				sc=new Scanner(System.in);
			}
		}
	}
}