/**
 * Represents a grocery item sold by quantity.
 */
public class ItemByQuantity extends AbstractGroceryItem {
  private final int quantity;
  private final double pricePerQuantity;

  /**
   * Constructs an item sold by quantity.
   *
   * @param name             the name of the item
   * @param quantity         the quantity of the item
   * @param pricePerQuantity the price per quantity
   */
  public ItemByQuantity(String name, int quantity, double pricePerQuantity) {
    super("ItemByQuantity", name);
    if (quantity < 0 || pricePerQuantity < 0) {
      throw new IllegalArgumentException("Cannot have negative quantity");
    }
    this.quantity = quantity;
    this.pricePerQuantity = pricePerQuantity;
  }

  @Override
  public double price() {
    return (getPrice(this.quantity, this.pricePerQuantity));
  }
}
