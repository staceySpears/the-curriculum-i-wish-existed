# AI Policy

AI is part of modern software engineering.

It is also one of the easiest ways to skip learning and become fragile.

This curriculum uses AI deliberately. The goal is not to ban AI forever, and it is not to let AI do the learning for you. The goal is to build judgment: when to use AI, when not to use it, how to verify its output, and how to stay sharp while using powerful tools.

## Core principle

You may not outsource understanding.

If you use AI, you are still responsible for the code, the explanation, the tradeoffs, the tests, the bugs, and the consequences.

If you cannot explain what AI produced, you cannot submit it as your own work.

## Why this policy exists

A learner can use AI to move through material faster than they understand it.

That feels like progress at first. Later, it creates collapse. The learner cannot debug, cannot explain the code, cannot modify it safely, cannot pass interviews without assistance, and cannot tell whether the AI output is wrong.

This curriculum is designed to prevent that failure mode.

AI is introduced in stages so that the learner first builds the substrate: syntax, debugging, code reading, tests, data structures, system reasoning, and self-evaluation.

## The primary guardrail: gate design

This curriculum does not rely only on honor-system prohibition.

Honor-based policies that rely on prohibition alone fail under pressure. Learners may use AI, rationalize it, feel guilty, and still fail to build the understanding they need. That is not the outcome this curriculum wants.

The primary guardrail is design.

Gates are built to reward genuine understanding and expose substitution. If a learner uses AI to produce work they cannot explain, trace, debug, revise, or defend, the work will fail at the gate.

A learner who has not done the thinking will struggle to answer questions like:

- Why did you choose this data structure?
- What broke while you were building this?
- How did you find the bug?
- What tradeoff did this design make?
- What would you change if the requirements shifted?
- Can you modify this without AI right now?

This is intentional.

The goal is not to catch learners. The goal is to make genuine understanding the easiest path through the curriculum.

## The defensibility rule

At every stage of the curriculum, including the capstone, submitted work must be defensible in conversation.

This fails the rule:

> I got this from AI and it seems to work.

This passes the rule:

> I got this from AI, read it, understood it, verified it, tested the edge case I care about, and can explain the tradeoff it makes.

The defensibility rule does not prohibit AI use. It prohibits opaque AI use.

Every line of code you submit must be line-by-line defensible at the level appropriate for the track. You do not need to be able to explain every compiler implementation detail or framework internals, but you do need to explain the code you committed, the choices you made, and the behavior your work depends on.

## Stage-specific AI boundaries

AI use changes across the curriculum.

The stages below are deliberately concrete. If a track or module gives stricter instructions, the stricter instruction wins.

| Stage | Tracks | AI status | Purpose |
|---|---|---|---|
| Stage 0 | Tracks 0 through 2 | No AI for curriculum work | Build the learner's own substrate before assistance |
| Stage 1 | Track 3 | AI as explainer | Clarify concepts and errors without generating implementation |
| Stage 2 | Tracks 4 and 5 | AI as scaffolding | Support implementation while requiring full ownership |
| Stage 3 | Track 6 | AI as study partner | Practice interviews, stories, resumes, and system design with AI-free reps too |
| Stage 4 | Track 7 and Capstone | AI as professional collaborator | Use AI as a real engineering tool while maintaining judgment |

## Stage 0: Tracks 0 through 2 — No AI for curriculum work

In Tracks 0 through 2, do not use AI for curriculum-related tasks.

That means no AI-generated code, no AI-written tests, no AI debugging of your assignment, no AI explanations of your specific solution, no AI-written reflections, and no AI-generated project structure.

Permitted resources include:

- official documentation
- curriculum materials
- man pages and tool help output
- human-written web resources
- Stack Overflow or similar human-written Q&A
- the community space
- a human peer, mentor, or instructor if available
- your own notes

The reason is not purity. The reason is substrate.

Tracks 0 through 2 teach the mental models that make later AI use safe: how code runs, how files and tools fit together, how to debug, how to read code, how tests work, and how isolated concepts become systems.

If AI removes every moment of confusion here, it may also remove the learning.

## Stage 1: Track 3 — AI as explainer

In Track 3, AI may be used to explain concepts, errors, documentation, or framework behavior.

AI may not write implementation code for curriculum projects, generate routes or controllers, design your API, write your tests, or review your work for correctness.

In bounds:

> Explain what a Spring `@RestController` annotation does and why it exists.

Out of bounds:

> Write me a `@RestController` for a user endpoint.

The goal is to use AI to clarify the model, not to produce the work.

## Stage 2: Tracks 4 and 5 — AI as scaffolding

In Tracks 4 and 5, AI may generate code, suggest implementations, propose tests, help debug, and give feedback.

Every line of generated code must be read, understood, tested, and defensible before it is committed.

Before committing AI-assisted code, ask:

> Could I rewrite this from scratch without AI right now?

If the answer is no, you need more time with the material before moving on.

Large AI-generated dumps should be avoided. If AI helps produce code, break the work into small inspectable changes so you can understand and own each piece.

For team learners, material AI-generated code must be flagged in pull request descriptions.

## Stage 3: Track 6 — AI as study partner

In Track 6, AI is actively useful as a study partner.

AI may be used to:

- generate practice prompts
- simulate interview follow-ups
- critique behavioral stories
- help revise resume bullets
- ask system design questions
- create DSA review plans
- give feedback on explanations

But Track 6 must also include AI-free practice.

Coding interviews, system design explanations, and behavioral stories must be practiced without AI assistance because the interview room may not provide it.

AI can help you prepare. It cannot be the thing you depend on to perform.

## Stage 4: Track 7 and Capstone — AI as professional collaborator

In Track 7 and the Capstone, AI may be used as a professional collaborator.

