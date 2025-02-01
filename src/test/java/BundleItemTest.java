import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class for the BundleItem class.
 * This class tests the functionality of the BundleItem class.
 */
public class BundleItemTest {
  /**
   * Tests the creation and price calculation of an BundleItem object.
   */
  @Test
  public void testBundleItem() {
    BundleItem item = new BundleItem("Apple", 5, 0.99);
    assertEquals("Apple", item.getName());
    assertEquals("BundleItem", item.getType());
    assertEquals(4.95, item.price(), 0.001);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNegativeBundleQuantity() {
    new BundleItem("Apple", 5, -0.99);
  }

}
