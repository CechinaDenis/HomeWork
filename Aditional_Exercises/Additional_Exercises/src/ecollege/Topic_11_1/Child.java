package ecollege.Topic_11_1;

/**
 * @author Denis Cechina
 */
public class Child extends Human {

    private String schoolCardNo;

    public Child() {
        schoolCardNo = "N/A";
    }

    public String getSchoolCardNo() {
        return schoolCardNo;
    }

    public void setSchoolCardNo(String schoolCardNo) {
        this.schoolCardNo = schoolCardNo;
    }

    @Override
    public String swim() {
        if (this.getAge() > 0 && this.getAge() <= 5) {
            return "As the child is 5 years old or younger, armbands must be "
                    + "worn and parental supervision is required. " 
                    + super.swim();
        } else {
            return super.swim();
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nSchool Card No: " + this.schoolCardNo;
    }
}
