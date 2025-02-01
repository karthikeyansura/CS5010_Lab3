/**
 * Represents a grocery item sold by weight.
 */
public class ItemByWeight extends AbstractGroceryItem {
  private final double weight;
  private final double pricePerPound;

  /**
   * Constructs an item sold by weight.
   *
   * @param name           the name of the item
   * @param weight         the weight of the item
   * @param pricePerPound  the price per pound
   */
  public ItemByWeight(String name, double weight, double pricePerPound) {
    super("ItemByWeight", name);
    if (weight < 0 || pricePerPound < 0) {
      throw new IllegalArgumentException("Cannot have negative weights");
    }
    this.weight = weight;
    this.pricePerPound = pricePerPound;
  }

  @Override
  public double price() {
    return (getPrice(this.weight, this.pricePerPound));
  }
}
