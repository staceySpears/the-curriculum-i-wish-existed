# Module 5 — Methods

## Goal

Write reusable, named blocks of code that take parameters and return values.

## Prerequisites

- Modules 1–4 complete

## Core concepts

### What is a method?

A method is a named block of code that can be called from elsewhere. Methods help you:
- Avoid repeating the same code
- Organize logic into understandable pieces
- Test behavior in isolation

### Method declaration syntax

```java
public static returnType methodName(parameterType parameterName) {
    // method body
    return value;
}
```

| Part | Meaning |
|---|---|
| `public` | Who can call this method (we'll use `public` for now) |
| `static` | Belongs to the class, not an instance (we'll explain later) |
| `returnType` | What type of value this method returns (use `void` for nothing) |
| `methodName` | Name you choose (use verbs, camelCase) |
| `parameters` | Inputs the method receives |
| `return` | Send a value back to the caller |

### Simple examples

```java
// Takes no parameters, returns nothing
public static void sayHello() {
    System.out.println("Hello!");
}

// Takes two ints, returns their sum
public static int add(int a, int b) {
    return a + b;
}

// Takes a String, returns its length
public static int getLength(String text) {
    return text.length();
}
```

### Calling methods

```java
public static void main(String[] args) {
    sayHello();                           // prints "Hello!"

    int result = add(5, 3);               // result = 8
    System.out.println(result);

    int length = getLength("Java");       // length = 4
    System.out.println(length);
}
```

### Parameters vs arguments

- **Parameter:** The variable declared in the method definition
- **Argument:** The actual value passed when calling the method

```java
// a and b are parameters
public static int add(int a, int b) {
    return a + b;
}

// 5 and 3 are arguments
int sum = add(5, 3);
```

### Return types

| Return type | Meaning | Example |
|---|---|---|
| `void` | Returns nothing | `public static void printMessage()` |
| `int` | Returns an integer | `public static int double(int x)` |
| `double` | Returns a decimal | `public static double average(int a, int b)` |
| `boolean` | Returns true/false | `public static boolean isEven(int x)` |
| `String` | Returns text | `public static String greet(String name)` |

### The `return` statement

- Ends the method immediately
- Sends a value back to the caller
- In a `void` method, `return;` (no value) is optional at the end

```java
public static int max(int a, int b) {
    if (a > b) {
        return a;  // exits here if true
    }
    return b;      // exits here otherwise
}

public static void earlyExit(int x) {
    if (x < 0) {
        return;  // exits early, nothing printed
    }
    System.out.println("Positive: " + x);
}
```

### Method overloading

Multiple methods can have the same name if they have different parameters:

```java
public static int multiply(int a, int b) {
    return a * b;
}

public static double multiply(double a, double b) {
    return a * b;
}

public static int multiply(int a, int b, int c) {
    return a * b * c;
}
```

## Common pitfalls

| Pitfall | Why it's wrong | Fix |
|---|---|---|
| Forgetting return type | Java expects a type before method name | Add `void` or appropriate type |
| Missing return statement in non-void method | Compilation error | Ensure all code paths return a value |
| Returning wrong type | Compilation error | Return value must match declared return type |
| Using `static` incorrectly | Will explain in module 7 | For now, keep `static` for methods called from `main` |

## Exercises

### Exercise 1: Basic methods

Write a class `MethodPractice` with these methods:

1. `printStars(int n)` — prints `n` asterisks on one line
2. `square(int x)` — returns `x` squared
3. `isPositive(int x)` — returns `true` if `x > 0`
4. `toUpperCase(String s)` — returns the uppercase version (use built-in `toUpperCase()`)

Then call each from `main` and print results.

### Exercise 2: Temperature converter

Write two methods:

- `celsiusToFahrenheit(double c)` — returns `(c * 9/5) + 32`
- `fahrenheitToCelsius(double f)` — returns `(f - 32) * 5/9`

Test with: 0°C = 32°F, 100°C = 212°F, 32°F = 0°C

### Exercise 3: String utilities

Write these methods:

1. `firstChar(String s)` — returns the first character as a String
2. `lastChar(String s)` — returns the last character as a String
3. `middleChar(String s)` — for odd length strings, returns the middle character; for even length, returns the two middle characters
4. `countVowels(String s)` — returns the number of vowels (a, e, i, o, u) in the string

### Exercise 4: Overloading

Create three overloaded `area` methods:

1. `area(double radius)` — circle area = π × r²
2. `area(double width, double height)` — rectangle area
3. `area(double base, double height, boolean isTriangle)` — triangle area = ½ × base × height

### Exercise 5: Method composition

Write a method `isPrime(int n)` that returns `true` if `n` is prime.

Write another method `printPrimesUpTo(int limit)` that uses `isPrime` to print all primes up to `limit`.

## Debugging practice

Find the bugs in this code:

```java
public class BuggyMethods {
    public static void main(String[] args) {
        int x = multiply(5, 3);
        System.out.println(x);

        String greeting = sayHello("Alice");
        System.out.println(greeting);
    }

    public static multiply(int a, int b) {
        a * b;
    }

    public static void sayHello(String name) {
        return "Hello, " + name;
    }
}
```

## Spine prompts

### Testing maturity

How would you write tests for `isPrime`? What edge cases would you test?

### Discipline of Doubt

What happens if you call `printStars(-5)`? Should your method handle this?

### Technical communication

Write a Javadoc comment (using `/** ... */`) for each method explaining what it does, what parameters it takes, and what it returns.

## Check for understanding

1. What is the difference between a parameter and an argument?
2. What does `void` mean as a return type?
3. Can a method have more than one `return` statement?
4. What is method overloading?
5. Write the signature for a method that takes a `String` and an `int` and returns a `boolean`.

## Next module

[Module 6 — Arrays and Strings](./06-arrays-and-strings.md)
