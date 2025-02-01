/**
 * Represents a grocery item that can be sold in a store.
 * All grocery items must provide a name, type, and price.
 */
public interface GroceryItem {
  /**
   * Returns the name of the grocery item.
   *
   * @return the name of the item
   */
  String getName();

  /**
   * Returns the type of the grocery item (e.g., "ItemByUnit", "ItemByWeight").
   *
   * @return the type of the item
   */
  String getType();

  /**
   * Calculates the price of the grocery item.
   *
   * @return the price of the item
   */
  double price();
}