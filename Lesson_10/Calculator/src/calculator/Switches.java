package calculator;

import java.util.Scanner;

/**
 * This is a class that contains Switches
 * 
 * @author Denis Cechina
 */
public class Switches {

    Scanner sc = new Scanner(System.in);
    Geometry geometry = new Geometry();
    String errorMessage = "\n-------------------------=ERROR=------------------"
            + "-------\n"
            + "You've entered something wrong please try one more time\n"
            + "---------------------------------------------------------\n";

    public void rhombSurfaceSwitch(int in) {
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
                System.out.print("Please enter Rhomb sine of angle A (or angle "
                        + "B)\n=>");
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
    }

    public void triangleSurfaceSwitch(int in) {

        switch (in) {
            case 1:
                System.out.print("To calculate Triangle Surface please enter:\n"
                        + "First Triangle Side\n=>");
                int stTriangleSide = sc.nextInt();
                System.out.print("Second Triangle Side\n=>");
                int ndTriangleSide = sc.nextInt();
                System.out.print("Third Triangle Side\n=>");
                int rdTriangleSide = sc.nextInt();
                System.out.print("Triangle Semiperimeter\n=>");
                int triangleSemiPerimeter = sc.nextInt();
                geometry.calculateTriangleSurface1(stTriangleSide,
                        ndTriangleSide, rdTriangleSide, triangleSemiPerimeter);
                break;

            case 2:
                System.out.print("To calculate Triangle Surface please enter:\n"
                        + "First Triangle Side\n=>");
                stTriangleSide = sc.nextInt();
                System.out.print("Second Triangle Side\n=>");
                ndTriangleSide = sc.nextInt();
                System.out.print("Angle between them\n=>");
                int triangleAngle = sc.nextInt();
                geometry.calculateTriangleSurface2(stTriangleSide,
                        ndTriangleSide, triangleAngle);
                break;

            case 3:
                System.out.print("To calculate Triangle Surface please enter:\n"
                        + "Triangle Side\n=>");
                int triangleSide = sc.nextInt();
                System.out.print("Triangle Height of the Side that you've "
                        + "entered\n=>");
                int triangleHeightOfSide = sc.nextInt();
                geometry.calculateTriangleSurface3(triangleSide,
                        triangleHeightOfSide);
                break;

            case 4:
                System.out.print("To calculate Triangle Surface please enter:\n"
                        + "Radius of the Circle Inscribed in the Triangle\n=>");
                int circleInscribedTriangle = sc.nextInt();
                System.out.print("Triangle Semiperimeter\n=>");
                triangleSemiPerimeter = sc.nextInt();
                geometry.calculateTriangleSurface4(circleInscribedTriangle,
                        triangleSemiPerimeter);
                break;

            default:
                System.out.println(errorMessage);
        }
    }

    public void calculaterSwitch(int in) {
        switch (in) {
            case 1:
                Application.calcAppRun = Algebra.addTowNumbers(Application.calcAppRun);
                break;
            case 2:
                Application.calcAppRun = Algebra.substractTowNumbers(Application.calcAppRun);
                break;
            case 3:
                Application.calcAppRun = Algebra.multiplyTowNumbers(Application.calcAppRun);
                break;
            case 4:
                Application.calcAppRun = Algebra.splitTowNumbers(Application.calcAppRun);
                break;
            case 5:
                Application.calcAppRun = Algebra.numberRest(Application.calcAppRun);
                break;
            case 6:
                Application.calcAppRun = false;
                System.out.println("");
                break;
        }
    }
}
