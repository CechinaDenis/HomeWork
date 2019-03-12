package calculator;

import java.util.*;

/**
 *Main class
 * 
 * @author Denis Cechina
 */
public class Application {

    static boolean appRun = true;
    static boolean calcAppRun = true;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Geometry geometry = new Geometry();
        Algebra algebra = new Algebra();
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        Menus menus = new Menus();
        Switches switches = new Switches();

        String errorMessage = "\n-------------------------=ERROR=--------------"
                + "-----------\n"
                + "You've entered something wrong please try one more time\n"
                + "---------------------------------------------------------\n";

        System.out.println("----------=Welcome to Math APP=----------\n");

        while (appRun == true) {
            menus.mainMenu();
            int in = sc.nextInt();

            switch (in) {

                case 1:
                    System.out.print("Please enter a number that you whant to "
                            + "know if it is Odd or Even\n=>");
                    int oddOrEvenNr = sc.nextInt();
                    algebra.detectOddOrEven(oddOrEvenNr);
                    break;

                case 2:
                    System.out.print("Please enter how meany Fibonacci numbers "
                            + "do you need to see\n=>");
                    int count = sc.nextInt();
                    fibonacciGenerator.generateFibonacciListFor(count);
                    fibonacciGenerator.generateFibonacciListWhile(count);
                    fibonacciGenerator.generateFibonacciListDoWhile(count);
                    break;

                case 3:
                    System.out.print("Please enter Square Side to calculate "
                            + "Square Perimeter\n=>");
                    int squareSide = sc.nextInt();
                    geometry.calculateSquarePerimeter(squareSide);
                    break;

                case 4:
                    System.out.print("Please enter Square Side to calculate "
                            + "Square Surface\n=>");
                    squareSide = sc.nextInt();
                    geometry.calculateSquareSurface(squareSide);
                    break;

                case 5:
                    System.out.print("To calculate Rectangle Perimeter please "
                            + "enter Rectangle Length => ");
                    int rectangleLength = sc.nextInt();
                    System.out.print("Please enter Rectangle Width => ");
                    int rectangleWidth = sc.nextInt();
                    geometry.calculateRectanglePerimeter(rectangleLength,
                            rectangleWidth);
                    break;

                case 6:
                    System.out.print("To calculate Rectangle Surface please "
                            + "enter Rectangle Length\n=> ");
                    rectangleLength = sc.nextInt();
                    System.out.print("Please enter Rectangle Width => ");
                    rectangleWidth = sc.nextInt();
                    geometry.calculateRectangleSurface(rectangleLength,
                            rectangleWidth);
                    break;

                case 7:
                    System.out.print("Please enter Rhomb Side to calculate Rhomb"
                            + " Perimeter\n=>");
                    int rhombSide = sc.nextInt();
                    geometry.calculateSquarePerimeter(rhombSide);
                    break;

                case 8:
                    menus.rhombSurfaceMenu();//Calling rhombSurfaceMenu method
                    in = sc.nextInt();//Initializating in variable
                    switches.rhombSurfaceSwitch(in);//Calling rhombSurfaceSwitch
                    //and passing in variable
                    break;

                case 9:
                    System.out.print("To calculate Triangle Perimeter please "
                            + "enter Triangle Sides\nFirst Triangle Side\n=>");
                    int stTriangleSide = sc.nextInt();
                    System.out.print("Second Triangle Side\n=>");
                    int ndTriangleSide = sc.nextInt();
                    System.out.print("Third Triangle Side\n=>");
                    int rdTriangleSide = sc.nextInt();
                    geometry.calculateTrianglePerimeter(stTriangleSide,
                            ndTriangleSide, rdTriangleSide);
                    break;

                case 10:
                    menus.triangleSurfaceMenu();
                    in = sc.nextInt();
                    switches.triangleSurfaceSwitch(in);
                    break;

                case 11:
                    while (calcAppRun == true) {

                        menus.calculaterMenu();
                        in = sc.nextInt();
                        switches.calculaterSwitch(in);
                    }
                    calcAppRun = true;
                    break;

                case 12:
                    System.out.print("Please enter the number that will be raise to the same number \n=> ");
                    int num = sc.nextInt();
                    Algebra.numberRiseSameNumber(num);
                    break;

                case 13:
                    appRun = false;
                    break;

                default:
                    System.out.println(errorMessage);
            }
        }
    }
}