At this stage, learners should practice using AI the way working engineers increasingly do: to brainstorm, compare tradeoffs, draft documentation, generate test cases, inspect errors, explore APIs, improve scripts, and accelerate routine work.

The standard also rises.

If AI introduces a bug, security issue, bad abstraction, hallucinated API, weak test, or misleading explanation, the learner is responsible for catching it.

Professional AI use is not passive acceptance. It is supervised delegation.

## Required guardrails

These guardrails apply whenever AI use is allowed.

### Attempt first

AI should enter after you have something to think with.

Before asking AI for help, make an independent attempt.

For coding work, that means:

- reading the instructions
- writing or tracing code yourself
- running the code
- reading the error message
- forming at least one hypothesis

For DSA work, that means:

- restating the problem
- identifying inputs and outputs
- writing a brute-force idea
- naming at least one edge case
- identifying where you are stuck

The attempt does not have to be perfect. It just has to be real.

### Ask for hints before solutions

When you are stuck, ask for hints before solutions.

Good AI help should preserve your role as the thinker.

Prefer prompts like:

- What questions should I ask myself here?
- What edge cases should I consider?
- Can you give me a hint without solving it?
- What is one possible reason this error appears?
- What should I inspect next?

Avoid prompts like:

- Solve this.
- Write the whole project.
- Fix my code.
- Give me the final answer.

### Treat AI output as untrusted

AI output is not evidence.

If AI suggests code, commands, explanations, tests, architecture, or debugging steps, you must verify the output before relying on it.

Verification may include:

- running the code
- running the tests
- checking official documentation
- inspecting the diff
- adding an edge-case test
- explaining the result in your own words

If you cannot verify it, do not submit it.

### No black-box submissions

You may not submit AI-generated work you cannot explain.

Before submitting AI-assisted work, you should be able to explain what each major part does, why the approach works, what tradeoffs were made, what edge cases matter, and how you would debug or modify the work later.

If you need AI to explain your own submission back to you, you are not done.

### Disclose material assistance

When AI materially assists a project, gate, reflection, or portfolio artifact, disclose that assistance in the project reflection.

Material assistance includes:

- generating a significant code section
- helping resolve a major bug
- producing a test strategy
- drafting substantial documentation
- shaping architecture or design decisions

Disclosure is not punishment. It is an ownership record.

### Preserve AI-free practice

Some work must be done without AI because the skill being trained requires unaided recall, reasoning, or communication.

AI-free practice is required for foundational coding, selected DSA work, mock interviews, system design practice, and any track gate that explicitly restricts AI.

You should be able to think, debug, and explain without AI in the room.

### Respect track restrictions

If a track or module says AI is restricted, that restriction overrides your judgment in the moment.

Do not decide that a restricted task is basically allowed because you are tired, frustrated, behind, or anxious. The restriction is part of the learning design.

## AI and DSA

AI can be especially harmful in DSA if used too early.

The value of DSA practice is not the final answer. The value is the reasoning: restating the problem, identifying constraints, choosing a data structure, testing edge cases, comparing approaches, and communicating tradeoffs.

For DSA practice after AI use is allowed:

- attempt the problem first without AI
- write down your brute-force idea
- identify where you are stuck
- ask AI for a hint, not a solution
- after solving, ask for critique or alternative approaches
- re-solve similar problems without AI

If AI gives you the solution before you struggle, you did not get the main benefit of the problem.

## AI and debugging

AI can help with debugging, but it can also train bad habits.

Before asking AI for help, do the basic debugging work:

- reproduce the bug
- read the error message
- identify what changed
- inspect the relevant code
- add a log, breakpoint, or test
- form a hypothesis

Then ask AI a specific question.

Bad prompt:

> Fix my code.

Better prompt:

> I expected this method to return an empty list for invalid input, but this test throws a null pointer exception. Here is the method and the test. What hypotheses should I check first?

The goal is to use AI to sharpen investigation, not replace it.

## AI and writing

AI may be used to improve writing when the stage allows it, but it should not erase the learner's actual experience.

For READMEs, reflections, behavioral stories, and technical articles, AI can help with structure, clarity, grammar, and alternate phrasings.

The facts must remain yours.

Do not let AI invent experience, exaggerate impact, fabricate metrics, or turn uncertainty into false confidence.

## AI disclosure

For ordinary professional use, you do not need to cite every small AI interaction.

For curriculum work, you should disclose material AI assistance in reflections when it affects the artifact being evaluated.

Material assistance includes:

- generating a significant code section
- helping resolve a major bug
- producing a test strategy
- drafting substantial documentation
- shaping architecture or design decisions

The purpose of disclosure is not punishment. It is to preserve honest evidence of learning and ownership.

## AI misuse

AI misuse includes:

- submitting AI-generated work you cannot explain
- using AI where the track explicitly forbids it
- asking AI to complete an assignment, gate, or project for you
- weakening tests so AI-generated code passes
- fabricating reflections, metrics, experience, benchmarks, or project impact
- using AI during AI-free interview practice
- accepting AI output without running, reading, or verifying it

If AI misuse happens, the fix is not shame. The fix is to redo the work honestly, document what happened, and rebuild the missing understanding.

## The ownership test

Before submitting AI-assisted work, ask:

- Can I explain every line that matters?
- Can I run and interpret the tests?
- Can I debug this if it breaks tomorrow?
- Can I describe the tradeoffs?
- Can I modify it without asking AI to rewrite it?
- Can I reproduce the core idea without AI?

If the answer is no, you are not done.

## Final standard

By the end of the curriculum, the learner should be able to use AI well without being dependent on it.

That means using AI to move faster, think more clearly, explore options, and improve quality, while still maintaining technical judgment.

AI should make you more capable.

It should not make your work impossible to defend without it.
