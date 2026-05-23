# Exercise: Trace a Call Chain

This is a written exercise. Do not run any code until Part 3.

## Setup

You have a fixed `InventoryManager` (all six bugs resolved from Module 3). You are tracing what happens when a sequence of method calls executes.

Use the call chain notation from Module 4:

```
main()
  └─ methodName(args)
       └─ returns: type and value
```

---

## Part 1 — Trace this sequence on paper

```java
InventoryManager inv = new InventoryManager();
inv.addItem("bolt", 100, 0.05);
inv.addItem("nut", 50, 0.03);
inv.addItem("washer", 10, 0.02);
inv.updatePrice("bolt", 0.07);
double total = inv.getTotalValue();
List<InventoryManager.Item> low = inv.getLowStockItems(20);
```

For each line, write:
- what method executes
- what the method receives as arguments
- what the inventory list looks like before and after (for mutations)
- what value is returned

When you reach `getTotalValue()`, trace the loop iteration by iteration and show the running total.

---

## Part 2 — Predict the outputs

Without running the code, answer these questions based on your trace:

1. What is the value of `total`?
2. How many items does `low` contain? Which items?
3. If you called `inv.removeItem("bolt")` after the sequence above, what would `total` be?

Write your predictions here before continuing.

---

## Part 3 — Verify

Run the code sequence in a `main()` method. Print `total`, print each item in `low`, then add the remove call and print the new total.

Compare to your predictions. For each discrepancy, write:
- what you predicted
- what actually happened
- why your mental model was wrong

---

## Part 4 — Introduce a bug and retrace

Change `getTotalValue` to not multiply by quantity (remove `* item.quantity`). Re-trace the sequence from Part 1 with the bug in place.

Write:
- what value `total` now returns
- at which exact line in `getTotalValue` the value diverges from the correct result
- how you would find this bug if you did not already know where it was

---

## Reflection

Answer these questions in writing:

1. At which point in your trace were you most uncertain? What were you unsure about?
2. Did any method do something unexpected when you ran it? What did you assume it did that turned out to be wrong?
3. What would make this trace harder — if `InventoryManager` called methods in another class, a database, or a network endpoint?
