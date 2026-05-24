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

## When to use which loop

The indexed `for` loop is the foundation — you need to understand how indices work. But in everyday coding, when you don't need the index, the **enhanced for-each loop** is clearer and less error-prone:

```java
// Indexed — use when you need i
for (int i = 0; i < items.length; i++) {
    System.out.println(i + ": " + items[i]);
}

// For-each — use when you only need the value
for (String item : items) {
    System.out.println(item);
}
```

You will see for-each used throughout Modules 6 and 8. Both styles are worth knowing — indexed loops are still the right choice when you need the position.

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

## Verification

Complete both the self-check and the runnable check before moving to Module 05.

### Self-check (reflective)

Answer these in your own words:

- [ ] What are the three parts of a `for` loop?
- [ ] When would a `while` loop be a better choice than a `for` loop?
- [ ] Why does a loop need some way to move toward stopping?
- [ ] What is an off-by-one error?
- [ ] What does `break` do inside a loop?

### Runnable check (external)

Create a file called `Loops.java`:

```bash
cat > Loops.java <<'EOF'
public class Loops {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        System.out.println("Sum 1 to 5: " + sum);

        int count = 3;
        while (count > 0) {
            System.out.println("Countdown: " + count);
            count--;
        }

        int[] numbers = {4, 7, 10, 13, 16};
        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Even count: " + evenCount);

        int target = 13;
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("Target index: " + foundIndex);
    }
}
EOF
```

Compile and run:

```bash
javac Loops.java
java Loops
```

Expected output:

```text
Sum 1 to 5: 15
Countdown: 3
Countdown: 2
Countdown: 1
Even count: 3
Target index: 3
```

### Intentional logic error

Now change this loop condition:

```java
for (int i = 1; i <= 5; i++) {
```

To this:

```java
for (int i = 1; i < 5; i++) {
```

Compile and run again:

```bash
javac Loops.java
java Loops
```

The program still compiles, but the sum is wrong:

```text
Sum 1 to 5: 10
Countdown: 3
Countdown: 2
Countdown: 1
Even count: 3
Target index: 3
```

This is an off-by-one error. The loop stops before `i` reaches `5`, so it adds `1 + 2 + 3 + 4` instead of `1 + 2 + 3 + 4 + 5`.

Fix it by changing the condition back to `i <= 5`.

### Common verification failures

| What you might see | What it means | How to fix |
|---|---|---|
| Sum is `10` instead of `15` | The loop stopped one iteration too early | Check whether the condition should use `<` or `<=` |
| Program never stops printing | The loop condition never becomes `false` | Check whether the loop variable changes inside the loop |
| `ArrayIndexOutOfBoundsException` | The loop tried to access an invalid array index | Use `i < array.length`, not `i <= array.length` |
| Target index is `-1` | The target was not found or the comparison never matched | Check the target value and the loop condition |

### Evidence to save for your gate

- terminal transcript showing compilation and execution of `Loops.java`
- or a screenshot of your terminal with the expected output visible
- one note explaining why the intentional off-by-one error compiled but produced the wrong sum

### Gate readiness

You are ready for the Track 1 gate when:

- all self-check questions are answered
- `Loops.java` compiles and produces expected output
- you can explain how the loop variable changes on each iteration
- you understand why the intentional off-by-one error occurred
- you have saved evidence, such as a terminal transcript or screenshot

## Next module

[Module 5 — Methods](./05-methods.md)
