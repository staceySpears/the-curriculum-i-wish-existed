# Module 7 — Debugging Across Components

## Goal

Investigate failures that span multiple files, classes, or methods without losing your place.

## Prerequisites

- Module 6 complete

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

## Exercise

Introduce a controlled bug into your fixed `InventoryManager`:

1. Change `getTotalValue` to not multiply by quantity (revert to the buggy version)
2. Write a short program that uses `InventoryManager` and calls `getTotalValue` indirectly through another method you write
3. Observe the wrong output from the outer method
4. Practice tracing backward to the root cause without looking at the code you changed
5. Document your investigation: what you observed, what you suspected, what you checked, what you found

This simulates real debugging where you see a symptom far from its cause.

## Spine prompts

### Debugging

Walk through your investigation using the debugging loop: what did you observe, what hypothesis did you form, what did you check, and what confirmed or denied the hypothesis?

### Code reading

When you traced the bug backward, at what point did you narrow down the component? What clue told you the problem was in `getTotalValue` and not in your outer method?

### Discipline of Doubt

What assumptions did you make at the start of the investigation that turned out to be wrong?

## Next module

[Module 8 — Explaining Tradeoffs](./08-explaining-tradeoffs.md)
