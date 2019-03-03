package ecollege;

/**
 * @author Denis Cechina
 */
public class Student {

    public String firstName;
    public String lastName;
    public byte age;
    public String className;
    public float gradeAverage;
    public String address;
    public static int count = 0;
    public static float totalGradeAvanger = 0F;

    //Default Constructor
    public Student(float gradeAverage) {
        count++;
        totalGradeAvanger += gradeAverage;
    }

    //Overloaded constructor
    public Student(String firstName, String lastName, byte age, String className,
            float gradeAverage, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.className = className;
        this.gradeAverage = gradeAverage;
        this.address = address;
        count++;
        totalGradeAvanger += gradeAverage;
    }

    @Override
    public String toString() {
        return "First Name: " + this.firstName + "\nLast Name: " + this.lastName
                + "\nAge: " + this.age + "\nClass Name: " + this.className
                + "\nGrade Average: " + this.gradeAverage + "\nAdress: "
                + this.address + "\n";
    }

    public static void studentsAndGrade() {
        System.out.println("There are: " + count + " students.\nThe grade avange is: "
                + totalGradeAvanger / count);
    }

}
