# Track 2 Gate — The Bridge

This gate verifies that you are ready to leave Track 2 and begin building backend systems in Track 3.

The goal is not to have written a lot of code. The goal is to have read a lot of code — and to be able to explain, modify, and debug a codebase you did not write.

## Required artifact

Submit your Track 2 project: the modified and documented codebase.

It should include:

- the original codebase with your safe changes applied
- at least one new or modified test
- a README explaining what the codebase does, what you changed, and why
- a code reading log: entry points, data flow, responsibilities of each major file
- a test behavior inventory explaining what the tests do and do not prove
- a debugging note from at least one investigation during the track
- at least two decision notes explaining tradeoffs you made or inherited

## Correctness requirements

You must be able to:

- run the code and show that existing tests still pass
- demonstrate your change works as intended
- point to the exact location of your change and explain why it belongs there
- show which test or test note documents the intended behavior

## Explanation requirements

You must explain:

- what the codebase does at a high level
- where the entry point is and how execution flows from there
- what your change does and how you decided where to make it
- what the existing tests verify
- what the existing tests do not cover
- what would break if a specific method were removed or changed
- what tradeoff you accepted in at least one decision

## Debugging and revision evidence

Provide one debugging note from an investigation during this track. Include:

- what you were trying to understand or fix
- what you looked at first
- how you traced the execution
- what you discovered
- what you changed or concluded

## Decision evidence

Provide at least two decision notes from your Track 2 work. Each note should include:

- the context for the decision
- at least two options considered
- the option you chose
- why you chose it
- the tradeoff you accepted
- the impact future readers should understand

## Spine evidence

### Code reading

Walk through one non-trivial file. Explain: what is its responsibility, what does it depend on, and what depends on it?

### Debugging

Describe one moment where something did not work as you expected while modifying the codebase. How did you trace it?

### Discipline of Doubt

What assumption did you make about the existing code that turned out to be wrong or incomplete?

### Testing maturity

What do the existing tests tell you about the expected behavior? What do they not cover?

### Self-evaluation

What part of this codebase still feels unclear? What would you do next to understand it better?

### Technical communication

Show your README and decision notes. Can a reader understand what the codebase does, what you changed, why you changed it, and what tradeoffs you accepted without asking you?

### AI collaboration

Confirm that no AI was used for Track 2 curriculum work.

## Outcome

### Pass

You can read, explain, modify, test, and document an unfamiliar codebase. Your changes are safe and your tradeoffs are honest.

### Revise

You are close, but must strengthen missing evidence: unexplained code, missing tracing, absent test, incomplete reading log, or unclear decision notes.

### Repeat

You should revisit Track 2 if you cannot explain what unfamiliar code does, cannot identify where a change belongs, cannot safely modify existing behavior, or cannot explain the tradeoffs behind your changes.
