package main.java.com.server;
// import the class you want to use
import main.java.com.server.api.classes.Condiment;
public class App 
{
    public static void main( String[] args )
    {
        Condiment condiment  = Condiment.getClassFromName("Sugar");  // create a new instance of the class
      System.out.println(condiment.getCost()); //print the cost
    }
}
