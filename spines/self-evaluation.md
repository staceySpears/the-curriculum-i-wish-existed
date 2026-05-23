# Self-Evaluation

Self-evaluation is the practice of judging your own work honestly before someone else has to.

It is not self-criticism for its own sake. It is not pretending the work is perfect. It is not spiraling forever because something could always be better.

It is the professional habit of asking:

> What evidence do I have that this is ready?

## Why this matters

A learner who can only improve when someone else gives feedback is fragile.

Solo learners may not always have reviewers. Team learners may receive uneven review. Working engineers are expected to notice issues, improve work, and communicate tradeoffs before code reaches production.

Self-evaluation teaches that judgment directly.

## The readiness distinction

Self-evaluation depends on distinguishing readiness from perfection.

Perfect means no flaw can be imagined.

Ready means the work meets the standard for this stage, the tradeoffs are understood, and the remaining weaknesses are named honestly.

The curriculum does not require perfection. It requires readiness.

## The basic self-evaluation loop

### 1. Check the claim

What does this work claim to do?

If the claim is vague, the evaluation will be vague.

### 2. Check the evidence

What proves the claim?

Evidence may include tests, manual checks, a walkthrough, review, screenshots, logs, deployment, or a working demo.

### 3. Name the fragile parts

What still feels weak, confusing, risky, or under-tested?

Naming fragility is a strength. Hidden fragility is the problem.

### 4. Decide revise or move on

If the fragile part blocks the track goal, revise.

If the fragile part is real but outside the current scope, document it and move on.

## Good self-evaluation answers

Weak answer:

> Everything works.

Better answer:

> The core flow works and is covered by tests for valid input and empty input. I am less confident about duplicate entries because I only tested that manually. If I had more time, I would add a regression test for that case.

Weak answer:

> I need to get better at JavaScript.

Better answer:

> I understand event listeners and DOM selection, but I am still shaky on where state should live. In the next module, I want to practice tracing state changes before writing code.

Specific evaluation leads to useful action.

## Track progression

### Track 0

Learners evaluate setup readiness.

Can they reproduce the setup? Can they explain what broke? Can they recover from common environment mistakes?

### Track 1

Learners evaluate correctness and understanding.

Can they explain control flow, state, test failures, and simple data structure choices?

### Track 2

Learners evaluate integration.

Can they explain how a change moves through existing code? Can they identify what they still do not understand?

### Track 3

Learners evaluate backend behavior.

Can they explain request flow, database state, validation, errors, and tests?

### Track 4

Learners evaluate user-facing behavior.

Can they test interactions, accessibility basics, layout, and failure states?

### Track 5

Learners evaluate component decisions.

Can they explain state ownership, props, effects, routing, and API boundaries?

### Track 6

Learners evaluate readiness for interviews.

Can they perform without notes or AI? Can they tell project stories with specific evidence?

### Track 7

Learners evaluate maintainability.

Can future maintainers understand the work? Are docs, commits, tests, and operational clues strong enough?

### Capstone

Learners evaluate ownership.

Can they defend the scope, tradeoffs, deployment, tests, and next steps?

## Reflection prompts

- What works?
- What evidence proves it works?
- What is still fragile?
- What did I debug or revise?
- What tradeoff did I make?
- What would I improve with more time?
- What standard am I using to call this ready?
- What should a reviewer look at first?

## Final standard

A learner practicing self-evaluation should become more honest and less helpless.

They should know when to revise, when to ask for review, when to move on, and how to explain the evidence behind that decision.
