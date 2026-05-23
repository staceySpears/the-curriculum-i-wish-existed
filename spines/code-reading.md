# Code Reading

Code reading is the practice of understanding existing code before changing it.

Most beginner curricula overtrain writing code from scratch. Real engineering often starts somewhere else: inside a codebase that already exists.

This spine teaches learners how to enter unfamiliar code without panic.

## Why this matters

A learner who can only write fresh code is fragile.

They may pass assignments but struggle with real projects, team work, open source, debugging, legacy systems, and job tasks.

Code reading is one of the main bridges from assignment completion to engineering practice.

## The code reading loop

### 1. Find the entry point

Where does execution begin?

This might be a `main` method, a route, a component, an event listener, a test, a script, or a configuration file.

### 2. Identify the claim

What is this code supposed to do?

Look for tests, README instructions, function names, API routes, UI labels, and examples.

### 3. Trace the flow

Follow data or control one step at a time.

Do not try to understand the whole codebase at once.

### 4. Mark the boundaries

Where does this code depend on something else?

Examples include files, databases, APIs, user input, environment variables, libraries, and framework conventions.

### 5. Make a small safe change

The first change should be small enough that you can predict the effect.

A safe change builds trust in your understanding.

## Track progression

### Track 0

Learners read tiny files and instructions carefully.

They practice noticing filenames, paths, extensions, command output, and where code lives.

### Track 1

Learners read short methods, tests, classes, and stack traces.

They trace variables and control flow before modifying code.

### Track 2

Code reading becomes central.

Learners work in existing codebases, identify responsibilities, trace behavior across files, and change code safely.

### Track 3

Learners read backend services.

They trace requests through controllers, services, repositories, models, database calls, and tests.

### Track 4

Learners read browser code.

They trace DOM selection, events, user input, fetch calls, and UI updates.

### Track 5

Learners read React code.

They trace props, state, effects, routes, components, hooks, and API boundaries.

### Track 6

Learners read interview prompts and existing snippets carefully.

They practice extracting requirements before coding.

### Track 7

Learners read professional artifacts.

They inspect PRs, documentation, CI files, issue threads, dependency configs, and unfamiliar repositories.

### Capstone

Learners read their own code like maintainers.

They should be able to return to old work and re-orient without starting over.

## Code reading prompts

- Where does this start?
- What is this code supposed to do?
- What test describes this behavior?
- What data enters here?
- What data leaves here?
- What does this depend on?
- What names reveal the author's intent?
- What is the smallest safe change I can make?

## Final standard

A learner practicing code reading should become comfortable saying:

> I do not understand all of it yet, but I know where to start tracing.

That is the skill.
