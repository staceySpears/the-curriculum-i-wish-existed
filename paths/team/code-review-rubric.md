# Code Review Rubric

Code review is one of the most important practices in the team path.

The goal is not to catch people doing something wrong. The goal is to improve the work and spread understanding.

## Review priorities

Review in this order:

1. Correctness
2. Clarity
3. Tests and edge cases
4. Maintainability
5. Style and polish

Do not spend all your review energy on tiny style comments while ignoring behavior, design, or missing tests.

## Correctness

Ask:

- Does this do what the task claims?
- Is the main behavior covered by tests or checks?
- Are errors handled appropriately for this stage?
- Does this introduce a regression?

## Clarity

Ask:

- Can I understand the flow?
- Are names meaningful?
- Is the code organized around responsibilities?
- Would a future teammate know where to make a change?

## Tests and edge cases

Ask:

- What behavior is tested?
- What important behavior is untested?
- What edge cases matter here?
- Did a bug fix include a regression test where appropriate?

## Maintainability

Ask:

- Is this more complex than needed?
- Is the responsibility in the right place?
- Does this duplicate logic unnecessarily?
- Is the tradeoff explained if the choice is not obvious?

## Communication

A good review comment is specific and kind.

Weak:

> This is confusing.

Better:

> I had trouble following the state change here. Could we rename this variable or split the condition so the two cases are clearer?

Weak:

> Add tests.

Better:

> Could you add a test for the empty input case? That seems like the easiest place for this function to break.

## Review checklist

Before approving, ask:

- Can I explain what changed?
- Do I understand why it changed?
- Did I look at tests or checks?
- Did I leave questions where I was confused?
- Is this safe enough to merge for the current stage?

## Author checklist

Before requesting review, ask:

- Did I run the checks?
- Did I explain the change in the PR description?
- Did I flag any AI assistance required by the policy?
- Did I note anything I especially want reviewed?
- Did I keep the change small enough to review?
