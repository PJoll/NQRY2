package main.java.com.server.api;

import java.util.List;

import main.java.com.server.api.classes.CoffeePreparation;
import main.java.com.server.api.classes.CoffeeSize;
import main.java.com.server.api.classes.CoffeeType;
import main.java.com.server.api.classes.Condiment;


public class Coffee {

    private final CoffeeType coffeeType;
    private final CoffeePreparation coffeePreparation;
    private final CoffeeSize coffeeSize;
    private final List<Condiment> condiments;

    public Coffee(CoffeeType coffeeType, CoffeePreparation coffeePreparation, CoffeeSize coffeeSize,
                  List<Condiment> condiments) {

        this.coffeeType = coffeeType;
        this.coffeePreparation = coffeePreparation;
        this.coffeeSize = coffeeSize;
        this.condiments = condiments;
    }

    public double getCost() {
        double totalCost = coffeeType.getCost() + coffeePreparation.getCost() + coffeeSize.getCost();
        for (Condiment condiment : condiments) {
            totalCost += condiment.getCost();
        }
        return totalCost;
    }

    
    public String getName() {
        StringBuilder name = new StringBuilder();
        name.append(getCoffeeTypeName()).append(" : ")
                .append(getCoffeePreparationName()).append(" : ")
                .append(getCoffeeSizeName()).append(" With : ");
        for (int i = 0; i < condiments.size(); i++) {
            name.append(condiments.get(i).getName());
            if (i != condiments.size() - 1) {
                name.append(", ");
            }
        }
        return name.toString();
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public String getCoffeeTypeName() {
        return coffeeType.getName();
    }

    public CoffeePreparation getCoffeePreparation() {
        return coffeePreparation;
    }

    public String getCoffeePreparationName() {
        return coffeePreparation.getName();
    }

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public String getCoffeeSizeName() {
        return coffeeSize.getName();
    }

    public List<Condiment> getCondiments() {
        return condiments;
    }

  

}