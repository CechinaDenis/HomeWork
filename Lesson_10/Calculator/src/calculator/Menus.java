package calculator;

/**
 * This is a class that contains all Menus.
 *
 * @author Cechina Denis
 */
public class Menus {

    void mainMenu() {
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
    }

    void rhombSurfaceMenu() {
        System.out.println("Select an option to calculate  Rhomb Surface:");
        System.out.println("1.If you know altitude and the side length");
        System.out.println("2.If you know side length and the sine of angle A "
                + "(or angle B)");
        System.out.print("3.If you know lengths of the diagonals\n=>");
    }

    void triangleSurfaceMenu() {
        System.out.println("Select an option to calculate  Triangle Surface:");
        System.out.println("1.If you know all the sides length and the "
                + "semiperimeter");
        System.out.println("2.If you know two sides length and the angle "
                + "between them");
        System.out.println("3.If you know a side and its height");
        System.out.print("4.If you know the radius of the circle inscribed in "
                + "the triangle and the semipermeter\n=>");
    }

    void calculaterMenu() {
        System.out.println("Please enter '1' if you whant to add two numbers (+)");
        System.out.println("Please enter '2' if you whant to substract tow numbers (-)");
        System.out.println("Please enter '3' if you whant to multiply tow numbers (*)");
        System.out.println("Please enter '4' if you whant to split tow numbers (/)");
        System.out.println("Please enter '5' if you whant to % tow numbers (%)");
        System.out.println("Please enter '6' if you whant to Quit Simple Calculater APP");
        System.out.print("Waiting for IMPUT -> ");
    }
}
