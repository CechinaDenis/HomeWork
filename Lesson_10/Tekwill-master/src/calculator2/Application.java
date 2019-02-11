package calculator2;

import java.util.*;

/**
 *
 * @author sscerbatiuc&Denis Cechina
 */
public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Geometry geometry = new Geometry();
        Algebra algebra = new Algebra();
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

        boolean appRun = true;
        
        System.out.println("----------=Welcome to Math APP=----------\n");

        while (appRun == true) {
            System.out.println("Please choose one of the following options:");
            System.out.println("1.If the number is Odd or Even");
            System.out.println("2.If you need to see Fibonacci list");
            System.out.println("3.If you need to Calculate Square Perimeter");
            System.out.println("4.If you need to Calculate Square Surface");
            System.out.println("5.If you need to Calculate Rectangle Perimeter");
            System.out.println("6.If you need to Calculate Rectangle Surface");
            System.out.println("7.If you need to Calculate Rhomb Perimeter");
            System.out.println("8.If you need to Calculate Rhomb Surface");
            System.out.println("9.If you need to Calculate Triangle Perimeter");
            System.out.println("10.If you need to Calculate Triangle Surface");
            System.out.println("11.If you need to open Simple Calculater APP");
            System.out.print("12.If you whant to -= QUIT =-\n=>");

            int in = sc.nextInt();

            switch (in) {

                case 1:
                    System.out.print("Please enter a number that you whant to know if it is Odd or Even\n=>");
                    int oddOrEvenNr = sc.nextInt();
                    algebra.detectOddOrEven(oddOrEvenNr);
                    break;

                case 2:
                    System.out.print("Please enter how meany Fibonacci numbers do you need to see\n=>");
                    int count = sc.nextInt();
                    fibonacciGenerator.generateFibonacciList(count);
                    break;

                case 3:
                    System.out.println("Please enter Square Side to calculate Square Perimeter\n=>");
                    int squareSide = sc.nextInt();
                    geometry.calculateSquarePerimeter(squareSide);
                    break;

                case 4:
                    System.out.println("Please enter Square Side to calculate Square Surface\n=>");
                    squareSide = sc.nextInt();
                    geometry.calculateSquareSurface(squareSide);
                    break;
                    
                case 5:
                    System.out.print("To calculate Rectangle Perimeter please enter Rectangle Length => ");
                    int rectangleLength=sc.nextInt();
                    System.out.print("Please enter Rectangle Width => ");
                    int rectangleWidth=sc.nextInt();
                    geometry.calculateRectanglePerimeter(rectangleLength, rectangleWidth);
                    break;
                    
                case 6:
                    System.out.print("To calculate Rectangle Surface please enter Rectangle Length => ");
                    rectangleLength=sc.nextInt();
                    System.out.print("Please enter Rectangle Width => ");
                    rectangleWidth=sc.nextInt();
                    geometry.calculateRectangleSurface(rectangleLength, rectangleWidth);
                    break;
                    
                case 7:
                    System.out.println("Please enter Rhomb Side to calculate Rhomb Perimeter\n=>");
                    int rhombSide = sc.nextInt();
                    geometry.calculateSquarePerimeter(rhombSide);
                    break;
                    
                case 8:
                    System.out.println("Select an option to calculate  Rhomb Surface:");
                    System.out.println("1.If you know altitude and the side length");
                    System.out.println("2.If you know side length and the sine of angle A (or angle B)");
                    System.out.print("3.If you know lengths of the diagonals\n=>");
                    in=sc.nextInt();
                    
                    switch (in){
                        case 1:
                            System.out.print("Please enter Rhomb Altitude =>");
                            int rhombAltitude=sc.nextInt();
                            System.out.print("Please enter Rhomb Side Length =>");
                            int rhombLength=sc.nextInt();
                            geometry.calulateRhombSurface1(rhombAltitude, rhombLength);
                            break;
                    }
                    
                case 9:
                    System.out.println("");
                    
                    break;
                case 10:
                    System.out.println("");
                    
                    break;
                    
                case 11:
                    System.out.println("");
                    
                    break;
                    
                    
                case 12:
                    appRun=false;
                    break;
                
                default :
                    System.out.println("\n-------------------------=ERROR=-------------------------\n"
                            + "You've entered something wrong please try one more time\n"
                            + "---------------------------------------------------------\n");
                    

//            System.out.println("Perimeter " + perimeter);
//            System.out.println("How many Fibonacci numbers to print");
//            int number = sc.nextInt();
            }
        }
    }
}
