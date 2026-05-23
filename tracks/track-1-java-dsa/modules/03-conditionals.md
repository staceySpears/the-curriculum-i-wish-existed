# Module 3 — Conditionals

## Goal

Make decisions in code using `if`, `else if`, `else`, and `switch` statements.

## Prerequisites

- Modules 1 and 2 complete

## Core concepts

### The `if` statement

An `if` statement runs a block of code only when a condition is `true`:

```java
int age = 18;

if (age >= 18) {
    System.out.println("You can vote.");
}
```

### `if-else`

Add an `else` block for when the condition is `false`:

```java
int age = 16;

if (age >= 18) {
    System.out.println("You can vote.");
} else {
    System.out.println("You cannot vote yet.");
}
```

### `if-else if-else`

Chain multiple conditions:

```java
int score = 85;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}
```

### Comparison operators

| Operator | Meaning | Example |
|---|---|---|
| `==` | Equal to | `if (x == 5)` |
| `!=` | Not equal to | `if (x != 5)` |
| `>` | Greater than | `if (x > 5)` |
| `<` | Less than | `if (x < 5)` |
| `>=` | Greater than or equal | `if (x >= 5)` |
| `<=` | Less than or equal | `if (x <= 5)` |

### Logical operators

Combine conditions with `&&` (AND), `||` (OR), and `!` (NOT):

```java
int age = 20;
boolean hasLicense = true;

if (age >= 18 && hasLicense) {
    System.out.println("You can drive.");
}

if (age < 18 || !hasLicense) {
    System.out.println("You cannot drive.");
}
```

### The `switch` statement

Use `switch` when comparing one variable against many specific values:

```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    default:
        dayName = "Unknown";
        break;
}
```

## Common pitfalls

| Pitfall | Why it's wrong | Fix |
|---|---|---|
| Using `=` instead of `==` | `=` is assignment, not comparison | Use `==` for equality |
| Forgetting `break` in `switch` | Execution "falls through" to next case | Add `break` after each case |
| Empty `if` body with semicolon | `if (x > 5);` ends the statement immediately | Remove the semicolon |
| Overly complex conditions | Hard to read and debug | Use boolean variables to name conditions |

## Exercises

### Exercise 1: Grade calculator

Write a program that:
1. Takes an integer score (0–100) as input
2. Prints the letter grade using this scale:
   - 90–100: A
   - 80–89: B
   - 70–79: C
   - 60–69: D
   - Below 60: F
3. Also prints "Pass" for D or above, "Fail" for F

### Exercise 2: Leap year

Write a program that determines if a year is a leap year.

A year is a leap year if:
- It is divisible by 4, AND
- If divisible by 100, it must also be divisible by 400

Examples:
- 2020: leap year (divisible by 4, not by 100)
- 1900: not a leap year (divisible by 100 but not 400)
- 2000: leap year (divisible by 400)

Test with: 2020, 2021, 1900, 2000.

### Exercise 3: Number classifier

Write a program that takes an integer and prints:
- "Positive", "Negative", or "Zero"
- "Even" or "Odd" (for non-zero numbers only)
- "Multiple of 5" if applicable

Example output for `15`: "Positive, Odd, Multiple of 5"

### Exercise 4: Days in month

Write a program using `switch` that takes a month number (1–12) and prints the number of days in that month. Assume February has 28 days.

### Exercise 5: Debug these conditionals

Find and fix the bugs:

```java
public class ConditionalsBuggy {
    public static void main(String[] args) {
        int x = 10;

        if (x = 5) {
            System.out.println("x is 5");
        }

        int score = 75;
        if (score >= 70)
            System.out.println("Passing");
            System.out.println("Good job!");

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
        }
    }
}
```

## Spine prompts

### Discipline of Doubt

What inputs could break your grade calculator? Consider negative numbers, numbers above 100, and boundary values like exactly 90, 80, 70, 60.

### Debugging

When your leap year logic fails for 1900, how will you trace the problem? Which intermediate value would you print to diagnose it?

### Testing maturity

For the leap year exercise, list the test cases you would need to verify all branches of your logic.

### Technical communication

Write a comment explaining the leap year rule in plain English, as if explaining it to someone encountering it for the first time.

## Check for understanding

1. What is the difference between `=` and `==`?
2. What does `&&` do? What does `||` do?
3. Why does `switch` need `break`?
4. What happens if you put a semicolon after an `if` condition?
5. Write an expression that is `true` only if `age` is between 18 and 65 inclusive.

## Next module

[Module 4 — Loops](./04-loops.md)
