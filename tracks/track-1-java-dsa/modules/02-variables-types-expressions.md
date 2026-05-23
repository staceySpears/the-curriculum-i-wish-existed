# Module 2 — Variables, Types, and Expressions

## Goal

Declare variables, understand Java's primitive and reference types, and write basic expressions.

## Prerequisites

- Module 1 complete

## What this module covers

- Primitive types: `int`, `double`, `boolean`, `char`, `long`
- Reference types: `String` as an introduction
- Variable declaration and assignment
- Type conversion: widening, narrowing, and casting
- Arithmetic operators: `+`, `-`, `*`, `/`, `%`
- Integer division vs. floating-point division
- String concatenation with `+`
- Reading a value from the user with `Scanner`
- The `final` keyword for constants

## Common confusion

**Integer division:** `5 / 2` in Java is `2`, not `2.5`. At least one operand must be a `double` for decimal division: `5.0 / 2` gives `2.5`.

**String comparison:** Do not use `==` to compare strings. Use `.equals()`. This is explained fully in Module 6.

## Spine prompts

### Discipline of Doubt

What happens if you divide by zero? What happens for `int` vs. `double`?

### Debugging

When you see `incompatible types: possible lossy conversion from double to int`, what does that mean and how do you fix it?

### Technical communication

Explain the difference between a variable and a value to someone who has never programmed.

## Next module

[Module 3 — Conditionals](./03-conditionals.md)
