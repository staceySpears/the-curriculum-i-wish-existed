# Module 7 — Classes and Objects

## Goal

Define custom types using classes, create objects, and understand encapsulation.

## Prerequisites

- Module 6 complete

## Core concepts

### What is a class?

A class is a blueprint for creating objects. It defines:
- **Fields** (data) — what the object knows
- **Methods** (behavior) — what the object can do

### What is an object?

An object is an instance of a class. If `Car` is a class, `myCar` is an object.

### Basic class definition

```java
public class Rectangle {
    // Fields (data)
    double width;
    double height;

    // Methods (behavior)
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
```

### Creating and using objects

```java
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.width = 5.0;
        rect.height = 3.0;

        double area = rect.area();           // 15.0
        double perimeter = rect.perimeter(); // 16.0

        System.out.println("Area: " + area);
    }
}
```

### Constructors

A constructor initializes a new object. It has the same name as the class and no return type.

```java
public class Rectangle {
    double width;
    double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }
}

// Usage:
Rectangle rect = new Rectangle(5.0, 3.0);
```

### Default constructor

If you don't write a constructor, Java provides a default one with no parameters. If you write any constructor, the default is removed.

```java
// No constructor — default exists
public class Simple {
    int x;
}
Simple s = new Simple(); // works

// Constructor written — default removed
public class Simple {
    int x;
    public Simple(int value) { x = value; }
}
// Simple s = new Simple(); // ERROR
Simple s = new Simple(10); // works
```

### The `this` keyword

`this` refers to the current object. Use it to distinguish fields from parameters:

```java
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;  // this.name = field; name = parameter
        this.age = age;
    }
}
```

### Encapsulation

Encapsulation hides internal data and exposes controlled access through methods.

```java
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
```

### Getters and setters

| Pattern | Purpose | Example |
|---|---|---|
| Getter | Return a field value | `public double getBalance()` |
| Setter | Update a field with validation | `public void setBalance(double balance)` |
| `private` | Restrict direct access from outside | `private double balance;` |

### Static vs. instance

| Feature | Static | Instance |
|---|---|---|
| Field | `static int count` — shared by all objects | `int id` — each object has its own |
| Method | `public static void utility()` — no `this` | `public void action()` — has `this` |
| Access | `ClassName.method()` | `object.method()` |

```java
public class Counter {
    private static int totalCount = 0;
    private int instanceId;

    public Counter() {
        totalCount++;
        instanceId = totalCount;
    }

    public static int getTotalCount() { return totalCount; }
    public int getInstanceId() { return instanceId; }
}
```

## Modern alternative: `record` classes (Java 16+)

For simple data carriers — classes that exist only to hold values — Java 16 introduced `record`. A record automatically provides the constructor, getters, `equals()`, `hashCode()`, and `toString()`.

**Traditional class (what you just learned):**

```java
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
```

**Same thing as a `record`:**

```java
public record Point(int x, int y) {}
```

**When to use each:**

| Use a regular class when... | Use a `record` when... |
|---|---|
| Fields need to change after construction | The object is immutable (values set once) |
| You need validation logic in setters | It's just a data container |
| A framework requires getters by convention (e.g., Spring) | You want the compiler to generate the boilerplate |

Both patterns are common in the wild. Getters and setters remain standard in many codebases. Records are increasingly idiomatic for new simple value types.

## Common pitfalls

| Pitfall | What happens | Fix |
|---|---|---|
| Using `=` to compare objects | Compares references, not content | Use `.equals()` |
| Forgetting `this.` when field and param share a name | Field stays unset | Use `this.field = param` |
| Making all fields `public` | Caller can set invalid state directly | Use `private` fields with validated setters |
| No-arg constructor removed unintentionally | Code that relied on it fails to compile | Add it back explicitly if needed |

## Exercises

### Exercise 1: Dog

Create a `Dog` class with:
- Fields: `name` (String), `age` (int), `breed` (String)
- Constructor: takes all three
- Methods: `bark()` prints "Woof!", `getInfo()` returns a formatted string
- Getters for each field

Create two dog objects and call their methods.

### Exercise 2: BankAccount

Implement `BankAccount` as shown above, then:
- Add `transfer(BankAccount recipient, double amount)` — fails if balance is insufficient
- Add `toString()` returning a readable string representation

Write tests for every method, including edge cases.

### Exercise 3: Student roster

Create a `Student` class with:
- Fields: `name`, `studentId`, `grades` (`ArrayList<Integer>`)
- Constructor: takes `name` and `studentId`
- Methods: `addGrade(int grade)`, `getAverage()`, `getLetterGrade()`
- `getLetterGrade()`: A (90+), B (80–89), C (70–79), D (60–69), F (<60)

