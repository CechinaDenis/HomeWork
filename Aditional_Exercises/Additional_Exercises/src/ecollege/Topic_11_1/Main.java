package ecollege.Topic_11_1;

/**
 * @author Denis Cechina
 */
public class Main {

    public static void main(String[] args) {
        
        Adult a = new Adult();
        a.setName("Billy White");
        a.setAge(30);
        a.setGender("male");
        a.setHeight(6.5F);
        a.setWeight(11F);
        a.setPpsNo("5645614F");
        a.setOccupation("Software Developer");
        a.setIsMarried(true);
        a.setIsCarOwner(true);
        System.out.println(a);
        System.out.println(a.eat());
        System.out.println(a.drive());
        
        Child c = new Child();
        c.setName("Frank Davis");
        c.setAge(3);
        c.setGender("male");
        c.setHeight(1.5F);
        c.setWeight(3F);
        System.out.println("\n" + c);
        System.out.println(c.eat());
        System.out.println(c.swim());
        
        Baby b = new Baby();
        b.setName("Gillian Taylor");
        b.setAge(1);
        b.setGender("female");
        b.setHeight(06F);
        b.setWeight(1F);
        b.setIsTeething(true);
        System.out.println("\n" + b + b.sleep() + "\n" + b.swim());
        
    }
}
