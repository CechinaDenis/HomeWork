package ecollege.Topic_11_1;

/**
 * @author Denis Cechina
 */
public class Human {

    private String name;
    private int age;
    private String gender;
    private float height;
    private float weight;

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
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public String sleep(){
        return "Sleeping soundly...";
    }
    
    public String eat(){
        return "Eating slowly and chewing carefully...";
    }
    
    public String swim(){
        return "Arms rotating and pushing the body forward...";
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nGender: " 
                + this.gender + "\nHeight: " + this.height + "\nWeight: "
                + this.weight;
    }
}
