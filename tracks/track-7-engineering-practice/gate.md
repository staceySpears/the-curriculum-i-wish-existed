# Track 7 Gate — Engineering Practice

This gate verifies that you are ready to leave Track 7 and begin the Capstone.

The goal is to demonstrate that you can work on a real codebase like a professional engineer: reviewing, refactoring, testing, observing, and documenting with intent.

## Required artifact

Submit your Track 7 engineering practice project.

It should include:

- a code review with written, specific feedback on at least three points
- a safe refactor of one module with tests that still pass
- added logging to at least one function with a written explanation of what it tells you
- a documentation update: README, inline comments, or runbook entry
- a self-evaluation note
- an AI use disclosure if AI was used materially

## Correctness requirements

You must be able to:

- show that your refactor does not change observable behavior (tests pass before and after)
- demonstrate that your logging output is readable and useful
- show that your code review feedback is specific enough to act on
- run the updated code and show it behaves as expected

## Explanation requirements

You must explain:

- why you chose the refactoring approach you used
- what your logging tells you that it did not before
- what you would prioritize in another pass of code review
- how you would investigate a production failure in this system
- what tradeoff you made that you would reconsider given more information

## Debugging and revision evidence

Provide one debugging note from the track. Include:

- what failure or unexpected behavior you investigated
- what logs, tests, or tools you used to investigate
- what you found
- what you changed

## Spine evidence

### Debugging

Walk through your investigation note. What did you look at first? What confirmed or ruled out your hypothesis?

### Code reading

In your code review or refactor, describe a part of the codebase you had to understand before you could act on it. How did you build that understanding?

### Testing maturity

Show that your refactor is covered by tests. What do the tests prove? What would a test miss about the refactor?

### Discipline of Doubt

What assumption in the original code turned out to be brittle, wrong, or undocumented? How did you surface it?

### Technical communication

Show your documentation update. Can a future maintainer use it without asking you questions?

### Self-evaluation

What engineering habit improved the most during this track? What would you do differently on the next codebase you work on?

### AI collaboration

Was AI used as a professional collaborator during Track 7? Describe one instance where AI helped, one where you caught a mistake it made, and how you verified the final result.

## Outcome

### Pass

You can review, refactor, instrument, and document a real codebase with intent. Your work is safe, legible, and defensible.

### Revise

You are close, but must strengthen missing evidence: vague code review feedback, a refactor without test coverage, undocumented logging, or an incomplete investigation note.

### Repeat

You should revisit Track 7 if you cannot safely refactor without breaking behavior, cannot write actionable code review feedback, or cannot explain how you would investigate a failure in a system you did not write.
