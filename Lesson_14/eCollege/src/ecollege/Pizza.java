package ecollege;

/**
 * @author Denis Cechina
 */
public class Pizza {

    String size, toppings;
    double diameter, price;

    public String eat() {
        return "Eat a pizza slowly, it can choke you if you eat it too fast!";
    }

    public String toString() {
        return "Size: " + size + "\n" + "Toppings: "
                + toppings + "\n" + "Diameter: " + diameter + "\n" + "Price: "
                + price;
    }
}
