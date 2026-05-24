# Module 8 — Collections

## Goal

Use Java's collection framework (`ArrayList`, `HashMap`, `HashSet`) to manage groups of objects.

## Prerequisites

- Module 7 complete

## Core concepts

### Why collections?

Arrays have fixed size. Collections grow and shrink dynamically and provide useful methods.

### `ArrayList<T>`

A resizable, ordered list.

```java
import java.util.ArrayList;
import java.util.List;

List<String> names = new ArrayList<>();

names.add("Alice");
names.add("Bob");
names.add("Charlie");

String first = names.get(0);     // "Alice"
names.set(1, "Bobby");           // replaces "Bob"
names.remove(0);                 // removes "Alice"
names.remove("Bob");             // removes by value

int size = names.size();
boolean hasCharlie = names.contains("Charlie");

// Index-based loop
for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}

// For-each loop
for (String name : names) {
    System.out.println(name);
}
```

> **Interface typing:** Notice the variable is declared as `List<String>`, not `ArrayList<String>`. This is standard modern Java practice — program to the interface, not the implementation. If you later need to swap `ArrayList` for `LinkedList`, only the `new` expression changes, not every line of code that uses the variable.

### Common `ArrayList` methods

| Method | What it does |
|---|---|
| `add(E e)` | Adds to the end |
| `add(int index, E e)` | Inserts at position |
| `get(int index)` | Returns element at index |
| `set(int index, E e)` | Replaces element at index |
| `remove(int index)` | Removes at index, returns it |
| `remove(Object o)` | Removes first occurrence of value |
| `size()` | Returns number of elements |
| `contains(Object o)` | Returns true if present |
| `indexOf(Object o)` | Returns index or -1 |
| `isEmpty()` | Returns true if size is 0 |
| `clear()` | Removes all elements |

### `HashMap<K, V>`

A collection of key-value pairs. Keys are unique.

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> ages = new HashMap<>();

ages.put("Alice", 25);
ages.put("Bob", 30);
ages.put("Charlie", 35);

int aliceAge = ages.get("Alice");          // 25
boolean hasBob = ages.containsKey("Bob");
ages.remove("Charlie");

// Loop through keys
for (String name : ages.keySet()) {
    System.out.println(name + ": " + ages.get(name));
}

