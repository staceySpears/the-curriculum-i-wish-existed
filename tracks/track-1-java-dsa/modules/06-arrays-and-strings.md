# Module 6 — Arrays and Strings

## Goal

Store and manipulate collections of data using arrays and strings.

## Prerequisites

- Module 5 complete

## Core concepts

### Arrays

```java
// Declaration and initialization
int[] numbers = new int[5];
int[] scores = {90, 85, 88, 92, 79};

// Access and modify
numbers[0] = 10;
int first = scores[0];

// Length
int length = scores.length;  // 5
```

### Common array operations

**Find maximum:**

```java
int max = numbers[0];
for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}
```

**Reverse an array:**

```java
for (int i = 0; i < numbers.length / 2; i++) {
    int temp = numbers[i];
    numbers[i] = numbers[numbers.length - 1 - i];
    numbers[numbers.length - 1 - i] = temp;
}
```

### Strings

```java
String name = "Java";

// Common methods
int length = name.length();
char first = name.charAt(0);
String upper = name.toUpperCase();
String lower = name.toLowerCase();
boolean contains = name.contains("av");
String replaced = name.replace("J", "P");
String[] parts = "a,b,c".split(",");
```

### String comparison

**Do not use `==` to compare strings.** Use `.equals()`:

```java
String a = "hello";
String b = "hello";

// Wrong — compares object references, not content
if (a == b) { ... }

// Correct — compares character by character
if (a.equals(b)) { ... }
```

## Common pitfalls

| Pitfall | What happens | Fix |
|---|---|---|
| `array[-1]` or `array[array.length]` | `ArrayIndexOutOfBoundsException` | Check bounds before accessing |
| Comparing strings with `==` | Unpredictable results | Use `.equals()` |
| Modifying array length | Not possible — arrays are fixed size | Use `ArrayList` (Module 8) |
| Off-by-one in loops | Skips first or last element | `i < length`, not `i <= length` |

## Exercises

### Exercise 1: Array statistics

Write methods that take an `int[]` and return:
- the average (as a `double`)
- the maximum value
- the minimum value
- the sum

### Exercise 2: String reversal

Write a method `reverse(String s)` that returns the string reversed without using `StringBuilder` or any built-in reverse method.

### Exercise 3: Palindrome check

Write a method `isPalindrome(String s)` that returns `true` if the string reads the same forwards and backwards. Ignore case. Examples: "racecar" → true, "Hello" → false.

### Exercise 4: Second largest

Write a method that finds the second largest number in an integer array. Consider edge cases: what if the array has fewer than two elements? What if all elements are equal?

### Exercise 5: Count words

Write a method that takes a sentence as a `String` and returns the number of words. Define a word as any sequence of non-space characters.

## Spine prompts

### Big-O and data structures

Finding the maximum in an unsorted array requires looking at every element. What is the time complexity? What would make repeated maximum lookups faster?

### Discipline of Doubt

What happens if you pass an empty array to your statistics methods? What if the array is `null`? Handle those cases.

### Testing maturity

For `isPalindrome`, list the test cases that would give you confidence your method is correct. Include at least one case you might forget.

### Technical communication

Write a method comment for `reverse` explaining what it takes, what it returns, and any assumptions it makes about the input.

## Check for understanding

1. What is the index of the first element in a Java array?
2. What is the index of the last element in an array of length `n`?
3. Why is `String` immutable? What does that mean practically?
4. What is an `ArrayIndexOutOfBoundsException`? How do you prevent it?
5. What is the difference between `array.length` and `string.length()`? (Note the parentheses.)

## Next module

[Module 7 — Classes and Objects](./07-classes-and-objects.md)
