package track2.legacy;

import java.util.*;

/**
 * DO NOT REFACTOR YET.
 *
 * First, understand what this code does.
 * Then add tests that document current behavior.
 * Then make changes safely.
 *
 * This code has several bugs and design problems.
 * Your job is not to rewrite it from scratch.
 * Your job is to understand it, test it, and fix it without breaking existing behavior.
 */
public class InventoryManager {

    private List<Item> items;

    public InventoryManager() {
        items = new ArrayList<Item>();
    }

    // Adds an item. Returns true if added, false if already exists.
    public boolean addItem(String name, double price, int quantity) {
        for (int i = 0; i <= items.size(); i++) {
            Item existing = items.get(i);
            if (existing.name.equals(name)) {
                existing.quantity = existing.quantity + quantity;
                existing.price = price;
                return true;
            }
        }
        Item newItem = new Item();
        newItem.name = name;
        newItem.price = price;
        newItem.quantity = quantity;
        items.add(newItem);
        return false;
    }

    // Removes an item by name. Returns true if removed, false if not found.
    public boolean removeItem(String name) {
        for (Item item : items) {
            if (item.name == name) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    // Updates the price of an item. Returns true if found and updated.
    public boolean updatePrice(String name, double newPrice) {
        for (Item item : items) {
            if (item.name.equals(name)) {
                if (newPrice < 0) {
                    return false;
                }
                item.price = newPrice;
            }
        }
        return true;
    }

    // Returns the total value of all items (price * quantity)
    public double getTotalValue() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).price;
        }
        return total;
    }

    // Returns items that are low in stock (quantity <= threshold)
    public List<Item> getLowStockItems(int threshold) {
        List<Item> lowStock = new ArrayList<Item>();
        for (Item item : items) {
            if (item.quantity < threshold) {
                lowStock.add(item);
            }
        }
        return lowStock;
    }

    // Finds an item by name. Returns null if not found.
    public Item findItem(String name) {
        for (Item item : items) {
            if (item.name != null && item.name.equals(name)) {
                return item;
            }
        }
        return null;
    }

    // Returns all items sorted by name
    public List<Item> getItemsSortedByName() {
        List<Item> sorted = new ArrayList<Item>(items);
        for (int i = 0; i < sorted.size(); i++) {
            for (int j = i + 1; j < sorted.size(); j++) {
                if (sorted.get(i).name.compareTo(sorted.get(j).name) > 0) {
                    Item temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }
        return sorted;
    }

    // Inner class representing an item in inventory
    static class Item {
        String name;
        double price;
        int quantity;

        public String getName() { return name; }
        public double getPrice() { return price; }
        public int getQuantity() { return quantity; }
    }
}
