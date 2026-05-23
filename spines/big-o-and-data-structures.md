# Big-O and Why This Data Structure

This spine teaches learners to choose tools by cost and fit, not habit.

Data structures and algorithms are not interview trivia. They are part of everyday engineering judgment. Every time code stores, searches, sorts, filters, groups, or retrieves data, the learner is making a choice about cost and behavior.

The goal is not to memorize complexity tables in isolation. The goal is to build the habit of asking:

> What does this choice make easy, and what does it make expensive?

## Why this matters

Beginners often choose the first structure that works.

That is normal at first, but it becomes fragile. A solution that works for five items may fail for five million. A structure that is easy to append to may be slow to search. A structure that is fast for lookup may not preserve order.

This spine teaches learners to connect data structure choice to the actual shape of the problem.

## The basic decision loop

Use this loop whenever choosing a structure or algorithm.

### 1. Name the operations

Ask what the code needs to do most often.

Examples:

- add items
- remove items
- check whether something exists
- preserve order
- count frequencies
- find a minimum or maximum
- process first-in-first-out
- process last-in-first-out
- connect relationships

### 2. Name what grows

Ask what gets larger as input grows.

Examples:

- number of users
- number of items in a cart
- number of requests
- number of DOM nodes
- number of database rows
- number of graph nodes or edges

### 3. Compare the fit

Ask which structure makes the common operation cheap enough while keeping the code understandable.

The best choice is not always the theoretically fastest one. Simplicity matters. Readability matters. Scope matters.

### 4. Explain the tradeoff

A learner should be able to say:

> I used a map because I needed fast lookup by ID. A list would preserve order but would require scanning for each lookup. If order mattered later, I would need to preserve it separately or use a different structure.

That explanation is the skill.

## Track progression

### Track 0

No formal Big-O yet.

Learners build the habit of sequence, input, output, and state.

### Track 1

Learners meet arrays, lists, maps, sets, stacks, queues, and basic complexity language.

They should be able to explain simple costs like constant time, linear time, and nested-loop behavior.

### Track 2

Learners connect structures to existing code.

They should ask why a previous author chose a list, map, or set, and what would break if the choice changed.

### Track 3

Learners connect data structures to APIs, databases, and request handling.

They should understand that some lookup and filtering work belongs in memory, while some belongs in the database.

### Track 4

Learners connect data structures to browser behavior.

They should reason about arrays of UI data, lookup maps, filtering, sorting, and state derived from user input.

### Track 5

Learners connect structures to React state.

They should understand how normalized state, lists, keys, filtering, and memoization affect frontend behavior and performance.

### Track 6

Learners prepare for interviews.

They should identify common patterns, compare brute force and optimized approaches, and explain time and space complexity out loud.

### Track 7

Learners connect algorithmic choices to maintainability, observability, and operational cost.

They should be able to notice when a slow loop, repeated network call, or inefficient query is creating real-world friction.

### Capstone

Learners defend their choices in context.

They should explain where performance mattered, where simplicity mattered more, and what they would change if the project scaled.

## Reflection prompts

- What operation happens most often here?
- What grows as the input grows?
- Why did I choose this structure?
- What would be slower with a different structure?
- What would be simpler with a different structure?
- What tradeoff did I accept?
- What would change if the input were ten times larger?

## Final standard

The learner does not need to over-optimize everything.

They should be able to make a reasonable choice, explain its cost, and recognize when the choice would stop fitting the problem.
