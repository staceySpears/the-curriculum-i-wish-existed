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

## Verification

Complete both the self-check and the runnable check before moving to Module 03.

### Self-check (reflective)

Answer these in your own words:

- [ ] What is the difference between a primitive type and a reference type?
- [ ] Name all eight primitive types in Java.
- [ ] What happens when you assign a `double` value to an `int` variable without casting?
- [ ] What does `final` mean when applied to a variable?
- [ ] What is the difference between `=` and `==`?

### Runnable check (external)

Create a file called `Variables.java`:

```bash
cat > Variables.java <<'EOF'
public class Variables {
    public static void main(String[] args) {
        int age = 25;
        double price = 19.99;
        boolean isStudent = true;
        String name = "Your Name";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: $" + price);
        System.out.println("Student: " + isStudent);

        int ageInMonths = age * 12;
        System.out.println("Age in months: " + ageInMonths);

        double discountedPrice = price * 0.9;
        System.out.printf("Discounted price: $%.2f%n", discountedPrice);
    }
}
EOF
```

Compile and run:

```bash
javac Variables.java
java Variables
```

Expected output:

```text
Name: Your Name
Age: 25
Price: $19.99
Student: true
Age in months: 300
Discounted price: $17.99
```

The `printf` line formats the discount to two decimal places so the displayed money value is predictable. You do not need to master `printf` yet. For now, notice that the variable still stores a `double`; the print command controls how that `double` appears in the terminal.

### Intentional error

Change this line:

```java
int age = 25;
```

To this:

```java
int age = 25.5;
```

Compile again:

```bash
javac Variables.java
```

You should see an error like this:

```text
Variables.java:3: error: incompatible types: possible lossy conversion from double to int
        int age = 25.5;
                  ^
```

This is Java's type safety at work. A `double` value can store a decimal. An `int` value can only store a whole number. Java does not automatically put a decimal value into an `int` because information could be lost.

Fix it by changing the value back to `25`, changing the variable type to `double`, or using an explicit cast:

```java
int age = (int) 25.5;
```

The cast truncates the value to `25`.

### Common verification failures

| What you might see | What it means | How to fix |
|---|---|---|
| `incompatible types: possible lossy conversion` | You assigned a decimal value to an `int` | Use the correct type or add an explicit cast |
| `cannot find symbol` | A variable name has a typo or has not been declared | Check spelling and declaration order |
| `';' expected` | A statement is missing a semicolon | Add `;` at the end of the statement |
| `variable might not have been initialized` | A variable was declared but not assigned before use | Assign a value before using the variable |

### Evidence to save for your gate

- terminal transcript showing compilation and execution of `Variables.java`
- or a screenshot of your terminal with the expected output visible
- one note about what the intentional error taught you

### Gate readiness

You are ready for the Track 1 gate when:

- all self-check questions are answered
- `Variables.java` compiles and produces expected output
- you understand why the intentional error occurred
- you have saved evidence, such as a terminal transcript or screenshot
- you can explain the difference between `=` and `==` without looking at notes

## Next module

[Module 3 — Conditionals](./03-conditionals.md)
