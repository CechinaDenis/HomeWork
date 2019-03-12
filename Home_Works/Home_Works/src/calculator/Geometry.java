package calculator;

/**
 * This is a class that contains geometry operations.
 *
 * @author Denis Cechina
 */
public class Geometry {

    public void calculateSquarePerimeter(int sideLength) {
        int perimeter = sideLength * 4;
        System.out.println("Square Perimeter: " + perimeter+"\n");
    }

    public void calculateSquareSurface(int sideLength) {
        int surface = sideLength * sideLength;
        System.out.println("Square Surface: " + surface+"\n");
    }

    public void calculateRectanglePerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
        System.out.println("Rectangle Perimeter: " + perimeter+"\n");
    }

    public void calculateRectangleSurface(int length, int width) {
        int surface = length * width;
        System.out.println("Rectangle Surface: " + surface+"\n");
    }

    public void calculateRhombPerimeter(int rhombSide) {
        int perimeter = 4 * rhombSide;
        System.out.println("Rhomb Perimeter: " + perimeter+"\n");
    }

    public void calulateRhombSurface1(int rhombAltitude, int rhombLength) {
        int surface = rhombAltitude * rhombLength;
        System.out.println("Rhomb Surface: " + surface+"\n");
    }

    public void calulateRhombSurface2(int rhombSideLength, int rhombSine) {
        double surface = (rhombSideLength ^ 2) * (Math.sin(rhombSine));
        System.out.println("Rhomb Surface: " + surface+"\n");
    }

    public void calulateRhombSurface3(int rhombStDiagonal, int rhombNdDiagonal) {
        double surface = (rhombStDiagonal * rhombNdDiagonal) / 2;
        System.out.println("Rhomb Surface: " + surface+"\n");
    }

    public void calculateTrianglePerimeter(int stTriangleSide, int 
            ndTriangleSide, int rdTriangleSide) {
        int perimeter = stTriangleSide + ndTriangleSide + rdTriangleSide;
        System.out.println("Triangle Perimeter: " + perimeter+"\n");
    }

    public void calculateTriangleSurface1(int stTriangleSide, int ndTriangleSide,
            int rdTriangleSide, int triangleSemiPerimeter) {
        double surface = Math.sqrt(triangleSemiPerimeter * (triangleSemiPerimeter 
                - stTriangleSide) * (triangleSemiPerimeter - ndTriangleSide) * 
                (triangleSemiPerimeter - rdTriangleSide));
        System.out.println("Triangle Surface: " + surface+"\n");
    }

    public void calculateTriangleSurface2(int stTriangleSide, int ndTriangleSide, 
            int triangleAngle) {
        double surface = (stTriangleSide * ndTriangleSide * Math.sin(triangleAngle)) 
                / 2;
        System.out.println("Triangle Surface: " + surface+"\n");
    }

    public void calculateTriangleSurface3(int triangleSide, int triangleHeightOfSide) {
        double surface = (triangleSide * triangleHeightOfSide) / 2;
        System.out.println("Triangle Surface: " + surface+"\n");
    }

    public void calculateTriangleSurface4(int circleInscribedTriangle, int 
            triangleSemiPerimeter) {
        int surface = triangleSemiPerimeter * circleInscribedTriangle;
        System.out.println("Triangle Surface: " + surface+"\n");
    }
}