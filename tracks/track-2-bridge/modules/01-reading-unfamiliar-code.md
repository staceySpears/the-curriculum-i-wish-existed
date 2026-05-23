# Module 1 — Reading Unfamiliar Code

## Goal

Learn strategies for entering a codebase you did not write and understanding what it does before changing anything.

## Prerequisites

- Track 1 complete

## The problem

Most beginners are trained to write fresh code from scratch. Real engineering often starts with:

> Here is a repo. Understand it. Fix it. Don't break it.

This module teaches the skill of reading before changing.

## Reading strategy

### Step 1: Find the entry point

For a library or class like `InventoryManager`, there is no `main` method. Instead, ask:

- What is the public API? Which methods are callable from outside?
- What would a caller need to know to use this class?
- What does the constructor do?

### Step 2: Read the tests (if they exist)

If there are no tests, that is information. It means either:
- The code is untested and fragile
- You need to add tests before changing anything

### Step 3: Trace one feature at a time

Pick one method. Trace it line by line:
- What does it assume about its inputs?
- What happens at each branch?
- What could go wrong?
- Does it modify shared state?

### Step 4: Identify design smells

Look for:
- Duplicated logic
- Methods that do too much
- Inconsistent naming
- Side effects where you don't expect them
- Missing null handling
- Off-by-one boundaries

### Step 5: Document what you learn

Before you change anything, write down:
- What you believe each method does
- What assumptions it makes
- What bugs you suspect
- What tests you would need to write

## Exercise: Read `InventoryManager`

Open `legacy-codebase/InventoryManager.java`. Do not change the code yet.

Answer these questions in writing:

**1. API identification**

List all public methods. For each, describe what it claims to do based on its name and comments.

**2. Bug hunting (without running)**

Find at least four bugs by reading only. For each bug:
- Which method contains it?
- What line is the problem on?
- What input would trigger it?
- What should the correct behavior be?

**3. Assumptions**

What does this code assume about:
- Names: null? empty? duplicates?
- Prices: negative? zero?
- Quantities: negative? very large?

**4. Design problems**

Name three design issues that make this code fragile or hard to maintain. Be specific about which method or line you are referring to.

**5. Test plan**

Before you add any tests, write a list of test cases you would need in order to safely modify this code. Include at least one case per public method.

## Spine prompts

### Code reading

What was the hardest method to understand? What strategy helped you finally figure it out?

### Discipline of Doubt

What assumptions does `removeItem` make that could fail? What happens if you remove an item while iterating over the list?

### Debugging

If `getTotalValue` returns a wrong number, which line would you inspect first? Why?

### Testing maturity

If you added tests now and they passed, would that mean the code is correct? Why or why not?

## Check for understanding

1. Why is reading unfamiliar code harder than writing new code for most beginners?
2. What should you do before making any change to an unfamiliar codebase?
3. What is the difference between reading for understanding and reading for debugging?

## Next module

[Module 2 — Adding Tests Before Changing Code](./02-adding-tests-before-changing.md)
