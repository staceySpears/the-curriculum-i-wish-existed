# Module 6 — Reading Tests to Infer Behavior

## Goal

Use tests as documentation to understand what a system is supposed to do when written explanations are missing.

## Prerequisites

- Module 5 complete
- Your `InventoryManagerTest.java` from Module 2 available for review

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

That does not mean tests are always complete or always correct. It means they are evidence. A test tells you what at least one previous author cared enough to preserve.

## How to read a test

Read a test in three passes.

**Pass 1 — Name.** What behavior does the test claim to cover? A good test name describes a condition and an expected result.

Example:

```java
void removeItemReturnsFalseWhenNameIsMissing()
```

This name tells you three things before you read the body:

- the method under test is `removeItem`
- the condition is a missing name
- the expected result is `false`

**Pass 2 — Setup.** What data does the test create before the action? The setup tells you what state the code needs before the behavior can be observed.

```java
InventoryManager manager = new InventoryManager();
manager.addItem("widget", 3, 10.00);
```

This setup tells you the inventory contains one item named `widget` with quantity `3` and price `10.00`.

**Pass 3 — Assertion.** What exact claim does the test make?

```java
assertFalse(manager.removeItem("missing"));
```

This assertion says the method should return `false` when the item name is not found. It does not tell you whether the inventory changed unless another assertion checks that too.

## Behavior inventory

When you read tests, build a behavior inventory. This turns scattered test code into a map of the system.

Use this format:

| Test name | Method under test | Condition | Expected behavior | What this does not prove |
|---|---|---|---|---|
| `removeItemReturnsFalseWhenNameIsMissing` | `removeItem` | Inventory does not contain the name | Returns `false` | Does not prove existing items remain unchanged |
| `getTotalValueMultipliesPriceByQuantity` | `getTotalValue` | Two items with prices and quantities | Returns sum of price times quantity | Does not prove behavior for empty inventory |

The final column matters. A passing test narrows uncertainty. It does not remove all uncertainty.

## Tests as documentation

A useful test documents intent. It makes the reader faster.

Weak test name:

```java
void testRemove()
```

Better test name:

```java
void removeItemDeletesMatchingItemAndReturnsTrue()
```

Weak assertion:

```java
assertEquals(1, items.size());
```

Better assertion:

```java
assertEquals(1, items.size(), "Removing one matching item should leave the other items intact");
```

The better version explains what the value means. A future reader does not have to guess why `1` matters.

## Exercise

Given your `InventoryManagerTest.java` from Module 2:

**Part 1: Build a behavior inventory**

Create a file called `test-behavior-inventory.md` and add a table with at least five rows.

Use this structure:

```markdown
| Test name | Method under test | Condition | Expected behavior | What this does not prove |
|---|---|---|---|---|
| ... | ... | ... | ... | ... |
```

For each test, read the name, setup, action, and assertion. Fill in the table in your own words.

**Part 2: Find uncovered behavior**

List at least three behaviors of `InventoryManager` that are not covered by your tests.

Examples:

- What happens when an item name is blank?
- What happens when quantity is negative?
- What happens when `getLowStockItems` receives a threshold of `0`?
- What happens when two items have the same name with different casing?

Do not assume these behaviors are correct just because the code runs.

**Part 3: Improve test names**

Choose three test names and rewrite them so they communicate condition and result.

Use this format:

```markdown
| Original name | Improved name | Why the new name is clearer |
|---|---|---|
| testRemove | removeItemDeletesMatchingItemAndReturnsTrue | Names the method, condition, and result |
```

**Part 4: Add or draft one missing test**

Add one real test to your test file, or write clear pseudocode if your test setup is not running yet.

Your test should document one behavior that was missing from Part 2.

**Part 5: Update your reading log**

Add one paragraph to your Track 2 reading log:

- What did the tests teach you about intended behavior?
- What did the tests fail to tell you?
- Which behavior should be tested next, and why?

## Common pitfalls

| Pitfall | Why it hurts | Better move |
|---|---|---|
| Treating passing tests as proof the code is correct | Tests only prove the cases they cover | Ask what inputs, branches, and edge cases are missing |
| Reading only the test name | Test names can be vague or wrong | Read setup and assertions before trusting the name |
| Reading only the assertion | Assertions can hide important setup assumptions | Trace setup, action, and assertion together |
| Writing tests with names like `test1` | Future readers learn nothing from the name | Name the condition and expected result |
| Adding a test without explaining its purpose | The test may pass but still fail to document intent | Use a descriptive name and, when helpful, an assertion message |

## Spine prompts

### Testing maturity

What is the difference between a test that communicates intent and a test that just checks a value? Find one test in your suite that needs a better name and one that needs a better assertion message.

### Code reading

What did you learn about the original code by reading your own tests? Did any test reveal an assumption you made that turned out to be wrong?

### Discipline of Doubt

What behavior is your test suite definitely not covering? What would break in `InventoryManager` that your tests would not catch?

## Check for understanding

1. Why should you read tests before implementation when entering an unfamiliar codebase?
2. What does an assertion prove, and what does it not prove?
3. What is the difference between tested behavior and correct behavior?
4. Why is an uncovered behavior list useful before making changes?
5. What makes a test name useful to someone who did not write the test?

## Verification

Complete both the self-check and the artifact check before moving to Module 7.

### Self-check

Answer these in your own words:

- [ ] What is one behavior your tests cover well?
- [ ] What is one behavior your tests do not cover?
- [ ] Which test name did you improve, and why is the new name clearer?
- [ ] What is the difference between a test that passes and a test that documents intent?

### Artifact check

Your `test-behavior-inventory.md` should contain:

- [ ] A behavior inventory table with at least five rows
- [ ] At least three uncovered behaviors
- [ ] Three improved test names
- [ ] One added test or one clear pseudocode test
- [ ] A reading-log paragraph explaining what the tests did and did not tell you

### Gate readiness

You are ready for this part of the Track 2 gate when you can point to your tests and explain:

- what existing behavior they verify
- what behavior they leave uncertain
- why your added or drafted test belongs in the suite
- how reading tests changed your understanding of `InventoryManager`

## Next module

[Module 7 — Debugging Across Components](./07-debugging-across-components.md)
