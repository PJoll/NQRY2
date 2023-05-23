import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import main.java.com.server.app.classes.CoffeePreparation;

import java.util.List;


public class CoffeePreparationTest {
    @Test
    public void testGetName() {
        // Create a CoffeePreparation instance
        CoffeePreparation preparation = new CoffeePreparation("Espresso", 1.0);

        // Call the getName() method and assert the expected result
        String expectedName = "Espresso";
        String actualName = preparation.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetCost() {
        // Create a CoffeePreparation instance
        CoffeePreparation preparation = new CoffeePreparation("Espresso", 1.0);

        // Call the getCost() method and assert the expected result
        double expectedCost = 1.0;
        double actualCost = preparation.getCost();
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testGetAllValues() {
        // Call the getAllValues() method
        List<CoffeePreparation> allValues = CoffeePreparation.getAllValues();

        // Assert that the size of the returned list matches the expected number of constants
        int expectedSize = 5;
        assertEquals(expectedSize, allValues.size());
    }

    @Test
    public void testGetClassFromName() {
        // Call the getClassFromName() method with an existing dname
        CoffeePreparation preparation = CoffeePreparation.getClassFromName("Espresso");

        // Assert that the returned CoffeePreparation instance has the expected name
        String expectedName = "Espresso";
        String actualName = preparation.getName();
        assertEquals(expectedName, actualName);

        // Call the getClassFromName() method with a non-existing name
        assertThrows(IllegalArgumentException.class, () -> {
            CoffeePreparation.getClassFromName("Long Black");
        });
    }
}





