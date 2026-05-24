# Module 10 — DSA Foundations

## Goal

Understand Big-O notation, analyze algorithm cost, and choose data structures based on what operations a problem requires.

## Prerequisites

- Modules 1–9 complete

## Core concepts

### What is Big-O?

Big-O describes how runtime or memory usage grows as input size grows. It focuses on the rate of growth, not the exact time.

| Notation | Name | What it means | Example |
|---|---|---|---|
| O(1) | Constant | Time doesn't depend on input size | Array access by index |
| O(log n) | Logarithmic | Doubles input → one extra step | Binary search |
| O(n) | Linear | Doubles input → doubles time | Finding max in an array |
| O(n log n) | Linearithmic | Common for efficient sorts | Merge sort |
| O(n²) | Quadratic | Doubles input → quadruples time | Nested loops over same array |
| O(2ⁿ) | Exponential | Each new element → doubles work | Naïve recursive Fibonacci |

### Why it matters

Two solutions can both be correct but have vastly different performance at scale:

```java
// O(n) — scans once
public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) max = arr[i];
    }
    return max;
}

// O(n²) — for each element, scans all others
public static int findMaxSlow(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        boolean isMax = true;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > arr[i]) { isMax = false; break; }
        }
        if (isMax) return arr[i];
    }
    return -1;
}
```

At n = 1,000,000, the first runs in roughly a million steps. The second runs in roughly a trillion.

### Analyzing loops

```java
// O(n) — one loop over n elements
for (int i = 0; i < n; i++) { /* O(1) work */ }

// O(n²) — nested loops, both over n elements
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) { /* O(1) work */ }
}

// O(n) — inner loop is constant, not n
for (int i = 0; i < n; i++) {
    for (int j = 0; j < 10; j++) { /* O(1) work */ }
}

// Sequential operations — keep the largest
doSomethingLinear(n);   // O(n)
doSomethingQuadratic(n); // O(n²)
// Total: O(n²) — drop the smaller term
```

### Data structure complexities

| Data structure | Access | Search | Insert | Delete |
|---|---|---|---|---|
| Array | O(1) | O(n) | O(n) | O(n) |
| `ArrayList` (append) | O(1) | O(n) | O(n) | O(n) |
| `HashMap` | O(1) avg | O(1) avg | O(1) avg | O(1) avg |
| `HashSet` | N/A | O(1) avg | O(1) avg | O(1) avg |
| `TreeMap` | O(log n) | O(log n) | O(log n) | O(log n) |

### Choosing based on what you need

| If you need... | Use |
|---|---|
| Ordered list, fast access by index | `ArrayList` |
| Fast lookup by a unique key | `HashMap` |
| Fast membership testing, no duplicates | `HashSet` |
| Sorted order with fast lookup | `TreeMap` / `TreeSet` |

### Space complexity

Space complexity measures additional memory used relative to input size.

```java
// O(1) space — uses the same memory regardless of input size
public static int sum(int[] arr) {
    int total = 0;
    for (int num : arr) total += num;
    return total;
}

// O(n) space — creates a new array the same size as input
public static int[] copy(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) result[i] = arr[i];
    return result;
}
```

## Exercises

### Exercise 1: Identify the complexity

What is the time complexity of each? Explain why.

1. Finding the minimum in an unsorted array
2. Binary search on a sorted array
3. Checking if a value is in a `HashSet`
4. A loop where the inner loop runs `i` times (outer 0 to n, inner 0 to i)
5. Recursive Fibonacci with no memoization

### Exercise 2: Compare two solutions

Both find duplicates. Which is better for large inputs? Why?

```java
// Approach A
public static boolean hasDuplicatesA(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) return true;
        }
    }
    return false;
}

// Approach B
public static boolean hasDuplicatesB(int[] arr) {
    HashSet<Integer> seen = new HashSet<>();
    for (int num : arr) {
        if (seen.contains(num)) return true;
        seen.add(num);
    }
    return false;
}
```

What tradeoff does Approach B make compared to Approach A?

### Exercise 3: Choose a data structure

For each scenario, choose the best structure and justify it:

1. Store 10,000 student IDs and quickly check if a given ID is enrolled
2. Store quiz scores with duplicates and retrieve the top 10
3. Store configuration settings by name
4. Process customer support tickets in the order they arrive
5. Count how many times each word appears in a document

### Exercise 4: Optimize an O(n²) solution

This works but is slow. Rewrite it to run in O(n) using a `HashMap`:

```java
// O(n²): for each element, scan the rest for a complement
public static int countPairsWithSum(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) count++;
        }
    }
    return count;
}
```

