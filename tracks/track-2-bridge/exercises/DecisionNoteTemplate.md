# Decision Note Template

Use this template whenever you make a design or implementation decision during Track 2 work. A decision note is not a summary of what you did — it is a record of what you chose and why you chose it over the alternatives.

You will write at least two decision notes as part of Module 8. You may write more throughout the track. The habit is the point.

---

## When to write one

Write a decision note when:
- you had more than one way to fix a bug and chose one
- you made a boundary decision (which class owns this behavior?)
- you wrote a test that could have been written differently
- you changed behavior and had to decide which behavior was "correct"
- you are unsure whether your choice was right

Do not write a decision note for trivial changes where there was only one sensible option.

---

## Template

Copy this section for each decision.

---

### Decision: [short title — name the choice, not the outcome]

**Context:**
What was the situation? What problem were you solving? What constraints existed (language, existing code, test coverage)?

**Options considered:**

| Option | What it does | What you gain | What you give up |
|--------|-------------|---------------|------------------|
| Option A | | | |
| Option B | | | |

**Choice:** [which option you chose]

**Reason:** Why did this option fit better for this specific situation?

**Tradeoff accepted:** What did you give up by choosing this option, and why was that acceptable here?

**Future reconsideration:** Under what circumstances would you revisit this decision?

---

## Example: removeItem string comparison

### Decision: Use .equals() instead of == for string comparison in removeItem

**Context:**
`removeItem` compared item names using `==`. The test I wrote in Module 2 was failing for inputs that looked identical but were different String objects. I needed to decide how to fix it.

**Options considered:**

| Option | What it does | What you gain | What you give up |
|--------|-------------|---------------|------------------|
| Use `.equals()` | Compares string content | Correct behavior for all string inputs | Nothing in this case |
| Use `==` intentionally | Compares references only | Works when the same object is passed in | Breaks whenever caller constructs a new String |

**Choice:** Use `.equals()`

**Reason:** Java String equality by content is almost always what callers expect. No caller should need to know whether the inventory stores references or values.

**Tradeoff accepted:** None — `==` was simply wrong for this use case. Both correctness and caller expectation point to `.equals()`.

**Future reconsideration:** If `InventoryManager` were used in a performance-critical hot path with interned strings, `==` might be acceptable. Not applicable here.

---

## Your decisions

Write your decision notes below. Label each one with the bug or choice it documents.

<!-- Decision 1 -->

<!-- Decision 2 -->
