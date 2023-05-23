package main.java.com.server;
// import the class you want to use
import main.java.com.server.app.classes.Condiment;
import main.java.com.server.app.classes.CoffeePreparation;
import main.java.com.server.app.classes.CoffeeSize;
import main.java.com.server.app.classes.CoffeeType;
import main.java.com.server.app.Coffee;


public class App 
{
    public static void main( String[] args )
    {
        Condiment condiment  = Condiment.getClassFromName("Sugar");  // create a new instance of the class
      System.out.println(condiment.getCost()); //print the cost
    }
}
