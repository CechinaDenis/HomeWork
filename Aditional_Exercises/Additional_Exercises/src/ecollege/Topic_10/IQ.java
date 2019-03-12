package ecollege.Topic_10;

/**
 * @author Denis Cechina
 */
public class IQ {

    private String name;
    private int age;
    private float iQScore;

    public IQ(String name, int age, float iQScore) {
        this.name = name;
        if (age > 0 && age <= 115) {
            this.age = age;
        } else {
            System.out.println(age + " is not a valid age! The default value '0' "
                    + "will be put until it will be changed!\n");
            this.age = 0;
        }
        if (iQScore > 0 && iQScore <= 200) {
            this.iQScore = iQScore;
        } else {
            System.out.println(iQScore + " is not a valid IQ Score! The default "
                    + "value '0' will be put until it will be changed!\n");
            this.iQScore = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 115) {
            this.age = age;
        } else {
            System.out.println(age + " is not a valid age! The default value '0' "
                    + "will be put until it will be changed!\n");
            this.age = 0;
        }
    }

    public float getiQScore() {
        return this.iQScore;
    }

    public void setIQScore(float iQScore) {
        if (iQScore > 0 && iQScore <= 200) {
            this.iQScore = iQScore;
        } else {
            System.out.println(iQScore + " is not a valid IQ Score! The default "
                    + "value '0' will be put until it will be changed!\n");
            this.iQScore = 0;
        }
    }

    public String IQReport() {
        if (this.iQScore >= 0 && this.iQScore < 100) {
            return "Your score of " + this.iQScore + " is below average.\n";
        } else if (this.iQScore >= 100 && this.iQScore < 150) {
            return "Your score of " + this.iQScore + " is above average.\n";
        } else if (this.iQScore >= 150 && this.iQScore <= 200) {
            return "Your score of " + this.iQScore + " is exceptional.\n";
        } else {
            return "You've entered somethig wrong try one more time!!!\n";
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " | Age: " + this.age + " | IQ Score: "
                + this.iQScore + "\n";
    }
}
