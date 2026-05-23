# Debugging

Debugging is the practice of investigating failure without guessing randomly.

It is not a mysterious talent. It is a loop: reproduce, observe, hypothesize, test, and revise.

This spine teaches learners to stay oriented when something breaks.

## Why this matters

Many learners experience bugs as proof that they are bad at programming.

That is false.

Bugs are normal. The skill is learning how to investigate them.

A learner who can debug becomes more independent, more confident, and more useful in real engineering contexts.

## The debugging loop

### 1. Reproduce

Can you make the problem happen again?

If you cannot reproduce it, write down what you know and narrow the conditions.

### 2. Observe

What actually happened?

Read the error message. Look at the output. Inspect the state. Check the logs. Run the failing test.

Do not skip observation because you feel rushed.

### 3. Hypothesize

What might explain the behavior?

A hypothesis should be specific enough to test.

Weak hypothesis:

> It is broken.

Better hypothesis:

> This list is empty when the method expects at least one item.

### 4. Test

Change one thing or inspect one thing to check the hypothesis.

Avoid changing five things at once. If the problem disappears, you will not know which change mattered.

### 5. Revise

If the hypothesis was wrong, update your model and try again.

Wrong guesses are not wasted if they make the problem smaller.

## Track progression

### Track 0

Debugging starts with environment sanity.

Learners check folders, paths, saved files, installed tools, command output, and what changed since the last working state.

### Track 1

Debugging focuses on syntax, control flow, state, tests, and stack traces.

Learners practice reading errors literally and tracing values through code.

### Track 2

Debugging becomes codebase investigation.

Learners trace behavior across files, compare tests to implementation, and identify where assumptions cross class boundaries.

### Track 3

Debugging expands to services.

Learners investigate requests, responses, status codes, database state, configuration, logs, and integration tests.

### Track 4

Debugging moves into the browser.

Learners use dev tools, console output, DOM inspection, network tabs, event tracing, and responsive layout checks.

### Track 5

Debugging includes React behavior.

Learners investigate state updates, effects, props, rendering, routing, API calls, and component boundaries.

### Track 6

Debugging becomes interview communication.

Learners practice narrating confusion, testing assumptions, correcting course, and explaining failed approaches.

### Track 7

Debugging becomes operational.

Learners investigate CI failures, dependency issues, logs, deployment differences, environment variables, and production-style symptoms.

### Capstone

Debugging becomes ownership.

Learners keep a debugging log for meaningful bugs and show how investigation changed the project.

## Debugging prompts

- Can I reproduce the problem?
- What did I expect?
- What actually happened?
- What changed since it worked?
- What is the smallest failing case?
- What error message or log is most relevant?
- What hypothesis am I testing?
- What did this failed attempt teach me?

## Final standard

A learner practicing debugging should not become bug-free.

They should become less random.

They should be able to investigate failure with a repeatable process and explain what they learned from the investigation.
