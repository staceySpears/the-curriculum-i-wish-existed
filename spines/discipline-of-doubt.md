# The Discipline of Doubt

The Discipline of Doubt is the practice of asking what could be wrong before the world proves it to you.

It is not pessimism. It is not anxiety. It is not being difficult.

It is one of the core habits of good engineering.

Software fails at boundaries: unusual input, missing data, slow networks, invalid state, unexpected users, unclear requirements, race conditions, deployment differences, and assumptions nobody noticed they were making.

The Discipline of Doubt teaches learners to look for those boundaries on purpose.

## Why this matters

Many beginners write code for the happy path.

They ask:

> What should happen when everything goes right?

Engineers also ask:

> What happens when something goes wrong?

That second question is not extra. It is the difference between code that works once and software that can be trusted.

The Discipline of Doubt helps learners avoid a common failure mode: building something that passes the obvious test but breaks as soon as the input, environment, or user behavior changes.

## Doubt is a skill

Some people are treated as naturally detail-oriented, naturally cautious, or naturally good at edge cases.

This curriculum does not assume that.

Doubt can be practiced.

A learner can build the habit of pausing before they submit work and asking:

- What inputs have I not tried?
- What assumptions am I making?
- What happens if this value is empty, null, missing, duplicated, too large, or in the wrong format?
- What happens if this request fails?
- What happens if this user does something unexpected?
- What happens if this code runs twice?
- What happens if another developer has to change this later?

The goal is not to imagine every possible failure. The goal is to stop assuming the happy path is enough.

## The basic doubt loop

Use this loop whenever you build, test, debug, or review code.

### 1. Name the claim

Start by identifying what the code claims to do.

Example:

> This method returns the total cost of the cart.

A vague claim is hard to test. A clear claim gives doubt something to inspect.

### 2. Find the assumptions

Ask what must be true for the claim to hold.

Example assumptions:

- the cart exists
- the cart has items
- each item has a valid price
- quantities are positive
- discounts have already been applied or intentionally excluded

Most bugs hide inside assumptions.

### 3. Test the boundaries

Boundaries are where behavior changes.

Common boundaries include:

- empty input
- one item
- many items
- duplicate items
- missing values
- invalid values
- maximum or minimum values
- permission changes
- failed network requests
- slow responses
- repeated actions

Boundary tests do not need to be fancy. They need to be intentional.

### 4. Explain the decision

After considering edge cases, explain what the code does and does not handle.

A mature answer is not always "I handled everything."

A mature answer may be:

> This handles empty carts and invalid quantities. It does not handle currency conversion yet because that is outside the current scope. If we add multiple currencies later, this function should change.

That is engineering judgment.

## Doubt by track

The Discipline of Doubt grows across the curriculum.

### Track 0

Doubt begins as environment sanity.

Learners ask:

- Did the command actually run?
- Am I in the right folder?
- Did I save the file?
- What does the error message literally say?
- What changed since it worked?

### Track 1

Doubt becomes input and control-flow awareness.

Learners ask:

- What happens with zero items?
- What happens with one item?
- What happens with repeated values?
- What happens when a condition is false?
- Does this loop stop?

### Track 2

Doubt becomes integration thinking.

Learners ask:

- What does this class assume about that class?
- What breaks if I change this method signature?
- What behavior is covered by tests?
- What behavior is only implied?
- What did the original author probably intend?

### Track 3

Doubt becomes boundary and failure thinking.

Learners ask:

- What happens with invalid input?
- What happens if the database is empty?
- What status code should this return?
- What should the client know?
- What should the client not know?
- What happens if authentication fails?

### Track 4

Doubt becomes user and browser thinking.

Learners ask:

- What happens if the user clicks twice?
- What happens if the form is incomplete?
- Can this be used with a keyboard?
- Does the page still make sense on a small screen?
- What happens if the API call fails?

### Track 5

Doubt becomes state and component thinking.

Learners ask:

- Where does this state live?
- What happens when state updates out of order?
- What happens while data is loading?
- What happens when data is missing?
- Which component owns this behavior?

### Track 6

Doubt becomes interview and design thinking.

Learners ask:

- What constraints matter?
- What scale changes the design?
- What tradeoff am I making?
- What edge case would an interviewer expect me to mention?
- What claim does my behavioral story prove?

### Track 7

Doubt becomes operational thinking.

Learners ask:

- How would I know this failed?
- What logs would help?
- What would a future maintainer need?
- What dependency or environment assumption exists here?
- What risk did this refactor introduce?

### Capstone

Doubt becomes ownership.

Learners ask:

- What is the smallest version that proves the idea?
- What is most likely to break in front of a user?
- What feedback did I ignore at first?
- What would I improve with another month?
- What tradeoffs can I defend?

## Doubt in code review

In code review, doubt should be expressed as care, not attack.

Weak review comment:

> This is wrong.

Better review comment:

> What should happen if `items` is empty here? I do not see a test for that case yet.

Weak review comment:

> Bad design.

Better review comment:

> I am wondering whether this class now has two responsibilities: validation and persistence. Would it be clearer to separate those?

The goal is to make the work stronger without making the person smaller.

## Doubt and confidence

Doubt is not the opposite of confidence.

In engineering, confidence often comes from doubt handled well.

You trust the code more because you questioned it, tested it, revised it, and can explain what it does at the boundaries.

A learner practicing the Discipline of Doubt should become less panicked over time, not more.

The point is not to fear every possible bug.

The point is to build a repeatable way to look for them.

## Reflection prompts

Use these prompts at the end of projects and gates.

- What assumption did I discover late?
- What edge case changed my implementation?
- What bug taught me the most?
- What did I decide not to handle yet?
- What would break if the input doubled, disappeared, or changed shape?
- What would a future maintainer need to know?
- What test gives me the most confidence?
- What still feels fragile?

## Final standard

A learner practicing the Discipline of Doubt does not need to predict every failure.

They should be able to notice assumptions, test boundaries, explain tradeoffs, and revise their work when reality disagrees with the happy path.

That is the habit.
