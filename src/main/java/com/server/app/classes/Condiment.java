package main.java.com.server.app.classes;

import java.util.Arrays;
import java.util.List;

public class Condiment implements BaseClass {
    // Constants with their names and costs
    public static final Condiment MILK = new Condiment("Milk", 1.00);
    public static final Condiment SUGAR = new Condiment("Sugar", 0.25);
    public static final Condiment COCO = new Condiment("Coco Powder", 0.10);

    // Fields for the constants
    private String name;
    private double cost;

    // Constructor for the constants
    public Condiment(String name, double cost) {
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
    public static List<Condiment> getAllValues() {
        return Arrays.asList(MILK, SUGAR, COCO);
    }

    // Method to retrieve the Condiment enum based on the description
    public static Condiment getClassFromName(String name) {
        for (Condiment condiment : getAllValues()) {
            if (condiment.getName().equals(name)) {
                return condiment;
            }
        }
        // Throw an exception if no Condiment constant matches the given description
        throw new IllegalArgumentException("No Condiment found for name: " + name);
    }
}