# Module 1 — Java Environment and First Program

## Prerequisites

Before starting this module, you should have completed **Track 0** and verified:

- You can open a terminal
- You can navigate to a folder
- You can edit a file with a text editor
- Git is installed and configured (optional for this module, but good to have)

## Goal

By the end of this module, you will:

- Confirm Java is installed on your system
- Understand the two-step compilation and execution cycle
- Write, compile, and run a Java program from the command line
- Make a small change and recompile
- Read a Java compiler error and understand what it means

## The compilation cycle

Java is a compiled language. That means you go through two distinct steps to run your code.

**Step 1 — Compile:** You run the compiler (`javac`) on your `.java` source file. The compiler checks for errors. If there are none, it produces a `.class` file containing **bytecode**.

**Step 2 — Execute:** You run the Java Virtual Machine (`java`) on the `.class` file. The JVM translates bytecode into machine instructions and runs your program.

```
Hello.java (source code)
     ↓
   javac Hello.java
     ↓
Hello.class (bytecode)
     ↓
   java Hello
     ↓
  Output appears
```

This two-step process is different from languages like JavaScript (no explicit compile step) or Python (compiles invisibly at runtime). Java makes the compile step explicit because catching errors early is a design goal of the language.

**What is bytecode?** It is an intermediate representation — not human-readable source code, not machine code. Bytecode runs on the JVM, which acts as a translator between your compiled program and the actual operating system. This is why Java is "write once, run anywhere" — the same `.class` file runs on Windows, Mac, or Linux as long as a JVM exists for that platform.

## Key tools

| Tool | What it does | What it produces |
|---|---|---|
| `javac` | The Java compiler. Reads `.java` files, checks syntax, produces bytecode. | `.class` files |
| `java` | The Java runtime. Starts the JVM and executes bytecode. | Running program |

## Setup verification

Run these commands in your terminal.

### 1. Check if Java is installed

```bash
java --version
```

If Java is installed, you will see output like:

```
openjdk 21.0.1 2023-10-17
OpenJDK Runtime Environment (build 21.0.1+12)
OpenJDK 64-Bit Server VM (build 21.0.1+12, mixed mode, sharing)
```

If you see `command not found` or an error, install Java before proceeding.

**Minimum required version:** Java 17. Java 21 is the current Long-Term Support (LTS) version and recommended.

### 2. Check the compiler

```bash
javac --version
```

You should see a version number matching your `java` version.

### 3. Create your working directory

Create a folder for Track 1 work:

```bash
mkdir -p ~/curriculum-work/track-1
cd ~/curriculum-work/track-1
```

## Your first Java program

### Step 1: Create the source file

Create a file called `Hello.java` in your `track-1` folder.

```bash
touch Hello.java
```

Then open it in your editor.

### Step 2: Write the code

Add this exact code to `Hello.java`:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello from Track 1");
    }
}
```

**Important details to notice:**

- The class name (`Hello`) **must** match the filename (`Hello.java`). Java enforces this. If you name the file `hello.java` (lowercase) but the class is `Hello`, the compiler will error.
- `public static void main(String[] args)` is the entry point. When you run `java Hello`, the JVM looks for this exact method signature and starts there.
- `System.out.println` prints a line of output to the terminal. The `ln` means "line" — it adds a newline after printing.

### Step 3: Compile

```bash
javac Hello.java
```

If nothing prints, the compilation succeeded. Check what happened:

```bash
ls
```

You should now see `Hello.class` alongside `Hello.java`. That `.class` file is the bytecode.

### Step 4: Run

```bash
java Hello
```

Note: you run `java Hello`, not `java Hello.class` or `java Hello.java`. The `java` command expects the **class name**, not the filename.

You should see:

```
Hello from Track 1
```

## Common beginner mistakes

| What you might do | What happens | Why |
|---|---|---|
| `java Hello.java` | `Error: Could not find or load main class Hello.java` | `java` expects a class name, not a filename |
| Filename `hello.java` with class `Hello` | `javac` works but `java Hello` fails | Class names are case-sensitive on most systems |
| Forgot `public` before class | `javac` error about public class | The compiler enforces that public classes match their filename |
| Missing `main` method | `java Hello` errors: `Main method not found` | Every runnable Java program needs `public static void main(String[] args)` |
| Forgot semicolon | `javac` error: `';' expected` | Every statement in Java ends with a semicolon |

## Make a change

Edit `Hello.java` to print something else:

```java
System.out.println("My name is [your name]");
```

Recompile and run:

```bash
javac Hello.java
java Hello
```

You should see your new message. This is the loop you will repeat throughout the track: edit, compile, run.

## Reading compiler errors

When you make a mistake, `javac` will print an error. Read it carefully.

**Example error:**

```
Hello.java:3: error: ';' expected
        System.out.println("Hello")
                                  ^
