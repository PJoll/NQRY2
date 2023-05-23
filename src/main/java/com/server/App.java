package main.java.com.server;
// import the class you want to use
import main.java.com.server.app.classes.Condiment;
import main.java.com.server.app.classes.CoffeePreparation;
import main.java.com.server.app.classes.CoffeeSize;
import main.java.com.server.app.classes.CoffeeType;
import main.java.com.server.app.Coffee;
import java.util.ArrayList;
import  java.util.List;

public class App 
{
    public static void main( String[] args )
    {
      List<Condiment> condiments = new ArrayList<>();
      condiments.add(Condiment.getClassFromName("Sugar")); // add a new instance of the class
      condiments.add(Condiment.getClassFromName("Milk")); // add another instance of the class
  
      double totalCost = calculateTotalCost(condiments); // calculate the total cost
      System.out.println("Total Cost: " + totalCost); // print the total cost
  }
  
  public static double calculateTotalCost(List<Condiment> condiments) {
      double totalCost = 0.0;
      for (Condiment condiment : condiments) {
          totalCost += condiment.getCost();
      }
      return totalCost;
  }
}