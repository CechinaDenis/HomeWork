package aditional_exercise_1;

import java.util.Scanner;
import java.util.Random;

public class Aditional_Exercise_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to Application that will generate random numbers");
        System.out.print("Please enter how meany random number do you need ->");
        boolean b = false;

        while (b == false) {
            try {
                int counter = 0;
                int in=0;
                in = sc.nextInt();
                while (counter < in) {
                    int n = rand.nextInt(10000) + 1;
                    System.out.print(n + " \\ ");
                    counter++;
                }
                b=true;

            } catch (Exception e) {
                System.out.println("You did't enter an INTEGER number please try again");
                System.out.print("Please enter how meany random number do you need ->");
                sc = new Scanner(System.in);
            }
        }
    }
}