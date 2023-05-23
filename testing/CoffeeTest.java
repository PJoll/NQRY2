import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.com.server.app.classes.*;
import main.java.com.server.app.*;
import java.util.List;




public class CoffeeTest {

    @Test
    public void testGetCost() {
        // Create a coffee object with specific coffee type, preparation, size, and condiments
        CoffeeType coffeeType = CoffeeType.ARABICA;
        CoffeePreparation coffeePreparation = CoffeePreparation.ESPRESSO;
        CoffeeSize coffeeSize = CoffeeSize.LARGE;
        Condiment condiment1 = Condiment.SUGAR;
        Condiment condiment2 = Condiment.MILK;

        Coffee coffee = new Coffee(coffeeType, coffeePreparation, coffeeSize, List.of(condiment1, condiment2));

        // Calculate the expected cost based on the chosen coffee type, preparation, size, and condiments
        double expectedCost = coffeeType.getCost() + coffeePreparation.getCost() + coffeeSize.getCost()
                + condiment1.getCost() + condiment2.getCost();

        // Verify that the calculated cost matches the expected cost
        Assertions.assertEquals(expectedCost, coffee.getCost());
    }

    @Test
    public void testGetName() {
        // Create a coffee object with specific coffee type, preparation, size, and condiments
        CoffeeType coffeeType = CoffeeType.ROBUSTA;
        CoffeePreparation coffeePreparation = CoffeePreparation.CAPPUCCINO;
        CoffeeSize coffeeSize = CoffeeSize.STANDARD;
        Condiment condiment1 = Condiment.MILK;
        Condiment condiment2 = Condiment.COCO;

        Coffee coffee = new Coffee(coffeeType, coffeePreparation, coffeeSize, List.of(condiment1, condiment2));

        // Calculate the expected name based on the chosen coffee type, preparation, size, and condiments
        String expectedName = coffeeType.getName() + " : " + coffeePreparation.getName() + " : "
                + coffeeSize.getName() + " With : " + condiment1.getName() + ", " + condiment2.getName();

        // Verify that the generated name matches the expected name
        Assertions.assertEquals(expectedName, coffee.getName());
    }
}