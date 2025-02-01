import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class for the ItemByQuantity class.
 * This class tests the functionality of the ItemByQuantity class.
 */
public class ItemByQuantityTest {
  /**
   * Tests the creation and price calculation of an ItemByQuantity object.
   */
  @Test
  public void testItemByQuantity() {
    ItemByQuantity item = new ItemByQuantity("Eggs", 12, 0.20);
    assertEquals("Eggs", item.getName());
    assertEquals("ItemByQuantity", item.getType());
    assertEquals(2.40, item.price(), 0.001);
  }
}
