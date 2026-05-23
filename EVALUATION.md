# Evaluation

This curriculum is built around evidence.

Finishing a module is not the same thing as understanding it. Watching a video is not the same thing as being able to build. Passing one test is not the same thing as being ready for the next level of complexity.

Evaluation exists to make progress inspectable.

The goal is not to make learning punitive. The goal is to prevent false confidence, hidden gaps, and the common bootcamp failure mode where a learner completes assignments but cannot explain, extend, debug, or defend what they built.

## Evaluation model

Evaluation happens across four required layers, plus an optional fifth.

1. Automated checks
2. Self-evaluation
3. External benchmarks
4. Peer or mentor review
5. Industry validation, optional but recommended

Each layer catches a different kind of gap.

Automated checks verify whether the code behaves correctly.

Self-evaluation verifies whether the learner can judge their own work honestly.

External benchmarks verify whether progress means something outside this repository.

Peer or mentor review verifies whether another human can understand, critique, and trust the work.

Industry validation verifies whether the work can survive contact with the larger software engineering world.

## What evaluation is not

Evaluation is not just grades.

Evaluation is not a certificate.

Evaluation is not a promise of employment.

Evaluation is not meant to shame the learner for struggling.

Evaluation is a feedback system. It tells the learner what is solid, what is fragile, what needs another pass, and what evidence they can point to when they claim readiness.

## Layer 1: Automated checks

Automated checks are the first layer of evaluation.

These include unit tests, integration tests, linting, formatting checks, build checks, type checks where relevant, and any scripts that verify the project behaves as expected.

Automated checks answer a basic question:

> Does the work do what it claims to do?

They do not answer every question. Passing tests does not prove the design is good, the code is readable, the edge cases are complete, or the learner understands the solution. But failing tests usually means the learner is not done.

## Expectations for automated checks

When a module or project includes tests, the learner must be able to:

- run the tests locally
- understand what the tests are checking
- explain at least one failure when a test breaks
- fix failing tests without deleting or weakening them
- add new tests when asked
- distinguish between a broken implementation and a broken test

In early tracks, tests may be provided.

In later tracks, the learner is expected to write more of the test suite themselves.

By the end of the curriculum, testing should feel less like compliance and more like engineering feedback.

## Layer 2: Self-evaluation

Self-evaluation is not optional.

A learner who cannot evaluate their own work is dependent on external approval and vulnerable to false confidence. This curriculum teaches self-evaluation as a professional skill.

Self-evaluation answers the question:

> Can I honestly judge the quality of my own work?

Each project should include a rubric. The learner should complete the rubric before seeking review or moving to the next track.

A good self-evaluation should name:

- what works
- what is fragile
- what was confusing
- what tradeoffs were made
- what edge cases were considered
- what should be improved later
- what evidence proves readiness

The goal is not to perform confidence. The goal is to develop judgment.

## Layer 3: External benchmarks

External benchmarks keep the curriculum grounded.

A learner can feel like they are progressing inside a closed environment while still being unprepared for public standards. External benchmarks reduce that risk.

External benchmarks may include:

- deployed applications
- public GitHub repositories
- readable commit history
- LeetCode or similar DSA milestones
- mock interview scores or feedback
- API documentation
- technical writing
- open source pull requests
- real users or testers

External benchmarks answer the question:

> Does this progress mean something outside the curriculum?

Not every benchmark must be public, especially for learners with privacy or safety concerns. But the evidence should be concrete enough that someone else could inspect it.

## Layer 4: Peer or mentor review

Human review catches what automated checks cannot.

A reviewer can notice unclear naming, brittle design, weak explanations, missing edge cases, overcomplication, underdocumentation, and collaboration issues.

Peer or mentor review answers the question:

> Can another human understand, critique, and trust this work?

Review should focus on the work, not the worth of the learner.

Good review should include:

- one specific thing that works well
- one specific concern or improvement
- questions about tradeoffs
- attention to readability and maintainability
- attention to tests and edge cases
- attention to whether the learner can explain the work

Review is not a performance. It is a professional feedback loop.

## Layer 5: Industry validation

Industry validation is optional but recommended.

This layer asks whether the learner's work can survive contact with people outside the curriculum.

Examples include:

- contributing to open source
- publishing a technical article
- presenting a project walkthrough
- completing a mock interview with an engineer
- getting feedback from real users
- filing or fixing issues in public repositories
- participating in a community code review

Industry validation answers the question:

> Can this work hold up in the larger engineering world?

