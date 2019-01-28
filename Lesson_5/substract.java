import java.util.Scanner;//Importing Scanner class

public class substract{

	public static void main(String[]args){//main class
	
	Scanner sc=new Scanner(System.in);//initializating Scanner class
	
	System.out.println("------------Welcome to 'Substract tow numbers' application------------\nAuthor: Denis Cechina\nDescription: This Application Substract tow integer numbers\n");//printing message to the screan 
	System.out.println();
	System.out.print("Please enter First INTEGER NUMBER -> ");
	int x=sc.nextInt();//initializating an integer variable and assigning the value from the usser
	System.out.print("Please enter Second INTEGER NUMBER -> ");
	int y=sc.nextInt();
	int z=x-y;//initializating and assigning a value fromn Substracting 2 integers
	System.out.println(x+"-"+y+"="+z);
	}
}