package ecollege.Topic_11_1;

/**
 * @author Denis Cechina
 */
public class Baby extends Human{
    
    private boolean isTeething;

    public boolean isIsTeething() {
        return isTeething;
    }

    public void setIsTeething(boolean isTeething) {
        this.isTeething = isTeething;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTeething: " + this.isTeething;
    }
    
    @Override
    public String sleep(){
        if (this.isTeething == true){
            return "Baby having difficulty sleeping due to teething pain.";
        }else{
            return super.sleep();
        }
    }
    
    @Override
    public String swim(){
        return "A baby can not swim safely...";
    }
}
