package main.java.com.server.app.classes;

import java.util.Arrays;
import java.util.List;

public class CoffeeSize implements BaseClass {
    // Constants with their descriptions and costs
    public static final CoffeeSize STANDARD = new CoffeeSize("Standard", 0.0);
    public static final CoffeeSize CHILD = new CoffeeSize("Child", 0.75);
    public static final CoffeeSize LARGE = new CoffeeSize("Large", 1.50);
    public static final CoffeeSize ADDICT = new CoffeeSize("Addict", 2.00);

    // Fields for the constants
    private String name;
    private double cost;

    // Constructor for the constants
    private CoffeeSize(String name, double cost) {
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
    public static List<CoffeeSize> getAllValues() {
        return Arrays.asList(STANDARD, CHILD, LARGE, ADDICT);
    }

    // Retrieve the CoffeeSize constant based on its name
    public static CoffeeSize getClassFromName(String name) {
        for (CoffeeSize size : Arrays.asList(STANDARD, CHILD, LARGE, ADDICT)) {
            if (size.getName().equals(name)) {
                return size;
            }
        }
        // Throw an exception if no CoffeeSize constant matches the given name
        throw new IllegalArgumentException("No CoffeeSize found for name: " + name);
    }
}