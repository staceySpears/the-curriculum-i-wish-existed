# Module 8 — Explaining Tradeoffs

## Goal

Write decision notes that explain what you chose, what you did not choose, and why.

## Prerequisites

- Module 7 complete

## What this module covers

- What a tradeoff is: what you gain and what you give up
- Why engineering decisions need explanations, not just outcomes
- The decision note format: context, options considered, choice made, why
- When to write a decision note (and when not to)
- How to explain a design choice to a reviewer who wasn't there
- Practicing technical communication as a professional habit

## Why this matters

In software, the code shows what was chosen. It rarely shows what was considered and rejected, and it almost never shows why.

A learner who can write a clear decision note can:
- explain tradeoffs in interviews
- communicate with teammates who inherit their code
- reason about design rather than just copy patterns

## The decision note format

```markdown
## Decision: [short title]

**Context:** What problem were you solving? What constraints existed?

**Options considered:**
- Option A: [what it is] — [what you gain] — [what you give up]
- Option B: [what it is] — [what you gain] — [what you give up]

**Choice:** [which option you chose]

**Reason:** [why this option fit better for this problem]

**Tradeoff accepted:** [what you gave up and why it was acceptable]
```

## Exercise

Write two decision notes based on your work with `InventoryManager`:

**Decision note 1:** Your choice of how to handle the `removeItem` bug (string comparison). Why `.equals()` and not `==`? What would a design look like where this class of bug couldn't occur?

**Decision note 2:** The `getLowStockItems` threshold boundary (`<` vs. `<=`). Why did you choose the behavior you chose? What would the alternative mean for a caller?

## Spine prompts

### Technical communication

Read your decision notes out loud as if explaining them to a teammate. Are they clear enough that the teammate could understand the tradeoff without asking follow-up questions?

### Self-evaluation

Which of your decisions in this track are you least confident about? Write a note that names the uncertainty honestly, rather than pretending you know the right answer.

### Code reading

Find one place in `InventoryManager` where the original author made a decision you disagree with. Write a decision note explaining what you would have done differently and why.

## Check for understanding

1. What is the difference between a comment that explains what code does and a decision note that explains why a choice was made?
2. When is it acceptable to make a tradeoff that weakens one property of a system to strengthen another?
3. How would you explain to an interviewer that your implementation is not perfect, but it was the right choice given the constraints?

## What comes next

Track 2 is complete when you pass the Track 2 gate.

See [`../gate.md`](../gate.md) for gate requirements.
