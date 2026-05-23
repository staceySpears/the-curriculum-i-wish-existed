# Module 4 — Loops

## Goal

Repeat code using `while`, `do-while`, and `for` loops.

## Prerequisites

- Module 3 complete

## Core concepts

### The `while` loop

Repeats as long as a condition is `true`:

```java
int count = 1;
while (count <= 5) {
    System.out.println("Count: " + count);
    count++;
}
```

### The `do-while` loop

Runs at least once before checking the condition:

```java
int count = 1;
do {
    System.out.println("Count: " + count);
    count++;
} while (count <= 5);
```

### The `for` loop

Combines initialization, condition, and update in one line:

```java
for (int count = 1; count <= 5; count++) {
    System.out.println("Count: " + count);
}
```

### Loop components

```
for (initialization; condition; update) {
    // body
}
```

| Component | When it runs |
|---|---|
| Initialization | Once, before the loop starts |
| Condition | Before each iteration; loop stops when `false` |
| Body | Each time the condition is `true` |
| Update | After each body execution |

### Common loop patterns

**Summing values:**

```java
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum = sum + i;
}
// sum = 55
```

**Counting occurrences:**

```java
String text = "hello world";
int count = 0;
for (int i = 0; i < text.length(); i++) {
    if (text.charAt(i) == 'l') {
        count++;
    }
}
// count = 3
```

**Finding first match:**

```java
int[] numbers = {10, 20, 30, 40, 50};
int target = 30;
int index = -1;
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        index = i;
        break;
    }
}
```

## Exercises

### Exercise 1: Countdown

Write a program that counts down from 10 to 1, then prints "Blast off!" Write three versions — one with `while`, one with `do-while`, one with `for`.

### Exercise 2: Sum of evens

Write a program that sums all even numbers between 1 and 100 and prints the result.

### Exercise 3: Factorial

Write a program that calculates `n!` (factorial). Factorial of 5 is 5 × 4 × 3 × 2 × 1 = 120. Handle invalid input (no negative numbers).

### Exercise 4: Guess the number

Write a program that:
1. Generates a random number between 1 and 100
2. Repeatedly asks the user to guess
3. Prints "Too high", "Too low", or "Correct!"
4. Counts how many guesses it took
5. Ends when the user guesses correctly

*Hint:* `int secret = (int)(Math.random() * 100) + 1;`

### Exercise 5: Pattern printing

Write programs that print these patterns using nested loops:

```
Pattern 1:   Pattern 2:   Pattern 3:
*            *            *
**           **           * *
***          ***          * * *
****         ****         * * * *
*****        *****        * * * * *
```

## Debugging practice

This loop is supposed to sum numbers 1 to 10, but it's wrong. Find the bug without running the code:

```java
int sum = 0;
int i = 1;
while (i <= 10) {
    sum = sum + i;
}
System.out.println("Sum: " + sum);
```

What is the bug? How would you spot it without running the program?

## Spine prompts

### Big-O and data structures

What is the time complexity of a loop that runs `n` times? What about a nested loop where both run `n` times?

### Discipline of Doubt

What happens if a loop condition never becomes `false`? How would you notice this in a running program? How would you stop it?

### Debugging

If a loop runs too many times, which variable would you inspect first? If it runs too few times?

### Testing maturity

How would you write tests for a method that contains a loop? What edge cases should you always include?

## Check for understanding

1. When would you use a `while` loop instead of a `for` loop?
2. What is an infinite loop? How do you prevent one?
3. What does `break` do inside a loop? What does `continue` do?
4. Write a loop that prints the first 10 powers of 2: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512.
5. What is the difference between `i++` and `++i` when used as a loop update?

## Next module

[Module 5 — Methods](./05-methods.md)
