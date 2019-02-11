import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean b = true;
        int in = 0;
        System.out.println("--------=Welcom to ADD APP=--------");
        System.out.ptintln("It will add all the numbers up to the entered number");
        while (b == true) {
            System.out.println("Please select one of the folowing option:");
            System.out.println("1. If you what to add all the numbers to that number");
            System.out.println("2. If you whant to QUIT APP");
            System.out.print("\n => ");
            in = sc.nextInt();
            switch (in) {
                case 1: {
                    System.out.print("\nPlease enter an INTEGER NUMBER => ");
                    in = sc.nextInt();
                    int sum=0;
                    for (int i = 0; i <= in; i++) {
                        sum += i;
                    }
                    System.out.println(sum);
                    break;
                }
                case 2: {
                    b = false;
                    break;
                }
                default: {
                    System.out.println("\n--------=ERROR YOU'VE ENTERD SOMETHING WRONG PLEAS TRY ONE MORE TIME=--------");
                }
            }
        }
    }
}