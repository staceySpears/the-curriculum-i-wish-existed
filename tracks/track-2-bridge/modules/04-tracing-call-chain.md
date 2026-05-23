# Module 4 — Tracing a Call Chain

## Goal

Follow a single operation from entry point to final result, naming every method it passes through.

## Prerequisites

- Module 3 complete (all six bugs in `InventoryManager` fixed)

## What a call chain is

A call chain is the sequence of method calls that executes when you trigger one operation. Every line of code is either called from somewhere else or is the entry point itself. Understanding the chain tells you:

- where data comes from before it reaches a method
- how a value is transformed as it passes through multiple methods
- where a bug could have entered the system
- what "changing this method" will affect downstream

## How to trace without running the code

Reading a call chain on paper forces you to reason about what the code does, not just what it prints. This skill is essential when you do not have a debugger attached, when the code runs in production, or when you are reviewing a change someone else made.

**Step 1 — Find the entry point.** In a Java program, this is usually `main()` or a test method. Mark it.

**Step 2 — Follow the first call.** When `main()` calls `addItem(...)`, go to `addItem`. Write: `main → addItem`.

**Step 3 — Go deeper.** If `addItem` calls any other methods, follow those too. Note every method name in order.

**Step 4 — Note what each method receives and returns.** A method's signature tells you its inputs and output type. Write them down next to the method name in your trace.

**Step 5 — Identify where data changes.** Mark each point where a value is transformed, not just passed through.

**Step 6 — Come back up.** When a method returns, go back to where it was called and continue tracing from there.

## Call chain notation

Use this format in your notes:

```
main()
  └─ addItem("widget", 10, 5.99)
       └─ [loop: checks items.size() entries]
       └─ returns: boolean
  └─ getTotalValue()
       └─ [loop: accumulates price * quantity]
       └─ returns: double
```

## Exercise

Using your fixed `InventoryManager`, trace the following scenarios on paper before running any code.

**Trace 1: Adding a new item**

Trace: `main()` calls `addItem("gadget", 5, 12.00)` on an empty inventory.

Write down:
- every method that executes
- the value of the list before and after
- what the return value is

**Trace 2: Calculating total value after two adds**

Trace: add `("widget", 3, 10.00)`, then add `("gadget", 2, 5.00)`, then call `getTotalValue()`.

Write down:
- what the list contains after each add
- how `getTotalValue` accumulates its result step by step
- the expected return value

**Trace 3: Removing an item that does not exist**

Trace: call `removeItem("phantom")` on a list containing only `"widget"`.

Write down:
- what the method does on each loop iteration
- what it returns
- why no exception is thrown

**Trace 4: Price update with a negative value**

Trace: call `updatePrice("widget", -1.0)`.

Write down:
- which branch executes first
- what the method returns
- whether any item is modified

## After tracing: verify

Run each scenario in `main()` and compare the actual output to your trace. Where they differ, your mental model was wrong. Update your notes to reflect what you learned.

## Spine prompts

### Code reading

After completing the four traces, which method was hardest to trace and why? What information were you missing when you started?

### Debugging

If your trace predicted the wrong output, what was the flaw in your reasoning? Was it a misread loop boundary, a misunderstood return value, or something else?

### Discipline of Doubt

Before tracing, you likely held some assumption about how `removeItem` handles a missing name. What was that assumption? Was it correct?

## Check for understanding

1. What is the difference between a method that *calls* another method and a method that *returns a value to* another method?
2. If a bug produces the wrong output in `main()`, how does tracing help you find where the wrong value entered the chain?
3. Why is it useful to trace a method even when you already know what it does?

## Next module

[Module 5 — Responsibility Boundaries](./05-responsibility-boundaries.md)
