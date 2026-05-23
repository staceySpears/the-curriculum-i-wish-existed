# Module 5 — Responsibility Boundaries

## Goal

Identify what each class or method is responsible for, and name where one responsibility ends and another begins.

## Prerequisites

- Module 4 complete

## What a responsibility is

A responsibility is a single reason a piece of code exists. A class or method has one responsibility when you can describe its purpose in one plain sentence without using "and."

- `addItem` — manages whether an item exists in the list and adds or updates it
- `getTotalValue` — calculates the total monetary value of the inventory
- `printAllItems` — formats and outputs inventory data for display

These are distinct responsibilities. If `addItem` also printed to the console, it would have two responsibilities. That coupling makes code harder to test, harder to change, and harder to understand.

## Why boundaries matter

When responsibilities blur, a change in one place causes unexpected effects elsewhere. If you are debugging and do not understand where one responsibility ends, you do not know which class to look in. If you are adding a feature and do not know who owns what, you will add it in the wrong place.

Naming boundaries is a prerequisite for safe change.

## How to identify a responsibility

Ask these questions about any method or class:

1. **What is the single thing it does?** If you need "and" to describe it, it may be doing too much.
2. **Who is its caller?** What does the caller expect it to do — and only do?
3. **What data does it own?** Methods that access the same field are likely in the same responsibility.
4. **Would a change to this logic require a change here?** If a pricing rule changes, only `updatePrice` should need updating. If formatting output changes, only output methods should need updating.

## Responsibility vocabulary

| Term | Meaning |
|---|---|
| **Data storage** | Holds and manages a collection of items |
| **Business logic** | Applies rules to that data (pricing, stock thresholds) |
| **Query** | Reads data and returns a result without modifying state |
| **Mutation** | Changes state (add, remove, update) |
| **Output / presentation** | Formats data for display or export |

## Exercise

**Part 1: Classify each method**

For each method in `InventoryManager`, write:
- its responsibility in one sentence (no "and")
- which category it belongs to from the vocabulary table above
- whether it reads, writes, or both

Methods to classify: `addItem`, `removeItem`, `getTotalValue`, `updatePrice`, `getLowStockItems`

**Part 2: Find a boundary violation**

`InventoryManager` has one method that arguably violates its own boundaries. It does something that a separate "reporter" or "display" class might own.

Find that method, name the boundary violation, and write: what responsibility does this method carry that does not belong here? Where would it better live?

**Part 3: Design a split**

If you were to split `InventoryManager` into two classes — one that manages data and one that answers queries about it — what would each class contain? Write two short class signatures:

```
class InventoryStore {
    // manages the list: add, remove, update
}

class InventoryQuery {
    // answers questions about the list: total value, low stock
}
```

You do not need to implement them. Just describe what each one owns.

**Part 4: Identify a missing responsibility**

`InventoryManager` does not validate input beyond checking for negative prices. A caller can add an item with a blank name, a quantity of -1, or a price of 0.

Write a description of where input validation responsibility should live and what it should check. Would you put it inside the existing methods, in a new method, or in a separate class? Justify your choice.

## Spine prompts

### Code reading

After classifying each method, which two methods are most similar in responsibility? What is the clearest difference between them?

### Technical communication

Take your answer to Part 3 and read it aloud as if explaining it to a teammate. Would they understand which class to add new behavior to? Revise until the answer is yes.

### Discipline of Doubt

Part 4 asks you where validation should live. There is not one correct answer. What are the arguments for putting it inside each method versus in a dedicated validator? What did you decide, and what did you give up?

## Check for understanding

1. What is the simplest test for whether a method has one responsibility?
2. If two methods both access the same field in the same class, what does that tell you about their relationship?
3. Why does understanding responsibility boundaries help with debugging?

## Next module

[Module 6 — Reading Tests to Infer Behavior](./06-reading-tests-to-infer-behavior.md)
