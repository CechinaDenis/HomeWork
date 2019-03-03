package ecollege;

/**
 * @author Admin
 */
public class Main {//Main class

    public static void main(String[] args) {//Main method
        
        Pizza pizzaSmall = new Pizza();//Creatinng an object 
        //Initializating OBJ variables
        pizzaSmall.size = "Small";
        pizzaSmall.toppings = "Ham and Pineapple";
        pizzaSmall.diameter = 12.00;
        pizzaSmall.price = 10;
        //Printing to screen the messages
        System.out.println(pizzaSmall.toString()+"\n"+pizzaSmall.eat()+"\n");
        
        Pizza pizzaMedium = new Pizza();//Creatinng an object 
        //Initializating OBJ variables
        pizzaMedium.size = "Medium";
        pizzaMedium.toppings = "chicken and Mushroom";
        pizzaMedium.diameter = 14.00;
        pizzaMedium.price = 12;
        //Printing to the screen the message
        System.out.println(pizzaMedium.toString()+"\n"+pizzaMedium.eat()+"\n");
        
        Pizza pizzaLarge = new Pizza();//Creating an OBJ
        //Initializating OBJ variable
        pizzaLarge.size = "Large";
        pizzaLarge.toppings = "Tuna and Sweetcorn";
        pizzaLarge.diameter = 16.00;
        pizzaLarge.price = 14;
        //Printing to the screen
        System.out.println(pizzaLarge.toString()+"\n"+pizzaLarge.eat());
        System.out.println("----------=END OF QUESTION 1=----------\n");
        
        Jelly jellyChivery = new Jelly();//Creating an OBJ
        //Initializating OBJ variable
        jellyChivery.manufacturer = "Chivery";
        jellyChivery.price = 3.50F;
        jellyChivery.flavaur = "Strawberry";
        jellyChivery.noCalories = 24;
        jellyChivery.expryData = "25/06/2016";
        //Printing to the Screen
        System.out.println(jellyChivery.toStringJelly()
                +jellyChivery.setInstructions()+"\n");
        
        Jelly jellyNestles = new Jelly();//Creating an OBJ
        //Initializating OBJ variable
        jellyNestles.manufacturer = "Nestles";
        jellyNestles.price = 3.42F;
        jellyNestles.flavaur = "Banana";
        jellyNestles.noCalories = 26;
        jellyNestles.expryData = "27/07/2016";
        //Printing to the screen
        System.out.println(jellyChivery.toStringJelly()
                +jellyChivery.setInstructions()+"\n");
        
        Jelly jellyDanones = new Jelly();//Creating an OBJ
        //Initializating OBJ variables
        jellyDanones.manufacturer = "Danones";
        jellyDanones.price = 3.00F;
        jellyDanones.flavaur = "Lemon";
        jellyDanones.noCalories = 28;
        jellyDanones.expryData = "28/06/2015";
        //Printing to the screen
        System.out.println(jellyChivery.toStringJelly()
                +jellyChivery.setInstructions()+"\n");
        System.out.println("----------=END OF QUESTION 2=----------\n");
        
        Numbers n1 = new Numbers();//Creatinc an OBJ
        //Sending values to methods and printing the return values to the screen
        System.out.println("Sum: " + n1.sum(5,10));
        System.out.println("Divide: " + n1.divide(10,10));
        System.out.println("Multiply: " +n1.multiply(15,10));
        System.out.println("Remainder: " + n1.remainder(100,90));
        //Calling a method
        n1.message();
        System.out.println("----------=END OF QUESTION 4=----------\n");
        
        NumberRange numberRanger = new NumberRange();//Creating an OBJ
        //Sending values to the method and printing return message to the screen
        System.out.println("\n"+numberRanger.checkInRange(5, 500, 333));
        System.out.println("----------=END OF QUESTION 5=----------\n");
        
        VowelCount vowelCount = new VowelCount();//Creating an OBJ
        //Sending values to the method and printing return message to the screen
        System.out.println(vowelCount.vowelCount("Walking on the moon"));
        System.out.println("----------=END OF QUESTION 6=----------\n");
        
        Sum sum = new Sum();//Creating an OBJ
        //Sending values to the method and printing return message to the screen
        System.out.println(sum.sumTwoValues(4, 5));
        System.out.println(sum.sumTwoValues(4F, 5F));
        System.out.println(sum.sumTwoValues(4.0, 5.0));
        System.out.println(sum.sumTwoValues(4, 5));
        System.out.println(sum.sumTwoValues(4, 5));
        System.out.println("----------=END OF QUESTION 7=----------\n");
        //Creating OBJs and Declaring Atributess
        Student s1 = new Student("Billy", "Davis", (byte)17, "Leaving Cert 1", 
                70.5F, "12 High Street, Dublin");
        Student s2 = new Student("Anna", "Smith", (byte)18, "Leaving Cert 1", 
                80.0F, "19 Lower Street, Dublin");
        Student s3 = new Student("Georgina", "Moriarty", (byte)17, 
                "Leaving Cert 1", 90.0F, "5 Middle Street, Dublin");
        //Calling and printing to screen Overridet toString method 
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //Calling Method studentsAndGrade
        Student.studentsAndGrade();
        System.out.println("----------=END OF QUESTION 8=----------\n");
        //Creating OBJs and Declaring Atributess
        Smartphone sp1 = new Smartphone("Nooks 610", "Nooks", 100.0F,
                "04/06/2008", 0F, false);
        sp1.topUpCredit(15F);//Calling topUpCredit method
        sp1.charge();//Calling chearge method
        Smartphone sp2 = new Smartphone("H3C Sensation610", "H3C", 110F, 
                "14/07/2012", 0F, false);
        Smartphone sp3 = new Smartphone("Simsung Desire", "Simsung", 190F, 
                "14/07/2015", 0F, false);
        //Calling and printing to screen Overridet toString method 
        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);
        Smartphone.smartphonesAndAveragePrice();//Calling Method 
        //smartphonesAndAveragePrice
        System.out.println("----------=END OF QUESTION 9=----------\n");
    }
    
}
