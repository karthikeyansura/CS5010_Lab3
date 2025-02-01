import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class for the ItemByUnit class.
 * This class tests the functionality of the ItemByUnit class.
 */
public class ItemByUnitTest {
  /**
   * Tests the creation and price calculation of an ItemByUnit object.
   */
  @Test
  public void testItemByUnit() {
    ItemByUnit item = new ItemByUnit("Apple", 5, 0.99);
    assertEquals("Apple", item.getName());
    assertEquals("ItemByUnit", item.getType());
    assertEquals(4.95, item.price(), 0.001);
  }
}
