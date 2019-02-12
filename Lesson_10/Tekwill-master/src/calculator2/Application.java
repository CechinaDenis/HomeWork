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
        boolean calcAppRun = true;

        String errorMessage = "\n-------------------------=ERROR=-------------------------\n"
                + "You've entered something wrong please try one more time\n"
                + "---------------------------------------------------------\n";

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
            System.out.println("12.If you need to raise a number to the same number");
            System.out.print("13.If you whant to -= QUIT =-\n=>");

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
                    int rectangleLength = sc.nextInt();
                    System.out.print("Please enter Rectangle Width => ");
                    int rectangleWidth = sc.nextInt();
                    geometry.calculateRectanglePerimeter(rectangleLength, rectangleWidth);
                    break;

                case 6:
                    System.out.print("To calculate Rectangle Surface please enter Rectangle Length\n=> ");
                    rectangleLength = sc.nextInt();
                    System.out.print("Please enter Rectangle Width => ");
                    rectangleWidth = sc.nextInt();
                    geometry.calculateRectangleSurface(rectangleLength, rectangleWidth);
                    break;

                case 7:
                    System.out.print("Please enter Rhomb Side to calculate Rhomb Perimeter\n=>");
                    int rhombSide = sc.nextInt();
                    geometry.calculateSquarePerimeter(rhombSide);
                    break;

                case 8:
                    System.out.println("Select an option to calculate  Rhomb Surface:");
                    System.out.println("1.If you know altitude and the side length");
                    System.out.println("2.If you know side length and the sine of angle A (or angle B)");
                    System.out.print("3.If you know lengths of the diagonals\n=>");
                    in = sc.nextInt();

                    switch (in) {
                        case 1:
                            System.out.print("Please enter Rhomb Altitude\n=>");
                            int rhombAltitude = sc.nextInt();
                            System.out.print("Please enter Rhomb Side Length\n=>");
                            int rhombLength = sc.nextInt();
                            geometry.calulateRhombSurface1(rhombAltitude, rhombLength);
                            break;

                        case 2:
                            System.out.print("Please enter Rhomb Side Length\n=>");
                            int rhombSideLength = sc.nextInt();
                            System.out.print("Please enter Rhomb sine of angle A (or angle B)\n=>");
                            int rhombSine = sc.nextInt();
                            geometry.calulateRhombSurface2(rhombSideLength, rhombSine);
                            break;

                        case 3:
                            System.out.print("Please enter Rhomb's First Diagonal\n=>");
                            int rhombStDiagonal = sc.nextInt();
                            System.out.print("Please enter Rhomb's Second Diagonal\n=>");
                            int rhombNdDiagonal = sc.nextInt();
                            geometry.calulateRhombSurface3(rhombStDiagonal, rhombNdDiagonal);
                            break;

                        default:
                            System.out.println(errorMessage);
                    }
                    break;

                case 9:
                    System.out.print("To calculate Triangle Perimeter please enter Triangle Sides\nFirst Triangle Side\n=>");
                    int stTriangleSide = sc.nextInt();
                    System.out.println("Second Triangle Side\n=>");
                    int ndTriangleSide = sc.nextInt();
                    System.out.println("Third Triangle Side\n=>");
                    int rdTriangleSide = sc.nextInt();
                    geometry.calculateTrianglePerimeter(stTriangleSide, ndTriangleSide, rdTriangleSide);
                    break;

                case 10:
                    System.out.println("Select an option to calculate  Triangle Surface:");
                    System.out.println("1.If you know all the sides length and the semiperimeter");
                    System.out.println("2.If you know two sides length and the angle between them");
                    System.out.println("3.If you know a side and its height");
                    System.out.print("4.If you know the radius of the circle inscribed in the triangle and the semipermeter\n=>");
                    in = sc.nextInt();

                    switch (in) {
                        case 1:
                            System.out.print("To calculate Triangle Surface please enter:\nFirst Triangle Side\n=>");
                            stTriangleSide = sc.nextInt();
                            System.out.print("Second Triangle Side\n=>");
                            ndTriangleSide = sc.nextInt();
                            System.out.print("Third Triangle Side\n=>");
                            rdTriangleSide = sc.nextInt();
                            System.out.print("Triangle Semiperimeter\n=>");
                            int triangleSemiPerimeter = sc.nextInt();
                            geometry.calculateTriangleSurface1(stTriangleSide, ndTriangleSide, rdTriangleSide, triangleSemiPerimeter);
                            break;

                        case 2:
                            System.out.print("To calculate Triangle Surface please enter:\nFirst Triangle Side\n=>");
                            stTriangleSide = sc.nextInt();
                            System.out.print("Second Triangle Side\n=>");
                            ndTriangleSide = sc.nextInt();
                            System.out.print("Angle between them\n=>");
                            int triangleAngle = sc.nextInt();
                            geometry.calculateTriangleSurface2(stTriangleSide, ndTriangleSide, triangleAngle);
                            break;

                        case 3:
                            System.out.print("To calculate Triangle Surface please enter:\nTriangle Side\n=>");
                            int triangleSide = sc.nextInt();
                            System.out.print("Triangle Height of the Side that you've entered\n=>");
                            int triangleHeightOfSide = sc.nextInt();
                            geometry.calculateTriangleSurface3(triangleSide, triangleHeightOfSide);
                            break;

                        case 4:
                            System.out.print("To calculate Triangle Surface please enter:\nRadius of the Circle Inscribed in the Triangle\n=>");
                            int circleInscribedTriangle = sc.nextInt();
                            System.out.print("Triangle Semiperimeter\n=>");
                            triangleSemiPerimeter = sc.nextInt();
                            geometry.calculateTriangleSurface4(circleInscribedTriangle, triangleSemiPerimeter);
                            break;

                        default:
                            System.out.println(errorMessage);
                    }
                    break;

                case 11:
                    while (calcAppRun == true) {
                        //try & catch blok
                        try {
                            System.out.println("Please enter '1' if you whant to add two numbers (+)");
                            System.out.println("Please enter '2' if you whant to substract tow numbers (-)");
                            System.out.println("Please enter '3' if you whant to multiply tow numbers (*)");
                            System.out.println("Please enter '4' if you whant to split tow numbers (/)");
                            System.out.println("Please enter '5' if you whant to % tow numbers (%)");
                            System.out.println("Please enter '6' if you whant to Quit");
                            System.out.print("Waiting for IMPUT -> ");
                            in = sc.nextInt();
                            //while cycle
                            while (!(in == 1 || in == 2 || in == 3 || in == 4 || in == 5 || in == 6)) {
                                System.out.println(errorMessage);
                                System.out.println("Please enter '1' if you whant to add two numbers (+)");
                                System.out.println("Please enter '2' if you whant to substract tow numbers (-)");
                                System.out.println("Please enter '3' if you whant to multiply tow numbers (*)");
                                System.out.println("Please enter '4' if you whant to split tow numbers (/)");
                                System.out.println("Please enter '5' if you whant to % tow numbers (%)");
                                System.out.println("Please enter '6' if you whant to Quit");
                                System.out.print("Waiting for IMPUT -> ");
                                in = sc.nextInt();
                            }
                        } catch (Exception e) {
                            System.out.println(errorMessage);
                            sc = new Scanner(System.in);
                        } 
                        
                        switch (in) {
                            case 1:
                                calcAppRun=Algebra.addTowNumbers(calcAppRun);
                                /*
                                MAM OPRIT AICI^
                                */
                                break;
                            case 2:
                                Algebra.substractTowNumbers(calcAppRun);
                                break;
                            case 3:
                                Algebra.multiplyTowNumbers(calcAppRun);
                                break;
                            case 4:
                                Algebra.splitTowNumbers(calcAppRun);
                                break;
                            case 5:
                                Algebra.numberRest(calcAppRun);
                                break;
                            case 6:
                                
                                break;
                        }
                    }
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
