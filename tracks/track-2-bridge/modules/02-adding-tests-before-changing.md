# Module 2 — Adding Tests Before Changing Code

## Goal

Write tests that document current behavior before making any changes, creating a safety net for later work.

## Prerequisites

- Module 1 complete
- JUnit basics (Track 1, Module 9)

## Why test before changing

Without tests, you cannot know if your changes preserved existing behavior.

The pattern:

1. Write tests for current behavior (they should pass)
2. Make your change
3. Run tests again (they should still pass)
4. If you intentionally change behavior, update the tests too

This is different from writing tests for new code. Here you are writing tests to document what already exists — including bugs.

## Exercise: Add tests for `InventoryManager`

Create `InventoryManagerTest.java` in your test directory.

Write tests for each method. Include all three categories below.

### Happy path tests

Tests that verify normal, expected behavior:

- `addItem` adds a new item and returns `false` (item did not previously exist)
- `findItem` returns the correct item when it exists
- `getTotalValue` returns the correct sum of `price × quantity`
- `getLowStockItems` returns items below the threshold
- `getItemsSortedByName` returns items in alphabetical order

### Edge case tests

Tests at the boundaries of what the code handles:

- Adding an item that already exists (should update quantity)
- Removing an item that does not exist (should return `false` and not throw)
- Finding an item that does not exist (should return `null`)
- `getLowStockItems` with threshold zero
- `getLowStockItems` with no low-stock items
- `getItemsSortedByName` with an empty inventory

### Bug-revealing tests

Tests that expose bugs you found in Module 1. These should FAIL initially.

That is expected and intentional. A failing test is evidence of a real problem.

Example:

```java
@Test
public void removeItem_byName_shouldReturnTrueWhenItemExists() {
    InventoryManager manager = new InventoryManager();
    manager.addItem("Widget", 10.0, 5);

    boolean result = manager.removeItem("Widget");

    assertTrue(result);
    assertNull(manager.findItem("Widget"));
}
```

If `removeItem` uses `==` to compare strings instead of `.equals()`, this test will fail in ways that are hard to predict — which is exactly what you want to expose.

## Debugging practice

Run your tests. Some will fail. For each failure, decide:

- Is this revealing a real bug in the code? If yes, note it. Do not fix the code yet.
- Is this revealing a mistake in your test? If yes, fix the test.

The goal is to create an accurate picture of what the code currently does, not what it should do.

## Spine prompts

### Testing maturity

What is the difference between a test that verifies correct behavior and a test that documents current (possibly wrong) behavior? When is each appropriate?

### Discipline of Doubt

What edge cases did you initially miss when writing tests? How did you discover them?

### Code reading

Did writing tests change your understanding of what the code actually does versus what the method names suggest?

### Debugging

When a test fails with an unexpected exception, what is the first thing you check — the test, the code, or the setup?

## Check for understanding

1. Why write tests you know will fail?
2. What should you do if the code throws a `NullPointerException` on valid input?
3. When is it safe to change a test that currently passes?
4. What does it mean to "document current behavior" rather than "verify correct behavior"?

## Next module

[Module 3 — Making Small Safe Changes](./03-making-small-safe-changes.md)