// Loop through entries
for (Map.Entry<String, Integer> entry : ages.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### Common `HashMap` methods

| Method | What it does |
|---|---|
| `put(K key, V value)` | Adds or replaces mapping |
| `get(K key)` | Returns value or `null` if key absent |
| `getOrDefault(K key, V def)` | Returns value or default if absent |
| `containsKey(K key)` | Returns true if key exists |
| `containsValue(V value)` | Returns true if value exists |
| `remove(K key)` | Removes mapping |
| `keySet()` | Returns all keys |
| `values()` | Returns all values |
| `entrySet()` | Returns all key-value pairs |
| `size()` | Returns number of mappings |

### `HashSet<T>`

A collection of unique values — no duplicates, no guaranteed order.

```java
import java.util.HashSet;
import java.util.Set;

Set<String> tags = new HashSet<>();

tags.add("java");
tags.add("programming");
tags.add("java");  // ignored — already present

boolean hasJava = tags.contains("java");
tags.remove("programming");

for (String tag : tags) {
    System.out.println(tag);
}
```

### Choosing the right collection

| Need | Use |
|---|---|
| Ordered list, duplicates allowed, access by index | `ArrayList` |
| Lookup by unique key | `HashMap` |
| Unique values, fast membership test | `HashSet` |
| Maintain insertion order | `LinkedHashSet`, `LinkedHashMap` |
| Sorted order | `TreeSet`, `TreeMap` |

### Autoboxing

Java automatically converts between primitives and their wrapper classes when working with collections:

```java
List<Integer> numbers = new ArrayList<>();
numbers.add(5);              // autoboxing: int → Integer
int first = numbers.get(0);  // unboxing: Integer → int
```

Wrapper classes: `Integer`, `Double`, `Boolean`, `Character`, `Long`.

## Common pitfalls

| Pitfall | What happens | Fix |
|---|---|---|
| `map.get(missingKey)` | Returns `null`, then NPE when used | Use `containsKey` or `getOrDefault` first |
| Removing from a list while iterating over it | `ConcurrentModificationException` | Use `Iterator.remove()` or iterate a copy |
| Using `==` to compare `Integer` objects | Fails for values outside –128 to 127 | Use `.equals()` |
| Assuming `HashSet` / `HashMap` are ordered | They are not | Use `LinkedHashSet` if insertion order matters |

## Exercises

### Exercise 1: ArrayList practice

Write a program that:
1. Creates a `List<String>` (using `new ArrayList<>()`) of five names
2. Prints all names with a for-each loop
3. Inserts a name at position 0
4. Removes the element at index 2
5. Prints whether a specific name exists
6. Prints the final list and its size

### Exercise 2: Gradebook with HashMap

Create a `Map<String, Integer>` (using `new HashMap<>()`) of student names to grades.
- Add five students
- Print one student's grade
- Update one grade
- Remove one student
- Print all students and grades
- Calculate and print the average grade

### Exercise 3: Unique word counter

Write a program that:
1. Takes a sentence (hardcoded or from input)
2. Splits it into words with `split(" ")`
3. Uses a `Set<String>` to count unique words
4. Uses a `Map<String, Integer>` to count frequency of each word
5. Prints both results

### Exercise 4: To-do list manager

Create a `TodoList` class backed by an `ArrayList<String>`. Provide:
- `addTask(String task)`
- `removeTask(int index)`
- `getTasks()` — returns a copy of the list
- `markComplete(int index)` — removes the task or marks it with "[DONE]"
- `size()`

### Exercise 5: Phonebook

Create a `Phonebook` class backed by a `HashMap<String, String>`. Provide:
- `addContact(String name, String phone)`
- `getPhone(String name)` — returns `null` if not found
- `removeContact(String name)`
- `listAllContacts()` — returns a formatted string
- `findByPhone(String phone)` — returns the matching name or `null`

## Spine prompts

### Big-O and data structures

What is the time complexity of `ArrayList.get(index)`? Of `HashMap.get(key)`? Of `HashSet.contains(value)`? Why are the HashMap and HashSet answers different from ArrayList?

### Discipline of Doubt

What does `HashMap.get()` return for a key that does not exist? What happens if you try to use that value without checking?

### Testing maturity

Write a test that proves `HashSet` silently ignores duplicate additions. Write a test that proves `ArrayList` allows duplicates.

## Check for understanding

1. How is `ArrayList` different from a plain array?
2. When would you use `HashMap` instead of `ArrayList`?
3. What does autoboxing do? Why is it needed for collections?
4. What does `HashSet` guarantee about its elements?
5. Write a method that takes an `ArrayList<Integer>` and returns the most frequent value.

## Verification

Complete both the self-check and the runnable check before moving to Module 09.

### Self-check (reflective)

Answer these in your own words:

- [ ] When would you choose `ArrayList` instead of an array?
- [ ] When would you choose `HashMap` instead of `ArrayList`?
- [ ] What does `HashSet` guarantee about duplicate values?
- [ ] What does `getOrDefault` help you avoid?
- [ ] Why should you not assume `HashMap` or `HashSet` iteration order?

### Runnable check (external)

Create a file called `CollectionsVerification.java`:

```bash
cat > CollectionsVerification.java <<'EOF'
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsVerification {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ada");
        names.add("Grace");
        names.add("Linus");
        names.add("Grace");

        System.out.println("Names size: " + names.size());
        System.out.println("First name: " + names.get(0));
        System.out.println("Contains Grace: " + names.contains("Grace"));

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Unique names: " + uniqueNames.size());

        Map<String, Integer> counts = new HashMap<>();
        for (String name : names) {
            counts.put(name, counts.getOrDefault(name, 0) + 1);
        }

        System.out.println("Grace count: " + counts.get("Grace"));
        System.out.println("Missing count: " + counts.getOrDefault("Katherine", 0));
        System.out.println("Has Ada: " + counts.containsKey("Ada"));
    }
}
EOF
```

Compile and run:

```bash
javac CollectionsVerification.java
java CollectionsVerification
```

Expected output:

```text
Names size: 4
First name: Ada
Contains Grace: true
Unique names: 3
Grace count: 2
Missing count: 0
Has Ada: true
```

### Intentional logic error

Now change this line:

```java
counts.put(name, counts.getOrDefault(name, 0) + 1);
```

To this:

```java
counts.put(name, 1);
```

Compile and run again:

```bash
javac CollectionsVerification.java
java CollectionsVerification
```

The program still compiles, but the count is wrong:

```text
Grace count: 1
```

This happens because the map value is reset to `1` every time a name appears. The program no longer remembers the previous count.

Fix it by using `getOrDefault(name, 0) + 1`.

### Common verification failures

| What you might see | What it means | How to fix |
|---|---|---|
| `cannot find symbol: class ArrayList` | Missing import | Add the needed `import java.util...` line |
| `NullPointerException` after `map.get(...)` | The key was missing and `get` returned `null` | Use `containsKey` or `getOrDefault` |
| Duplicate value still appears in `ArrayList` | Lists allow duplicates | Use a `Set` when uniqueness matters |
| Output order changes for set or map entries | Hash collections do not guarantee order | Use `LinkedHashSet` or `LinkedHashMap` if order matters |

### Evidence to save for your gate

- terminal transcript showing compilation and execution of `CollectionsVerification.java`
- or a screenshot of your terminal with the expected output visible
- one note explaining why the intentional counting error compiled but produced the wrong result

### Gate readiness

You are ready for the Track 1 gate when:

- all self-check questions are answered
- `CollectionsVerification.java` compiles and produces expected output
- you can explain when to use `ArrayList`, `HashMap`, and `HashSet`
- you understand why the intentional counting error occurred
- you have saved evidence, such as a terminal transcript or screenshot

## Next module

[Module 9 — Testing Basics](./09-testing-basics.md)
