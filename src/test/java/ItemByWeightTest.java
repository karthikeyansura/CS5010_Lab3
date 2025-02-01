import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class for the ItemByWeight class.
 * This class tests the functionality of the ItemByWeight class.
 */
public class ItemByWeightTest {
  /**
   * Tests the creation and price calculation of an ItemByWeight object.
   */
  @Test
  public void testItemByWeight() {
    ItemByWeight item = new ItemByWeight("Potatoes", 2.5, 1.99);
    assertEquals("Potatoes", item.getName());
    assertEquals("ItemByWeight", item.getType());
    assertEquals(4.975, item.price(), 0.001);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNegativeWeight() {
    new ItemByWeight("Potatoes", -2.5, 1.99);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNegativePricePerPound() {
    new ItemByWeight("Potatoes", 2.5, -1.99);
  }

}
