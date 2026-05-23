# Testing Maturity

Testing maturity is the practice of using tests as more than a pass/fail checklist.

Tests are executable claims about behavior. They describe what the software should do, protect against regressions, and give the learner confidence to change code.

## Why this matters

Beginners often treat tests as an obstacle.

They ask:

> How do I make the tests pass?

That question is useful, but incomplete.

A stronger engineer also asks:

> What behavior do these tests describe?

> What behavior is missing?

> What change would make this safer to modify later?

## The testing maturity curve

### Manual checks

At the beginning, learners manually run code and observe behavior.

This builds the habit of checking reality.

### Provided tests

Next, learners run tests written by someone else.

They learn to interpret failures and connect tests to expected behavior.

### Learner-written tests

Then, learners write tests for their own code.

They learn to name expected behavior, edge cases, and failure cases.

### Regression tests

When a bug appears, learners add a test that would have caught it.

This turns debugging into future protection.

### Integration tests

As projects grow, learners test how pieces work together.

This is especially important for APIs, databases, frontend interactions, and full-stack flows.

### Tests as design feedback

Eventually, hard-to-test code becomes a signal.

If a function, component, or service is painful to test, the design may be doing too much.

## Track progression

### Track 0

Testing means verifying setup.

Can the learner run a command and confirm the expected output?

### Track 1

Learners run and write unit tests for Java fundamentals.

They connect test failures to control flow, state, and edge cases.

### Track 2

Learners use tests to understand existing behavior.

They add tests before or during changes to protect against regressions.

### Track 3

Learners test backend behavior.

They practice unit tests, integration tests, API checks, validation cases, and persistence behavior.

### Track 4

Learners test browser behavior manually and with lightweight automated checks where appropriate.

They verify forms, events, accessibility basics, and failure states.

### Track 5

Learners test React components and user flows.

They focus on behavior rather than implementation details.

### Track 6

Learners use tests and examples in interview practice.

They write edge cases before trusting a solution.

### Track 7

Learners connect tests to CI, refactoring, regression prevention, and maintainability.

### Capstone

Learners choose a practical test strategy.

They do not need to test everything, but they must defend what they tested and why.

## Testing prompts

- What behavior am I claiming?
- What is the simplest test for the happy path?
- What edge case matters most?
- What bug would I not want to come back?
- What would make this code easier to test?
- What should be tested manually?
- What should be automated?
- What test gives me the most confidence?

## Final standard

A learner practicing testing maturity should see tests as feedback, documentation, and protection.

Passing tests is not the end of thinking. It is part of the evidence.
