# Module 3 — Making Small Safe Changes

## Goal

Modify existing code incrementally, keeping tests passing at each step.

## Prerequisites

- Module 2 complete (tests written and passing for current behavior)

## Key principle

One bug. One fix. One commit. Tests always passing between changes.

If you try to fix all bugs at once, you cannot tell which fix caused a new failure. Small changes give you a clear signal after every step.

## The workflow

1. Pick one bug from your bug list
2. Write a failing test that exposes exactly that bug
3. Make the smallest possible code change to fix it
4. Verify the test now passes
5. Verify all other tests still pass
6. Commit with a message that describes the bug and the fix
7. Repeat

## Bugs to fix in order

Fix these in sequence. Do not skip ahead.

**Bug 1: `addItem` loop boundary**

The loop condition `i <= items.size()` causes an `IndexOutOfBoundsException`. The correct boundary is `i < items.size()`.

**Bug 2: `addItem` return value**

When an existing item is found and updated, the method returns `true`. The comment says it should return `false` when the item already exists. Decide which behavior is correct, update the test accordingly, then fix the implementation.

**Bug 3: `removeItem` string comparison**

`item.name == name` compares object references, not content. Use `.equals()`. This is why the test you wrote in Module 2 fails.

**Bug 4: `getTotalValue` ignores quantity**

The loop adds `item.price` but the comment says total value is `price × quantity`. Add the multiplication.

**Bug 5: `updatePrice` return value**

When `newPrice < 0`, the method returns `false` and stops — but it does not return after doing so for valid names. Trace the logic: what does the method return when the item is found and the price is valid?

**Bug 6: `getLowStockItems` threshold boundary**

The comment says "quantity <= threshold" but the code uses `<`. Decide which the correct behavior is, write a test for the boundary case, then fix the implementation.

## Commit message format

Use this format:

```
Fix: [method name] - [what was wrong] - [what you changed]

Example:
Fix: removeItem - string comparison used == instead of .equals()
```

## Spine prompts

### Testing maturity

How did the tests from Module 2 help you fix bugs safely? Did any test break in a way you did not expect?

### Discipline of Doubt

When you fixed `getTotalValue`, did you check whether the fix introduced any new edge cases? For example: what if `quantity` is zero?

### Debugging

When a test failed after your change, how did you decide whether the problem was in your fix or in the test itself?

### Code reading

Before fixing each bug, did you fully understand what the surrounding code was doing? What happened the one time you changed code without fully reading it first?

## Check for understanding

1. Why fix one bug at a time instead of all bugs at once?
2. What does it mean for tests to be your safety net?
3. When should you update an existing test instead of adding a new one?
4. What should you do if fixing one bug reveals another?

## Next module

[Module 4 — Tracing a Call Chain](./04-tracing-call-chain.md)
