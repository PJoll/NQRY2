package main.java.com.server.api.classes;

import java.util.Arrays;
import java.util.List;

public class CoffeeType implements BaseClass {
    // Constants with their names and costs
    public static final CoffeeType HOUSEBLEND = new CoffeeType("House Blend", 1.0);
    public static final CoffeeType DARKROAST = new CoffeeType("Dark Roast", 1.50);
    public static final CoffeeType ROBUSTA = new CoffeeType("Robusta", 2.00);
    public static final CoffeeType ARABICA = new CoffeeType("Arabica", 2.50);

    // Fields for the constants
    private String name;
    private double cost;

    // Constructor for the constants
    public CoffeeType(String name, double cost) {
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

    // Creating a list of all the constants
    public static List<CoffeeType> getAllValues() {
        return Arrays.asList(HOUSEBLEND, DARKROAST, ROBUSTA, ARABICA);
    }

    // Method to retrieve the CoffeeType enum based on the description
    public static CoffeeType getClassFromDescription(String description) {
        for (CoffeeType type : getAllValues()) {
            if (type.getName().equals(description)) {
                return type;
            }
        }
        // Throw an exception if no CoffeeType constant matches the given description
        throw new IllegalArgumentException("No CoffeeType found for description: " + description);
    }
}