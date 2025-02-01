/**
 * An abstract base class for grocery items.
 * Provides common functionality for all types of grocery items.
 */
public abstract class AbstractGroceryItem implements GroceryItem {
  private final String type;
  private final String name;

  /**
   * Constructs a grocery item with the given type and name.
   *
   * @param type the type of the grocery item
   * @param name the name of the grocery item
   */
  protected AbstractGroceryItem(String type, String name) {
    if (type == null || name == null) {
      throw new IllegalArgumentException("Type and name cannot be null.");
    }
    this.type = type;
    this.name = name;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public String getName() {
    return name;
  }

  public double getPrice(double numberOfPieces, double costPerPiece) {
    return (numberOfPieces * costPerPiece);
  }

}
