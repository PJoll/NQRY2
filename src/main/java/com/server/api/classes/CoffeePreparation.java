package main.java.com.server.api.classes;

import java.util.Arrays;
import java.util.List;

public class CoffeePreparation implements BaseClass {
    // Constants with their descriptions and costs
    public static final CoffeePreparation ESPRESSO = new CoffeePreparation("Espresso", 1.0);
    public static final CoffeePreparation LATTE = new CoffeePreparation("Latte", 1.25);
    public static final CoffeePreparation CAPPUCCINO = new CoffeePreparation("Cappuccino", 1.50);
    public static final CoffeePreparation MACCHIATO = new CoffeePreparation("Macchiato", 1.75);
    public static final CoffeePreparation MOCHA = new CoffeePreparation("Mocha", 2.0);

    // Fields for the constants
    private String name;
    private double cost;

    // Constructor for the constants
    public CoffeePreparation(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the cost
    public double getCost() {
        return cost;
    }

    // Creating a list of the constants
    public static List<CoffeePreparation> getAllValues() {
        return Arrays.asList(ESPRESSO, LATTE, CAPPUCCINO, MACCHIATO, MOCHA);
    }
    public static CoffeePreparation getClassFromDescription(String description) {
        for (CoffeePreparation preparation : getAllValues()) {
            if (preparation.getName().equals(description)) {
                return preparation;
            }
        }
        // Throw an exception if no CoffeePreparation constant matches the given description
        throw new IllegalArgumentException("No CoffeePreparation found for description: " + description);
    }
}