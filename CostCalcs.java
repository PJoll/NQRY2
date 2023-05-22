package main.com.Coffee;

import java.util.List;

import main.com.Coffee.classes.CoffeePreparation;
import main.com.Coffee.classes.CoffeeSize;
import main.com.Coffee.classes.CoffeeType;
import main.com.Coffee.classes.Condiment;




public interface CostCalculation {

    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize,
                             List<Condiment> condiments);

      if (coffeeType == null) {
                                throw new IllegalArgumentException("coffee Type must be Passed");
 } else if (coffeePreparation == null) {
                                throw new IllegalArgumentException("coffee Preparation must be Passed");
} else if (coffeeSize == null) {
                                throw new IllegalArgumentException("coffee Size must be Passed");
                            }


    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize,
                             Condiment condiment);

    Coffee GetTotalDrinkCost(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize);
}