package ecollege;

/**
 * @author Denis Cechina
 */
public class Numbers {
    public int sum(int num1, int num2){
        return num1+num2;
    }
    public float divide(float num1, float num2){
        return num1/num2;
    }
    public float multiply(int num1, int num2){
        return num1*num2;
    }
    public float remainder(float num1, float num2){
        return num1%num2;
    }
    public void message(){
        System.out.println("This is a class that performs simple, mathematical "
                + "operations");
    }
}
