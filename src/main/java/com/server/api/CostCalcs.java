package main.java.com.server.api;

import java.util.List;

import main.java.com.server.api.classes.CoffeePreparation;
import main.java.com.server.api.classes.CoffeeSize;
import main.java.com.server.api.classes.CoffeeType;
import main.java.com.server.api.classes.Condiment;




public interface CostCalcs {

    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize,
                             List<Condiment> condiments);

     


    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize,
                             Condiment condiment);

    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize);
}