# Spines

Spines are the disciplines that run through the whole curriculum.

A track teaches a stage of software engineering. A spine teaches a habit that should keep showing up no matter what stage the learner is in.

Spines exist because many important engineering skills are not learned in one module. They are built through repetition: seeing the same kind of question, decision, doubt, or tradeoff in different contexts until it becomes part of how the learner works.

## Why spines exist

A learner can finish a topic and still miss the deeper habit underneath it.

They can learn arrays without learning why data structure choice matters.

They can pass tests without learning how to design or trust tests.

They can finish projects without learning to evaluate their own work honestly.

They can write code from scratch without learning to read code that already exists.

They can use AI without learning how to preserve judgment.

Spines prevent those habits from being treated as optional side effects.

## The core spines

Round 1 uses eight core spines.

This is intentionally more than a small slogan list. The curriculum is designed to repair fragmented, assignment-shaped learning, and that requires making the hidden engineering muscles visible.

### Big-O and why this data structure

This spine teaches learners to choose tools by cost and fit, not habit.

The goal is not to memorize complexity tables. The goal is to build a practical instinct for questions like:

- What operation happens most often?
- What grows as the input grows?
- What tradeoff am I making between speed, memory, readability, and simplicity?
- Why does this data structure fit this problem better than another one?

See `big-o-and-data-structures.md`.

### The Discipline of Doubt

This spine teaches edge-case thinking as a skill.

It trains learners to ask what could break, what assumptions are hidden, what inputs have not been considered, and how a system behaves at its boundaries.

Doubt is not negativity. It is care.

See `discipline-of-doubt.md`.

### Debugging

This spine teaches learners how to investigate failure without guessing randomly.

Debugging begins with environment sanity in Track 0 and grows into stack traces, tests, browser tools, logs, CI failures, deployment issues, and operational investigation.

See `debugging.md`.

### Code reading

This spine teaches learners to understand before changing.

Real engineering often begins inside code someone else wrote. Learners need to practice finding entry points, tracing data flow, reading tests, identifying responsibilities, and making small safe changes.

See `code-reading.md`.

### Testing maturity

This spine teaches learners that tests are executable claims about behavior.

Testing starts as a way to check simple code and matures into a design tool, a regression shield, documentation, and confidence for refactoring and deployment.

See `testing-maturity.md`.

### Self-evaluation

This spine teaches learners to judge their own work honestly.

A learner who can only improve when someone else gives feedback is fragile. Self-evaluation builds the habit of using rubrics, tests, reflections, and project evidence to identify what is solid and what needs another pass.

See `self-evaluation.md`.

### Technical communication

This spine teaches learners to make their work legible to other humans.

Engineering includes READMEs, commit messages, PR descriptions, code review comments, design notes, walkthroughs, behavioral stories, and project presentations.

See `technical-communication.md`.

### AI collaboration

This spine teaches learners how to use AI without outsourcing judgment.

AI use changes across the curriculum. Early tracks restrict it so the learner builds their own substrate. Later tracks use it as an explainer, scaffolder, study partner, and professional collaborator.

See `../AI_POLICY.md`.

## Supporting themes

Some important skills do not become full Round 1 spines yet, but they should still appear where relevant.

These include:

- accessibility
- security and privacy
- operational thinking
- product thinking
- professional workflow
- career evidence

Future rounds may promote some of these into full spine docs if they need repeated attention across many tracks.

## How spines appear in modules

Spines should show up in modules, exercises, projects, gates, and reflections.

A module may teach a concrete topic, but the spine questions should keep returning.

A lightweight module section can look like this:

```markdown
## Spine prompts

### Big-O / data structure
[One question about cost, fit, or tradeoff.]

### Discipline of Doubt
[One question about edge cases, assumptions, or failure modes.]

### Debugging
[One question about how to investigate when this breaks.]

### Code reading
[One prompt for tracing or understanding existing code.]

### Testing maturity
[One prompt about what behavior should be proven.]

### Self-evaluation
[One prompt for judging your own work.]

### Technical communication
[One prompt for explaining the work to another human.]

### AI collaboration
[Track-appropriate AI reminder.]
```

The point is not to make every lesson heavy. The point is to keep the important habits visible.

## How spines appear in gates

Every gate should include spine evidence.

A learner should be able to show:

- why a data structure or design choice made sense
- what edge cases or failure modes they considered
- how they investigated at least one problem
- how they read or reasoned about existing code where relevant
- what tests or checks support the behavior
- how they evaluated their own work
- how they explained the work to another human or future maintainer
- whether AI was used, and if so, how they maintained ownership

If the learner cannot answer these questions, they may have completed the artifact without building the habit.

## Adding future spines

A spine should be created only when a habit needs repeated attention across many tracks.

Not every important topic needs to become a spine. Some belong inside a specific track. Others belong as project requirements or gate criteria.

The test is simple:

> Does this habit need to show up again and again until it becomes part of how the learner works?

If yes, it may deserve a spine.
