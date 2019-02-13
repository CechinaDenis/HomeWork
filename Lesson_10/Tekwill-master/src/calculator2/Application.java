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
        Menus menus = new Menus();

        boolean appRun = true;
        boolean calcAppRun = true;

        String errorMessage = "\n-------------------------=ERROR=-------------------------\n"
                + "You've entered something wrong please try one more time\n"
                + "---------------------------------------------------------\n";

        System.out.println("----------=Welcome to Math APP=----------\n");

        while (appRun == true) {
            menus.mainMenu();
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
                    System.out.print("Please enter Square Side to calculate Square Perimeter\n=>");
                    int squareSide = sc.nextInt();
                    geometry.calculateSquarePerimeter(squareSide);
                    break;

                case 4:
                    System.out.print("Please enter Square Side to calculate Square Surface\n=>");
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
                    menus.rhombSurfaceMenu();
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
                    System.out.print("Second Triangle Side\n=>");
                    int ndTriangleSide = sc.nextInt();
                    System.out.print("Third Triangle Side\n=>");
                    int rdTriangleSide = sc.nextInt();
                    geometry.calculateTrianglePerimeter(stTriangleSide, ndTriangleSide, rdTriangleSide);
                    break;

                case 10:
                    menus.triangleSurfaceMenu();
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

                        menus.calculaterMenu();
                        in = sc.nextInt();

                        switch (in) {
                            case 1:
                                calcAppRun = Algebra.addTowNumbers(calcAppRun);
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
                                calcAppRun = false;
                                System.out.println("");
                                break;
                        }
                    }
                    calcAppRun=true;
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
