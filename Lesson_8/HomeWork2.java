import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean b = true;
        int in = 0;
        System.out.println("--------=Welcom to ADD EVEN NUMBERS APP=--------");
        System.out.println("This app will add all even numbers up to the entered number");
        while (b == true) {

            System.out.println("Please select one of the folowing option:");
            System.out.println("1. If you what to calculate all the even numbers up to that number");
            System.out.println("2. If you whant to QUIT APP");
            System.out.print("\n=> ");
            in = sc.nextInt();
            switch (in) {
                case 1: {
                    System.out.print("\nPlease enter an INTEGER NUMBER =>");
                    in = sc.nextInt();
                    int sum=0;
                    for (int i = 0; i <= in; i++) {
                    	if(i%2==0){
                    		sum += i;
                    	}
                    }
                    System.out.println("\nThe total will be => "+sum+"\n");
                    break;
                }
                case 2: {
                    b = false;
                    break;
                }
                default: {
                    System.out.println("\n--------=ERROR YOU'VE ENTERD SOMETHING WRONG PLEAS TRY ONE MORE TIME=--------\n");
                }
            }
        }
    }
}