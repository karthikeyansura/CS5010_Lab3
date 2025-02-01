/**
 * Represents a grocery item sold by unit.
 */
public class ItemByUnit extends AbstractGroceryItem {
  private final int numUnits;
  private final double pricePerUnit;

  /**
   * Constructs an item sold by unit.
   *
   * @param name          the name of the item
   * @param numUnits      the number of units
   * @param pricePerUnit  the price per unit
   */
  public ItemByUnit(String name, int numUnits, double pricePerUnit) {
    super("ItemByUnit", name);
    if (numUnits < 0 || pricePerUnit < 0) {
      throw new IllegalArgumentException("Cannot have negative units");
    }
    this.numUnits = numUnits;
    this.pricePerUnit = pricePerUnit;
  }

  @Override
  public double price() {
    return (getPrice(this.numUnits, this.pricePerUnit));
  }
}
