import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


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
    public void testGetClassFromDescription() {
        // Call the getClassFromDescription() method with an existing description
        CoffeePreparation preparation = CoffeePreparation.getClassFromDescription("Espresso");

        // Assert that the returned CoffeePreparation instance has the expected name
        String expectedName = "Espresso";
        String actualName = preparation.getName();
        assertEquals(expectedName, actualName);

        // Call the getClassFromDescription() method with a non-existing description
        assertThrows(IllegalArgumentException.class, () -> {
            CoffeePreparation.getClassFromDescription("Cortado");
        });
    }
}





