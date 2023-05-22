package main.java.com.server;

import main.java.com.server.api.classes.Condiment;
public class App 
{
    public static void main( String[] args )
    {
        Condiment condiment  = Condiment.getClassFromName("Sugar");
      System.out.println(condiment.getCost());
    }
}
