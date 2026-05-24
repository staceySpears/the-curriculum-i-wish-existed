# Module 8 — Explaining Tradeoffs

## Goal

Write decision notes that explain what you chose, what you did not choose, and why.

## Prerequisites

- Module 7 complete
- Your Track 2 reading log available
- Your `test-behavior-inventory.md` and `debugging-note.md` available

## What this module covers

- What a tradeoff is: what you gain and what you give up
- Why engineering decisions need explanations, not just outcomes
- The decision note format: context, options considered, choice made, why
- When to write a decision note and when not to
- How to explain a design choice to a reviewer who was not there
- Practicing technical communication as a professional habit

## Why this matters

In software, the code shows what was chosen. It rarely shows what was considered and rejected, and it almost never shows why.

A learner who can write a clear decision note can:

- explain tradeoffs in interviews
- communicate with teammates who inherit their code
- reason about design rather than just copy patterns

## What a tradeoff is

A tradeoff is not just a downside. A tradeoff is the cost you knowingly accept to gain something else.

Examples:

| Choice | What you gain | What you give up |
|---|---|---|
| Keep a small fix inside an existing method | Minimal change, lower immediate risk | The method may stay harder to read |
| Extract helper methods | Clearer responsibilities, easier testing | More files or methods to understand |
| Use `.equals()` for string comparison | Correct value comparison | Requires remembering null-safety concerns |
| Treat low stock as `< threshold` | Only items strictly below the threshold are flagged | Items exactly at the threshold are excluded |
| Treat low stock as `<= threshold` | Items at the threshold are flagged earlier | Caller may see more items than expected |

A decision note should make that exchange visible.

## When to write a decision note

Write a decision note when:

- there were multiple reasonable options
- the choice affects future behavior
- a reviewer might ask "why this way?"
- the code alone does not explain the reasoning
- the decision changes a boundary, test expectation, or public behavior

Do not write a decision note for every small line edit. If the reason is obvious from the code and there was no meaningful alternative, a note is probably noise.

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

**Impact:** What should future readers know because of this choice?
```

## Example decision note

```markdown
## Decision: Compare item names with `.equals()`

**Context:** `removeItem` needs to remove the item whose name matches the caller's input. The original code used `==`, which compares whether two string references are the same object, not whether their text is equal.

**Options considered:**
- Keep `==` — smallest possible edit — preserves a bug for many real string inputs
- Use `.equals()` — compares text values correctly — requires thinking about null input
- Normalize all item names into a separate identifier type — prevents more name bugs — too large for this track's safe-change goal

**Choice:** Use `.equals()` for the comparison.

**Reason:** The method's current responsibility is to remove by matching item name text. `.equals()` matches that responsibility with the smallest safe change.

**Tradeoff accepted:** This does not fully solve null or normalization problems. That is acceptable because the current change is scoped to fixing value comparison without redesigning item identity.

**Impact:** Future validation work should decide how blank, null, or differently-cased names should behave.
```

Notice what the note does not do. It does not pretend the chosen option is perfect. It names the remaining weakness honestly.

## Exercise

Create a file called `decision-notes.md` and write two decision notes based on your work with `InventoryManager`.

**Decision note 1:** Your choice of how to handle the `removeItem` bug.

Questions to answer:

- Why `.equals()` and not `==`?
- What problem does this fix?
- What problem does it not fix?
- What would a larger design look like where this class of bug could not occur?

**Decision note 2:** The `getLowStockItems` threshold boundary.

Questions to answer:

- Did you choose `< threshold` or `<= threshold`?
- What does your choice mean for a caller?
- What would the alternative mean?
- What test should document this boundary?

**Optional decision note 3:** Your choice about responsibility boundaries from Module 5.

Questions to answer:

- Should `InventoryManager` keep display/output behavior?
- Should output move to a separate class?
- What do you gain or lose either way?

## Common pitfalls

| Pitfall | Why it hurts | Better move |
|---|---|---|
| Only describing the final choice | The reader cannot see what was considered | Include at least two options |
| Pretending there was no downside | Every meaningful decision has a cost | Name the tradeoff directly |
| Writing vague reasons like "better" | The note does not teach future readers anything | Explain better for what: safety, clarity, performance, scope, testability |
| Documenting trivial choices | Too many notes make important decisions harder to find | Save notes for choices with real alternatives |
| Using the note to defend sloppy work | A tradeoff is not an excuse for avoidable bugs | Make the safest reasonable choice, then document the cost |

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
4. Why should a decision note include rejected options?
5. What is the difference between documenting a tradeoff and making an excuse?

## Verification

Complete both the self-check and the artifact check before attempting the Track 2 gate.

### Self-check

Answer these in your own words:

- [ ] What decision did you make that had more than one reasonable option?
- [ ] What did your chosen option improve?
- [ ] What did your chosen option leave unresolved?
- [ ] What evidence from code or tests supports your choice?
- [ ] What would make you revisit this decision later?

### Artifact check

Your `decision-notes.md` should contain:

- [ ] Two decision notes using the decision note format
- [ ] At least two options considered in each note
- [ ] A clear choice and reason in each note
- [ ] A tradeoff accepted in each note
- [ ] An impact statement explaining what future readers should know

### Gate readiness

You are ready for the Track 2 gate when you can show:

- a reading log that explains the codebase
- tests or test notes that explain expected behavior
- a debugging note that traces symptom to cause
- decision notes that explain tradeoffs honestly
- a modified codebase you can defend without relying on memory

## What comes next

Track 2 is complete when you pass the Track 2 gate.

See [`../gate.md`](../gate.md) for gate requirements.