What should `getAverage()` return if no grades have been added yet?

### Exercise 4: Static counter

Create a `Product` class with:
- Static field `nextId` starting at 1000
- Instance field `id` assigned from `nextId` in the constructor
- Static method `getNextId()` that returns what the next assigned ID will be

### Exercise 5: Temperature with validation

Write a `Temperature` class with:
- Private field `celsius`
- Constructor with validation (–273.15 is absolute zero)
- `getCelsius()`, `getFahrenheit()`
- `setCelsius(double c)` with validation
- `setFahrenheit(double f)` that converts and validates

What should happen if someone tries to set a temperature below absolute zero?

## Spine prompts

### Testing maturity

How would you test `BankAccount.transfer()`? What scenarios require separate tests?

### Discipline of Doubt

What happens if someone tries to withdraw a negative amount from `BankAccount`? Deposit a negative amount? Should these throw exceptions or silently do nothing?

### Technical communication

Write Javadoc comments for each method: preconditions (what must be true before calling) and postconditions (what is guaranteed after).

## Check for understanding

1. What is the difference between a class and an object?
2. What does `private` do? Why use it?
3. What is a constructor? When is it called?
4. What is the difference between a static field and an instance field?
5. What does `this` refer to inside an instance method?

## Verification

Complete both the self-check and the runnable check before moving to Module 08.

### Self-check (reflective)

Answer these in your own words:

- [ ] What is the difference between a class and an object?
- [ ] What does a constructor do?
- [ ] Why should fields usually be `private`?
- [ ] What does `this` refer to?
- [ ] What is the difference between an instance method and a static method?

### Runnable check (external)

Create two files: `BankAccount.java` and `ObjectsVerification.java`.

```bash
cat > BankAccount.java <<'EOF'
public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int startingBalance) {
        this.owner = owner;
        if (startingBalance >= 0) {
            this.balance = startingBalance;
        } else {
            this.balance = 0;
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
EOF

cat > ObjectsVerification.java <<'EOF'
public class ObjectsVerification {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ada", 100);

        System.out.println("Owner: " + account.getOwner());
        System.out.println("Starting balance: " + account.getBalance());

        account.deposit(50);
        System.out.println("After deposit: " + account.getBalance());

        boolean firstWithdrawal = account.withdraw(30);
        System.out.println("Withdrew 30: " + firstWithdrawal);
        System.out.println("After withdrawal: " + account.getBalance());

        boolean secondWithdrawal = account.withdraw(500);
        System.out.println("Withdrew 500: " + secondWithdrawal);
        System.out.println("Final balance: " + account.getBalance());
    }
}
EOF
```

Compile and run:

```bash
javac BankAccount.java ObjectsVerification.java
java ObjectsVerification
```

Expected output:

```text
Owner: Ada
Starting balance: 100
After deposit: 150
Withdrew 30: true
After withdrawal: 120
Withdrew 500: false
Final balance: 120
```

### Intentional compiler error

Now add this line after the account is created in `ObjectsVerification.java`:

```java
System.out.println(account.balance);
```

Compile again:

```bash
javac BankAccount.java ObjectsVerification.java
```

You should see an error because `balance` has private access in `BankAccount`.

This is encapsulation at work. Code outside the class cannot directly read or change a private field. It must use public methods such as `getBalance()`, `deposit()`, or `withdraw()`.

Fix it by removing the direct field access and using:

```java
System.out.println(account.getBalance());
```

### Common verification failures

| What you might see | What it means | How to fix |
|---|---|---|
| `balance has private access in BankAccount` | Code outside the class tried to access a private field | Use a public method such as `getBalance()` |
| `constructor BankAccount cannot be applied to given types` | The constructor call does not match the constructor parameters | Check argument count, order, and types |
| Final balance is wrong | Deposit or withdrawal logic changed the state incorrectly | Trace the balance after each method call |
| `cannot find symbol` for `getBalance` | Method name is misspelled or missing | Check method spelling and class file |

### Evidence to save for your gate

- terminal transcript showing compilation and execution of both files
- or a screenshot of your terminal with the expected output visible
- one note explaining why private field access failed

### Gate readiness

You are ready for the Track 1 gate when:

- all self-check questions are answered
- `BankAccount.java` and `ObjectsVerification.java` compile and produce expected output
- you can explain how object state changes after each method call
- you understand why the intentional private-field access failed
- you have saved evidence, such as a terminal transcript or screenshot

## Next module

[Module 8 — Collections](./08-collections.md)
