// Track 2 Exercise: Writing Tests for Existing Code
//
// Before you write tests, READ InventoryManager.java completely.
// Understand what each method is supposed to do.
// Then write tests that cover the behavior — both correct and buggy.
//
// Setup: add JUnit 5 to your project.
// See Module 9 of Track 1 for Gradle configuration.
//
// The legacy codebase is at: legacy-codebase/InventoryManager.java
// Copy it to your project's src/ directory before running tests.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class InventoryManagerTest {

    private InventoryManager manager;

    @BeforeEach
    void setUp() {
        manager = new InventoryManager();
    }

    // --- addItem tests ---

    @Test
    void addItem_returnsTrue_whenItemIsNew() {
        // TODO
    }

    @Test
    void addItem_addedItemAppearsInInventory() {
        // TODO
    }

    @Test
    void addItem_updatesQuantity_whenItemAlreadyExists() {
        // TODO: add "widget" with quantity 5, then add "widget" again with quantity 3
        // what quantity does the inventory show?
    }

    @Test
    void addItem_returnsFalse_whenItemAlreadyExists() {
        // TODO: this test will FAIL on the buggy version — that is expected
        // Write the test for correct behavior, then fix the bug in Module 3
    }

    // --- removeItem tests ---

    @Test
    void removeItem_returnsTrue_whenItemExists() {
        // TODO
    }

    @Test
    void removeItem_returnsFalse_whenItemDoesNotExist() {
        // TODO
    }

    @Test
    void removeItem_itemNoLongerInInventory_afterRemoval() {
        // TODO
    }

    @Test
    void removeItem_worksCorrectly_withStringEquality() {
        // TODO: this test will FAIL on the buggy version
        // The bug: == vs .equals() for string comparison
        // Hint: create a name string, add item, then remove using a DIFFERENT
        // string object with the same content: new String("widget")
    }

    // --- getTotalValue tests ---

    @Test
    void getTotalValue_returnsZero_whenInventoryIsEmpty() {
        // TODO
    }

    @Test
    void getTotalValue_returnsCorrectTotal_withOneItem() {
        // TODO: add one item with known price and quantity
        // verify total = price * quantity
        // this test will FAIL on the buggy version
    }

    @Test
    void getTotalValue_returnsCorrectTotal_withMultipleItems() {
        // TODO
    }

    // --- updatePrice tests ---

    @Test
    void updatePrice_returnsTrue_whenItemExists() {
        // TODO
    }

    @Test
    void updatePrice_returnsFalse_whenItemDoesNotExist() {
        // TODO: this test will FAIL on the buggy version
    }

    @Test
    void updatePrice_returnsFalse_whenNewPriceIsNegative() {
        // TODO
    }

    @Test
    void updatePrice_priceChanges_afterValidUpdate() {
        // TODO: update price, then verify new price via getTotalValue
    }

    // --- getLowStockItems tests ---

    @Test
    void getLowStockItems_returnsEmptyList_whenAllItemsAboveThreshold() {
        // TODO
    }

    @Test
    void getLowStockItems_includesItems_atExactThreshold() {
        // TODO: add item with quantity == threshold
        // this test will FAIL on the buggy version (< vs <=)
    }

    @Test
    void getLowStockItems_includesItems_belowThreshold() {
        // TODO
    }

    @Test
    void getLowStockItems_excludesItems_aboveThreshold() {
        // TODO
    }
}
