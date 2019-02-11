package calculator2;

/**
 * This is a class that contains geometry operations.
 *
 * @author sscerbatiuc&Denis Cechina
 */
public class Geometry {

    public void  calculateSquarePerimeter(int sideLength) {
        int perimeter = sideLength * 4;
        System.out.println("Square Perimeter: " + perimeter);
    }

    public void calculateSquareSurface(int sideLength) {
        int surface = sideLength * sideLength;
        System.out.println("Square Surface: " + surface);
    }

    public void calculateRectanglePerimeter(int length, int width) {
        int perimeter=2*(length+width);
        System.out.println("Rectangle Perimeter: "+perimeter);
    }

    public void calculateRectangleSurface(int length, int width) {
        int surface=length*width;
        System.out.println("Rectangle Surface: "+surface);
    }

    public void calculateRhombPerimeter(int rhombSide) {
        int perimeter=4*rhombSide;
        System.out.println("Rhomb Perimeter: "+rhombSide);
    }

    public void calulateRhombSurface1(int rhombAltitude, int rhombLength) {
        int surface=rhombAltitude*rhombLength;
        System.out.println("Rhomb Surface: "+surface);
    }
    
    public void calulateRhombSurface2() {
        
    }
    
    public void calulateRhombSurface3() {
        
    }

    public void calculateTrianglePerimeter() {
//        Se aduna toate laturile
//        Exemplu: L+L+L=P
    }

    public void calculateTriangleSurface() {
        //http://matematicaesimpla.com/formule-aria-unui-triunghi-oarecare/
    }

    // rectangle surface
    // rectangle perimeter
//    System.out.println("Please enter square side length:");
//            int squareSide = keyboardScanner.nextInt();
//            // 2. Calculate perimeter
//            int perimeter = 4 * squareSide;
//            // 3. Calculate surface
//            int surface = squareSide * squareSide;
//            // 4. Display the result
//            System.out.println("Surface "+surface+ "; Perimeter:" + perimeter);
//
//            System.out.println("Please enter rectangle size:");
//            System.out.println("Length:");
//            int length = keyboardScanner.nextInt();
//            System.out.println("Width:");
//            int width = keyboardScanner.nextInt();
//            int rectPerimeter = (width + length)*2; 
//            int rectSurface = length * width;
//            System.out.println("Rectangle: Surface " + rectSurface + "; Perimeter:" + rectPerimeter);
}
