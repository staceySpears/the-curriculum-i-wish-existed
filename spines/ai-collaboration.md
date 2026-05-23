# AI Collaboration

**Source of truth:** `AI_POLICY.md` at the curriculum root.

If this document and `AI_POLICY.md` ever conflict, `AI_POLICY.md` wins.

## Purpose

Use AI without outsourcing judgment.

This spine is not about avoiding AI. It is about building the judgment to use AI well: knowing when to reach for it, what to ask, how to verify the output, and how to stay in the driver's seat while using a powerful tool.

## How it grows

AI use changes across the curriculum by design.

Early tracks restrict AI so the learner builds their own substrate — the syntax, debugging instincts, code-reading habits, and mental models that make later AI use safe and productive.

Later tracks introduce AI gradually, expanding what is allowed as the learner has more to think with.

The spine evidence is not about whether AI was used. It is about whether the learner maintained ownership of the work.

## Track-by-track restrictions

### Tracks 0–2: No AI for curriculum work

**Stage:** No AI.

Do not use AI for any curriculum-related task in Tracks 0 through 2.

This includes: code generation, test writing, AI-assisted debugging, AI explanations of your specific solution, AI-written reflections, and AI-generated project structure.

**Exception:** AI may be used to troubleshoot environment setup if you have spent at least 15 minutes of documented independent troubleshooting first.

**Why:** These tracks teach the mental models that make later AI use safe. If AI removes every moment of confusion here, it removes the learning.

### Track 3: AI as explainer

**Stage:** AI as explainer.

**Restriction:** You may not ask AI to write code for you, fix your assignment, or debug your specific implementation. You may ask AI to explain an error category, a framework concept, or a general debugging approach. Generic examples are allowed. Assignment-specific implementation is not.

In bounds:
> Explain what a Spring `@RestController` annotation does and why it exists.

Out of bounds:
> Write me a `@RestController` for my user endpoint.

**Why:** The goal is to use AI to clarify the model, not to produce the work.

### Tracks 4–5: AI as scaffolding

**Stage:** AI as scaffolding.

AI may generate code, suggest implementations, propose tests, help debug, and give feedback.

Every line of generated code must be read, understood, tested, and defensible before it is committed.

Before committing AI-assisted code, ask:
> Could I rewrite this from scratch without AI right now?

If no, you need more time with the material.

For team learners, material AI-generated code must be flagged in pull request descriptions.

### Track 6: AI as study partner

**Stage:** AI as study partner.

AI may generate practice prompts, simulate interview follow-ups, critique behavioral stories, help revise resume bullets, ask system design questions, and give feedback on explanations.

Track 6 must also include AI-free practice. The interview room may not provide AI. Practice without it.

### Track 7 and Capstone: AI as professional collaborator

**Stage:** AI as professional collaborator.

Use AI the way working engineers do: to brainstorm, compare tradeoffs, draft documentation, generate test cases, inspect errors, explore APIs, and accelerate routine work.

The standard also rises. If AI introduces a bug, security issue, bad abstraction, hallucinated API, or weak test — you are responsible for catching it.

Professional AI use is supervised delegation, not passive acceptance.

## Core prompts

These prompts should appear in modules, gates, and reflections wherever AI use is relevant.

- Did I attempt this independently before reaching for AI?
- Can I explain what the AI produced, in my own words?
- Did I verify the output — run it, test it, check it against documentation?
- Could I proceed, modify, or debug this if the AI disappeared right now?
- Have I disclosed material AI assistance in my reflection?

## Red flags

These are signs AI is substituting for learning rather than supporting it:

- You cannot identify what you changed, accepted, or rejected from the AI output
- You cannot run or modify the work without asking AI to rewrite it
- You used AI where the track explicitly forbids it
- You submitted output you cannot explain
- Your reflection describes experience the AI invented

## Gate evidence

At each gate, the learner should be able to answer:

- Was AI used? If so, how?
- What did you verify, and how?
- What would you change or debug if the AI were unavailable?

If the learner cannot answer these questions, the gate should not pass.