This layer is optional because not every learner has the same access, safety, time, or confidence. But when possible, it is valuable.

## Track Gates

Every track ends with a Track Gate.

A Track Gate is the point where the learner stops and proves they are ready to move forward.

A gate should include evidence from multiple evaluation layers. A learner should not pass a gate simply because they reached the end of the files.

A strong gate usually includes:

- working code
- passing tests or checks
- a project artifact
- a written explanation
- a self-evaluation rubric
- evidence of debugging or revision
- a benchmark or external proof point
- review where possible

The gate answers four questions:

1. Can the learner do the work?
2. Can the learner explain the work?
3. Can the learner debug or revise the work?
4. Can the learner carry the skill into a less familiar context?

If the answer to any of those questions is no, the learner should revisit the track before moving on.

## Project evaluation

Projects are evaluated differently from small exercises.

An exercise usually checks a narrow skill. A project checks integration.

A project should be evaluated for:

- correctness
- readability
- maintainability
- testing
- edge-case handling
- debugging evidence
- documentation
- user experience where relevant
- accessibility where relevant
- security where relevant
- deployment or runtime behavior where relevant
- ability to explain tradeoffs

A project is not complete just because it runs once.

A project is complete when the learner can explain what it does, why it was built that way, how it was tested, what could break, and what they would improve next.

## Spine evaluation

Data structures and algorithms are evaluated continuously.

The goal is not to grind problems mindlessly. The goal is to build reliable problem-solving habits.

Spine evaluation should check whether the learner can:

- restate the problem clearly
- identify inputs and outputs
- reason about constraints
- choose an appropriate data structure
- explain time and space complexity
- test edge cases
- compare brute force and optimized approaches
- communicate while solving
- recognize patterns across problems

A correct answer with no explanation is not enough.

An imperfect solution with clear reasoning may still be useful evidence, but the learner should continue until both reasoning and implementation improve.

## Behavioral evaluation

Behavioral preparation is evaluated through evidence, not vibes.

The learner should collect stories throughout the curriculum instead of inventing them at the end.

A strong behavioral story should include:

- a real project or collaboration context
- a specific problem
- the learner's responsibility
- the action they took
- the tradeoff or conflict involved
- the result
- what they learned

The curriculum uses STAR-style storytelling, but the point is not to memorize a format. The point is to turn real experience into clear professional communication.

Behavioral evaluation should check whether the learner can discuss:

- ownership
- debugging under uncertainty
- collaboration
- conflict
- feedback
- learning from mistakes
- tradeoffs
- ambiguity
- persistence
- communication

## Portfolio evaluation

A portfolio is not just a pile of projects.

A portfolio should make the learner's growth and readiness legible.

Portfolio evaluation should check whether each featured project has:

- a clear README
- a clear problem statement
- setup instructions
- screenshots or demo links where relevant
- tests or quality checks where relevant
- explanation of technical choices
- known limitations
- evidence of iteration
- a reason it belongs in the portfolio

A good portfolio helps a reviewer understand not only what the learner built, but how they think.

## Evaluation for solo learners

Solo learners need extra structure because they do not automatically receive team feedback.

Solo learners should:

- use rubrics before marking work complete
- record short walkthroughs of projects
- compare work against public examples
- seek outside review when possible
- use tests and benchmarks aggressively
- write reflections after projects
- maintain visible commit history
- periodically revisit older work and improve it

When no human reviewer is available, solo learners should simulate review by reading their own work from the perspective of a future maintainer.

The question is:

> If someone else inherited this tomorrow, would they understand it?

## Evaluation for team learners

Team learners have more built-in feedback, but also more ways to hide.

A team project can pass while one person does most of the work. A team can look productive while avoiding conflict. A team can ship software while failing to share knowledge.

Team learners should evaluate both the code and the collaboration.

Team evaluation should include:

- code review participation
- pairing rotation
- issue ownership
- commit distribution
- retrospective notes
- charter revisions
- conflict handling
- evidence that knowledge was shared rather than hoarded

A healthy team gate proves both that the project works and that the team operated in a way that helped its members grow.

## Final standard

The final standard of this curriculum is not perfection.

The standard is credible readiness.

A learner who completes the curriculum should be able to:

- build and debug full-stack software
- read and modify unfamiliar code
- write tests and use them as feedback
- reason about data structures and algorithms
- explain technical tradeoffs
- collaborate through code review and planning
- use modern tools without being dependent on magic
- use AI responsibly without outsourcing judgment
- present their work clearly
- enter serious software engineering interviews with real evidence behind them

That is what evaluation is for.
