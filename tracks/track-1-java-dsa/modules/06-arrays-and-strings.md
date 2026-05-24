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

## Verification

Complete both the self-check and the runnable check before moving to Module 07.

### Self-check (reflective)

Answer these in your own words:

- [ ] What index does a Java array start at?
- [ ] What is the last valid index of an array with length `n`?
- [ ] Why do arrays use `.length` while strings use `.length()`?
- [ ] Why should strings be compared with `.equals()` instead of `==`?
- [ ] What does `ArrayIndexOutOfBoundsException` mean?

### Runnable check (external)

Create a file called `ArraysAndStrings.java`:

```bash
cat > ArraysAndStrings.java <<'EOF'
public class ArraysAndStrings {
    public static void main(String[] args) {
        int[] scores = {90, 85, 88, 92, 79};

        int sum = 0;
        int max = scores[0];

        for (int score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
        }

        System.out.println("Score count: " + scores.length);
        System.out.println("Score sum: " + sum);
        System.out.println("Highest score: " + max);

        String word = "level";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println("Word: " + word);
        System.out.println("Reversed: " + reversed);
        System.out.println("Palindrome: " + word.equals(reversed));

        String language = new String("java");
        System.out.println("String equals: " + language.equals("java"));
    }
}
EOF
```

Compile and run:

```bash
javac ArraysAndStrings.java
java ArraysAndStrings
```

Expected output:

```text
Score count: 5
Score sum: 434
Highest score: 92
Word: level
Reversed: level
Palindrome: true
String equals: true
```

### Intentional logic error

Now change this line:

```java
System.out.println("String equals: " + language.equals("java"));
```

To this:

```java
System.out.println("String equals: " + (language == "java"));
```

Compile and run again:

```bash
javac ArraysAndStrings.java
java ArraysAndStrings
```

The program still compiles, but the string comparison result is wrong:

```text
String equals: false
```

This happens because `==` compares whether two references point to the same object. `.equals()` compares the actual characters inside the strings.

Fix it by changing the comparison back to `.equals()`.

### Common verification failures

| What you might see | What it means | How to fix |
|---|---|---|
| `ArrayIndexOutOfBoundsException` | You used an index before `0` or at/after `array.length` | Check loop bounds and array length |
| String comparison prints `false` unexpectedly | You used `==` instead of `.equals()` | Use `.equals()` for string content comparison |
| Reversed word is missing a letter | The loop started or stopped at the wrong index | Check whether the loop includes index `0` |
| `cannot find symbol: method length` | You used `.length()` on an array or `.length` on a string | Arrays use `.length`; strings use `.length()` |

### Evidence to save for your gate

- terminal transcript showing compilation and execution of `ArraysAndStrings.java`
- or a screenshot of your terminal with the expected output visible
- one note explaining why the intentional string comparison error compiled but produced the wrong result

### Gate readiness

You are ready for the Track 1 gate when:

- all self-check questions are answered
- `ArraysAndStrings.java` compiles and produces expected output
- you can explain valid array index boundaries
- you understand why `==` is wrong for string content comparison
- you have saved evidence, such as a terminal transcript or screenshot

## Next module

[Module 7 — Classes and Objects](./07-classes-and-objects.md)