```

The error tells you:
- **File:** `Hello.java`
- **Line number:** `3`
- **What's wrong:** `';' expected`
- **Where:** The `^` points to where the compiler got confused

The actual problem is usually right before the `^` marker. In this case, the missing semicolon is at the end of line 3.

**Rule for reading errors:** Fix the first error first. Later errors may disappear because they were caused by the first one. Don't try to fix five errors at once.

## Common pitfalls

| Pitfall | What it looks like | What it means |
|---|---|---|
| "Cannot find symbol" | `javac` error with a method or variable name | You spelled something wrong, or used a variable before declaring it |
| "class Hello is public, should be declared in a file named Hello.java" | `javac` error on the class declaration | Your filename and class name don't match |
| "reached end of file while parsing" | `javac` error at the end of the file | A closing brace `}` is missing |
| Program runs but prints nothing | No output appears | `main` ran but the print statement is missing or unreachable |

## Spine prompts

### Discipline of Doubt

What assumptions are you making about which version of Java is installed? How do you verify them? What version does `javac --version` actually show?

### Debugging

If `javac Hello.java` printed an error, what was the first thing you checked? What did the error message say? What was the fix?

### Technical communication

Explain the difference between `javac` and `java` to someone who has never used a compiled language. Use an analogy if it helps. Then explain what bytecode is and why it exists.

## Verification

Complete both the self-check and the runnable check before moving to Module 02.

### Self-check (reflective)

Answer these in your own words. Write them down or explain them to a peer:

- [ ] What is the difference between `javac` and `java`?
- [ ] What is bytecode, and why does Java use it?
- [ ] What happens if your class name does not match your filename?
- [ ] What does `public static void main(String[] args)` mean in plain English?

### Runnable check (external)

Run these commands in your terminal. Copy the output as evidence.

```bash
# 1. Verify Java installation
java --version

# 2. Verify compiler installation
javac --version

# 3. Create the Hello.java file
cat > Hello.java <<'EOF'
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello from Track 1");
    }
}
EOF

# 4. Compile
javac Hello.java

# 5. Verify bytecode was created
ls Hello.class

# 6. Run the program
java Hello

# 7. Modify the message and recompile
# macOS:
sed -i '' 's/Hello from Track 1/Hello from [YOUR NAME]/' Hello.java

# Linux:
# sed -i 's/Hello from Track 1/Hello from [YOUR NAME]/' Hello.java

# Windows:
# Edit Hello.java in your editor and replace the message manually.

javac Hello.java
java Hello
```

Expected output:

- `java --version` shows 17 or higher
- `javac --version` matches
- `ls Hello.class` shows the file exists
- the first `java Hello` prints `Hello from Track 1`
- the second `java Hello` prints your modified message

Evidence to save for your gate:

- terminal transcript showing all seven steps
- or a screenshot of your terminal with the outputs visible

## Common verification failures

| What you might see | What it means | How to fix |
|---|---|---|
| `command not found: java` | Java is not installed | Install JDK 17 or 21 from adoptium.net |
| `java --version` shows version 8 or 11 | Version is too old | Upgrade to JDK 17 or 21 |
| `javac: command not found` | Only the JRE is installed, not the JDK | Install the JDK, not just the JRE |
| `class Hello is public, should be declared in a file named Hello.java` | Filename does not match class name | Rename the file to `Hello.java` or change the class name |
| `Error: Could not find or load main class Hello` | Wrong command or wrong directory | Run `ls` to confirm `Hello.class` exists, then run `java Hello` with no `.class` extension |

## Gate readiness

You are ready for the Track 1 gate when:

- all self-check questions are answered
- all runnable commands produce expected output
- you have saved evidence, such as a terminal transcript or screenshot
- you can explain what each command does without looking at notes

## Next module

[Module 2 — Variables, Types, and Expressions](./02-variables-types-expressions.md)