After rewriting, verify that both versions produce identical output for several test inputs.

### Exercise 5: Analyze your own code

Pick a method you wrote in modules 1–9. Write down:
- Its time complexity (and why)
- Its space complexity (and why)
- Whether a different data structure could improve it, and what tradeoff that would involve

## Spine prompts

### Big-O and data structures

For your Exercise 4 solution: what is its time complexity? What is its space complexity? What did you trade to get the speed improvement?

### Discipline of Doubt

The O(n) solution in Exercise 4 uses a `HashMap`. What happens if the input array contains duplicate values? Does the algorithm still count pairs correctly?

### Testing maturity

How would you test that your optimized solution produces the same results as the original for all inputs, including edge cases (empty array, one element, all same values)?

### Self-evaluation

Look back at modules 1–9. Find one place where you made a data structure choice without thinking about cost. What would you choose now, and why?

## Check for understanding

1. What does O(n²) mean in plain English?
2. Why is O(n²) problematic at scale?
3. What is the time complexity of `HashMap.get()`? Why?
4. When would you choose `ArrayList` over `HashSet`?
5. What is the difference between time complexity and space complexity?

## Verification

Complete both the self-check and the runnable check before attempting the Track 1 gate.

### Self-check (reflective)

Answer these in your own words:

- [ ] What does O(1) mean in plain English?
- [ ] What does O(n) mean in plain English?
- [ ] What does O(n²) mean in plain English?
- [ ] What tradeoff does a `HashSet` make when it speeds up duplicate detection?
- [ ] What is the difference between time complexity and space complexity?

### Runnable check (external)

Create a file called `DsaVerification.java`:

```bash
cat > DsaVerification.java <<'EOF'
import java.util.HashSet;
import java.util.Set;

public class DsaVerification {
    public static void main(String[] args) {
        int[] values = {4, 7, 2, 7, 9, 4};

        System.out.println("Max: " + findMax(values));
        System.out.println("Has duplicates: " + hasDuplicates(values));
        System.out.println("Pair count for 11: " + countPairsWithSum(values, 11));
    }

    public static int findMax(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static boolean hasDuplicates(int[] values) {
        Set<Integer> seen = new HashSet<>();
        for (int value : values) {
            if (seen.contains(value)) {
                return true;
            }
            seen.add(value);
        }
        return false;
    }

    public static int countPairsWithSum(int[] values, int target) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] + values[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }
}
EOF
```

Compile and run:

```bash
javac DsaVerification.java
java DsaVerification
```

Expected output:

```text
Max: 9
Has duplicates: true
Pair count for 11: 5
```

### Intentional logic error

Now change the duplicate-checking method so it forgets to add values to the set:

```java
public static boolean hasDuplicates(int[] values) {
    Set<Integer> seen = new HashSet<>();
    for (int value : values) {
        if (seen.contains(value)) {
            return true;
        }
    }
    return false;
}
```

Compile and run again:

```bash
javac DsaVerification.java
java DsaVerification
```

The program still compiles, but the duplicate result is wrong:

```text
Has duplicates: false
```

This happens because the set stays empty. A data structure only helps if the algorithm updates it at the right time.

Fix it by adding `seen.add(value);` back after the `contains` check.

### Common verification failures

| What you might see | What it means | How to fix |
|---|---|---|
| `Has duplicates: false` for duplicate input | Values were never added to the set | Add each new value after checking it |
| Pair count is too high | The nested loop counted each pair twice or counted an item with itself | Start the inner loop at `i + 1` |
| `ArrayIndexOutOfBoundsException` | A loop went past the last valid index | Use `i < values.length` |
| `cannot find symbol: class HashSet` | Missing import | Add `import java.util.HashSet;` |

### Evidence to save for your gate

- terminal transcript showing compilation and execution of `DsaVerification.java`
- or a screenshot of your terminal with the expected output visible
- one note explaining the time complexity of each method
- one note explaining why the intentional duplicate-checking error produced the wrong result

### Gate readiness

You are ready for the Track 1 gate when:

- all self-check questions are answered
- `DsaVerification.java` compiles and produces expected output
- you can explain why `findMax` is O(n)
- you can explain why `hasDuplicates` uses extra memory
- you can explain why `countPairsWithSum` is O(n²)
- you have saved evidence, such as a terminal transcript or screenshot

## What comes next

Track 1 is complete when you pass the Track 1 gate.

See [`../gate.md`](../gate.md) for what you need to demonstrate.

The DSA spine continues through every track. You will return to data structures, complexity, and algorithm analysis in every track that follows — this module is the foundation, not the destination.
