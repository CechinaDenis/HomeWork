package ClassWork15;

/**
 * @author Denis Cechina
 */
public class Array {

    public static void main(String[] args) {

        newArray();

    }

    public static void newArray() {
        int[] intArr = new int[10];
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 21;
        intArr[3] = 32;
        
        //for loop FOR ARRAY 
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Array index: " + i + " Array element: " + intArr[i]);
        }
        
        //while loop FOR ARRAY 
        int i = 0;
        while (i < intArr.length) {
            System.out.println("Array index: " + i + " Array element: " + intArr[i]);
            i++;
        }
        
        //do while loop FOR ARRAY 
        i = 0;
        do {
            System.out.println("Array index: " + i + " Array element: " + intArr[i]);
            i++;
        } while (i < intArr.length);

    }

}
