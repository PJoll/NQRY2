package main.com.Coffee

import java.util.List

import main.com.Coffee.classes.CoffeePreparation
import main.com.Coffee.classes.CoffeeSize
import main.com.Coffee.classes.CoffeeType
import main.com.Coffee.classes.Condiment




public interface CostCalculation {

    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize,
                             List<Condiment> condiments);

    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize,
                             Condiment condiment);

    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize);
}