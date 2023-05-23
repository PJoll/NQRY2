package main.java.com.server.app;

import java.util.List;

import main.java.com.server.app.classes.CoffeePreparation;
import main.java.com.server.app.classes.CoffeeSize;
import main.java.com.server.app.classes.CoffeeType;
import main.java.com.server.app.classes.Condiment;




public interface CostCalcs {

    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize,
                             List<Condiment> condiments);

     


    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize,
                             Condiment condiment);

    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize);
}