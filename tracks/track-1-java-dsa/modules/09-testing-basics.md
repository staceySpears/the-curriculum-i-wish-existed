# Module 9 — Testing Basics

## Goal

Write unit tests using JUnit to verify code behavior automatically.

## Prerequisites

- Modules 5–8 complete

## Core concepts

### Why test?

Manual testing (running the program and checking output) doesn't scale. When you change code, you'd need to re-test everything. Automated tests:
- Run in milliseconds
- Are repeatable with zero effort
- Catch regressions — breaking things that used to work
- Document expected behavior for future readers

### JUnit basics

JUnit 5 is the standard testing framework for Java.

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldReturnSum() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }
}
```

### Common assertions

| Assertion | What it checks |
|---|---|
| `assertEquals(expected, actual)` | Values are equal |
| `assertNotEquals(unexpected, actual)` | Values are not equal |
| `assertTrue(condition)` | Condition is true |
| `assertFalse(condition)` | Condition is false |
| `assertNull(object)` | Object is null |
| `assertNotNull(object)` | Object is not null |
| `assertThrows(Exception.class, () -> code)` | Code throws the expected exception |

### Test structure: Arrange-Act-Assert

```java
@Test
void withdraw_shouldDecreaseBalance_whenSufficientFunds() {
    // Arrange
    BankAccount account = new BankAccount(100);

    // Act
    boolean success = account.withdraw(30);

    // Assert
    assertTrue(success);
    assertEquals(70, account.getBalance());
}
```

### Testing edge cases

Strong tests include:
- **Happy path** — normal inputs, expected outcomes
- **Edge cases** — zero, empty, boundary values
- **Error cases** — invalid input, null

```java
@Test
void withdraw_shouldReturnFalse_whenInsufficientFunds() {
    BankAccount account = new BankAccount(50);
    boolean success = account.withdraw(100);
    assertFalse(success);
    assertEquals(50, account.getBalance());  // balance unchanged
}

@Test
void withdraw_shouldThrow_whenAmountIsNegative() {
    BankAccount account = new BankAccount(100);
    assertThrows(IllegalArgumentException.class, () -> {
        account.withdraw(-10);
    });
}
```

### Test naming convention

A good test name reads as a sentence: `methodName_condition_expectedResult`.

Examples:
- `isPrime_givenPrime_returnsTrue`
- `withdraw_insufficientFunds_returnsFalse`
- `addItem_nullName_throwsException`

### Test-driven development (TDD)

1. **Red** — Write a failing test for the behavior you want
2. **Green** — Write the minimum code to make it pass
3. **Refactor** — Improve the code while keeping tests green

TDD is a practice, not a rule. It is most valuable when you are unsure of the right design.

### Setting up JUnit in Gradle

In `build.gradle`:

```gradle
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.10.0'
}

test {
    useJUnitPlatform()
}
```

Test files go in `src/test/java/`, mirroring your `src/main/java/` structure.

## Common pitfalls

| Pitfall | Why it's a problem | Fix |
|---|---|---|
| Testing implementation details | Tests break on every refactor | Test behavior — what the method does, not how |
| Only testing happy path | Bugs hide in edge cases | Always add null, empty, and boundary tests |
| One assertion per test (dogma) | Sometimes you need multiple | Use multiple assertions when they test the same behavior |
| Test names that say nothing | `test1()`, `testMethod()` | Name describes condition and expected result |

## Exercises

### Exercise 1: Test a Calculator

Create a `Calculator` class with `add`, `subtract`, `multiply`, `divide`. `divide` throws `ArithmeticException` when dividing by zero.

Write tests for:
- Normal operations with positive numbers
- Operations with negative numbers
- Operations involving zero
- Division by zero (test the exception)

### Exercise 2: Test StringUtils

Create `StringUtils` with `reverse(String s)`, `isPalindrome(String s)`, `countVowels(String s)`.

Write tests for each method. Include: empty string, single character, all the same character, mixed case, `null` if you decide to handle it.

### Exercise 3: BankAccount using TDD

Build `BankAccount` using TDD:
1. Write test for `deposit` → implement → pass
2. Write test for `withdraw` success → implement → pass
3. Write test for `withdraw` with insufficient funds → implement → pass
4. Write test for `withdraw` with negative amount (expect exception) → implement → pass

Do not write code before the test. Keep tests passing at every step.

### Exercise 4: Test a buggy class

Write tests that expose each bug in this class, then fix them:

```java
public class BuggyStats {
    public static int sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i <= numbers.length; i++) {  // bug
            total += numbers[i];
        }
        return total;
    }

    public static double average(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        return sum(numbers) / numbers.length;  // bug
    }

    public static int max(int[] numbers) {
        if (numbers.length == 0) return 0;
        int max = 0;  // bug
        for (int num : numbers) {
            if (num > max) max = num;
        }
        return max;
    }
}
```

Write failing tests first. Then fix one bug at a time and verify the tests pass.

### Exercise 5: Parameterized test

Research JUnit's `@ParameterizedTest` and `@CsvSource`. Write a parameterized test for `isPalindrome` that covers at least six different inputs in a single test method.

## Spine prompts

### Testing maturity

What is the difference between testing behavior and testing implementation? Find a test you wrote that would break if you renamed a private field. Rewrite it to test behavior instead.

### Discipline of Doubt

What edge cases did you miss in your first draft of tests? How did you discover them?

### Debugging

When a test fails, how do you decide whether the bug is in the production code or in the test itself? What do you check first?

## Check for understanding

1. What is the purpose of a unit test?
2. What does Arrange-Act-Assert mean?
3. What is TDD? What are the three steps?
4. Why test edge cases and error cases, not just the happy path?
5. How do you test that a method throws an expected exception?

## Next module

[Module 10 — DSA Foundations](./10-dsa-foundations.md)
