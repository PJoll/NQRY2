package main.com.Coffee

import java.util.List

import main.com.Coffee.classes.CoffeePreparation;
import main.com.Coffee.classes.CoffeeSize;
import main.com.Coffee.classes.CoffeeType;
import main.com.Coffee.classes.Condiment;


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

    /*
     * Return a default Concatenated Description.
     * A Custom description can be formed using the individual getters.
     */
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        description.append(getCoffeeTypeDesc()).append(" : ")
                .append(getCoffeePreparationDesc()).append(" : ")
                .append(getCoffeeSizeDesc()).append(" With : ");
        for (int i = 0; i < condiments.size(); i++) {
            description.append(condiments.get(i).getDesc());
            if (i != condiments.size() - 1) {
                description.append(", ");
            }
        }
        return description.toString();
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public String getCoffeeTypeDesc() {
        return coffeeType.getDesc();
    }

    public CoffeePreparation getCoffeePreparation() {
        return coffeePreparation;
    }

    public String getCoffeePreparationDesc() {
        return coffeePreparation.getDesc();
    }

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public String getCoffeeSizeDesc() {
        return coffeeSize.getDesc();
    }

    public List<Condiment> getCondiments() {
        return condiments;
    }

    public List<String> getCondimentsList() {
        return condiments.stream().map(Condiment::getDesc).collect(Collectors.toList());
    }

}