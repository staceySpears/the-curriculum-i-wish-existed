# Module 6 — Reading Tests to Infer Behavior

## Goal

Use tests as documentation to understand what a system is supposed to do when written explanations are missing.

## Prerequisites

- Module 5 complete

## What this module covers

- Tests as a source of truth about intended behavior
- Reading test names to understand what the author expected
- Reading assertions to understand the expected inputs and outputs
- Identifying what is not covered by tests
- Using tests to understand edge cases the original author thought about
- The difference between "tests pass" and "behavior is correct"
- Writing tests that document intent, not just verify output

## The core insight

In many real codebases, tests are better documentation than comments. Comments go stale. Tests break when the behavior they describe is removed.

If you want to know what a method is supposed to do: read its tests first.

## Exercise

Given your `InventoryManagerTest.java` from Module 2:

1. Read each test name. Does the name clearly state the condition and expected result?
2. Read each test body. What does it tell you about what the code is supposed to do?
3. Identify three behaviors of `InventoryManager` that are NOT covered by any test.
4. Improve three test names to be more descriptive.
5. Add one test for a behavior that is currently undocumented.

## Spine prompts

### Testing maturity

What is the difference between a test that communicates intent and a test that just checks a value? Find one test in your suite that needs a better name and one that needs a better assertion message.

### Code reading

What did you learn about the original code by reading your own tests? Did any test reveal an assumption you made that turned out to be wrong?

### Discipline of Doubt

What behavior is your test suite definitely not covering? What would break in `InventoryManager` that your tests would not catch?

## Next module

[Module 7 — Debugging Across Components](./07-debugging-across-components.md)
