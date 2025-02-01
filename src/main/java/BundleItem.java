/**
 * Represents a bundle of grocery items.
 */
public class BundleItem extends AbstractGroceryItem {
  private final int item;
  private final double bundleQuantity;

  /**
   * Constructs a bundle of grocery items.
   *
   * @param item            the item to be bundled
   * @param bundleQuantity  the quantity of items in the bundle
   */
  public BundleItem(String name, int item, double bundleQuantity) {
    super("BundleItem", name);
    if (bundleQuantity <= 0) {
      throw new IllegalArgumentException("Cannot have negative bundle quantity");
    }
    this.item = item;
    this.bundleQuantity = bundleQuantity;
  }

  @Override
  public double price() {
    return getPrice(this.item, this.bundleQuantity);
  }
}
