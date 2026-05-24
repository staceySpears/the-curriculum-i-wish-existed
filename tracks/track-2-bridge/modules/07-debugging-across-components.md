# Module 7 — Debugging Across Components

## Goal

Investigate failures that span multiple files, classes, or methods without losing your place.

## Prerequisites

- Module 6 complete
- Your fixed `InventoryManager` available
- Your call-chain and test-reading notes available

## What this module covers

- The debugging loop applied to multi-file systems: reproduce, observe, hypothesize, test, revise
- Reading a stack trace from bottom to top and top to bottom
- Identifying the real origin of an error vs. where it surfaces
- Using print statements and a debugger to trace state across boundaries
- Narrowing down which component introduced a bad value
- The difference between a symptom and a cause
- Writing a debugging note that documents the investigation

## Core challenge

A bug in a multi-component system shows up in one place but originates in another. The skill is knowing how to trace backward from where the error appears to where the problem actually lives.

The place where you notice a failure is the symptom. The place where the wrong value first becomes wrong is the cause.

Those are often not the same place.

## The debugging loop

Use the same loop every time, even when the bug looks obvious.

1. **Reproduce.** Make the failure happen on purpose.
2. **Observe.** Write down what happened, including exact output or error text.
3. **Hypothesize.** Name one possible cause. Do not name five.
4. **Test.** Check that hypothesis with the smallest observation you can make.
5. **Revise.** Keep, change, or reject the hypothesis based on evidence.

A debugging loop is not a ritual. It is protection against guessing.

## Reading a stack trace

A stack trace shows the path execution took before a failure.

Read it two ways.

**Top to bottom:** where the program finally failed.

**Bottom to top:** how the program got there.

The top line often tells you the error type. The lower lines often tell you who called the failing method.

Example shape:

```text
Exception in thread "main" java.lang.NullPointerException
    at track2.legacy.InventoryManager.getTotalValue(InventoryManager.java:42)
    at track2.legacy.InventoryReport.printSummary(InventoryReport.java:17)
    at track2.legacy.Main.main(Main.java:8)
```

This does not mean `main` is broken. It means `main` called `printSummary`, which called `getTotalValue`, where the failure surfaced.

## Tracing state across boundaries

When a value crosses a method boundary, write it down.

Use this format:

```markdown
| Step | Location | Value entering | Value leaving | Notes |
|---|---|---|---|---|
| 1 | `main` | item: widget, quantity: 3, price: 10.00 | calls `addItem` | setup |
| 2 | `addItem` | widget / 3 / 10.00 | returns `true` | inventory changed |
| 3 | `printInventoryValue` | inventory has widget x3 | calls `getTotalValue` | symptom appears here |
| 4 | `getTotalValue` | widget x3 at 10.00 | returns 10.00 | cause: quantity ignored |
```

This table prevents you from losing the thread when several methods are involved.

## Exercise

Introduce a controlled bug into your fixed `InventoryManager`:

1. Change `getTotalValue` to not multiply by quantity. Revert it to the buggy version that adds only price.
2. Write a short program that uses `InventoryManager` and calls `getTotalValue` indirectly through another method you write.
3. Observe the wrong output from the outer method.
4. Practice tracing backward to the root cause without looking at the line you changed.
5. Document your investigation: what you observed, what you suspected, what you checked, and what you found.

This simulates real debugging where you see a symptom far from its cause.

### Suggested wrapper

If you need a simple outer method, use this shape:

```java
public class InventoryDebugDemo {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addItem("widget", 3, 10.00);
        printInventoryValue(manager);
    }

    static void printInventoryValue(InventoryManager manager) {
        double total = manager.getTotalValue();
        System.out.println("Inventory value: " + total);
    }
}
```

If `getTotalValue` ignores quantity, the symptom appears in `printInventoryValue`, but the cause lives in `getTotalValue`.

## Debugging note format

Create a file called `debugging-note.md` and use this structure:

```markdown
# Debugging Note: Incorrect inventory value

## Reproduction

What command or program did you run? What output did you see?

## Expected behavior

What should have happened?

## Actual behavior

What happened instead?

## First hypothesis

What did you think was wrong first?

## Trace

| Step | Location | Value entering | Value leaving | Notes |
|---|---|---|---|---|
| ... | ... | ... | ... | ... |

## Evidence

What observation confirmed or rejected your hypothesis?

## Root cause

Where did the value first become wrong?

## Fix or conclusion

What did you change, or what would you change?
```

The note should be specific enough that another learner could follow your investigation without watching you debug live.

## Common pitfalls

| Pitfall | Why it hurts | Better move |
|---|---|---|
| Fixing the place where the symptom appears | The wrong value may have arrived from somewhere else | Trace backward to where the value first becomes wrong |
| Changing multiple things at once | You cannot tell which change mattered | Test one hypothesis at a time |
| Skipping reproduction | You may chase a bug you cannot reliably observe | Make the failure happen on purpose first |
| Ignoring exact output | Paraphrased errors hide useful clues | Copy the exact output or stack trace into your note |
| Trusting memory instead of notes | Multi-step investigations get blurry | Keep a trace table as you go |

## Spine prompts

### Debugging

Walk through your investigation using the debugging loop: what did you observe, what hypothesis did you form, what did you check, and what confirmed or denied the hypothesis?

### Code reading

When you traced the bug backward, at what point did you narrow down the component? What clue told you the problem was in `getTotalValue` and not in your outer method?

### Discipline of Doubt

What assumptions did you make at the start of the investigation that turned out to be wrong?

## Check for understanding

1. What is the difference between a symptom and a cause?
2. Why should you reproduce a bug before trying to fix it?
3. When reading a stack trace, what does the top usually tell you? What do the lower frames tell you?
4. Why is changing one thing at a time important during debugging?
5. How does a trace table help when a bug crosses method boundaries?

## Verification

Complete both the self-check and the artifact check before moving to Module 8.

### Self-check

Answer these in your own words:

- [ ] Where did the incorrect value first appear?
- [ ] Where did the value first become wrong?
- [ ] What was your first hypothesis?
- [ ] What evidence confirmed or rejected it?
- [ ] What would have made this bug easier to find?

### Artifact check

Your `debugging-note.md` should contain:

- [ ] Exact reproduction steps
- [ ] Expected behavior and actual behavior
- [ ] At least one explicit hypothesis
- [ ] A trace table showing the value across at least three locations
- [ ] A root-cause statement naming the method where the value first became wrong
- [ ] A fix or conclusion

### Gate readiness

You are ready for this part of the Track 2 gate when you can explain:

- how you traced the bug backward from symptom to cause
- why the outer method was not the real source of the bug
- what evidence led you to the root cause
- what your debugging note proves about your process

## Next module

[Module 8 — Explaining Tradeoffs](./08-explaining-tradeoffs.md)
