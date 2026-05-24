# Module 5 — Running Programs

## Goal

Run a small program and connect code to output.

## Core idea

Running a program means asking a tool to execute instructions.

Different languages use different tools. Some code is compiled first. Some code is interpreted directly. Some code runs in a browser. Some code runs on a server.

In Track 0, the important idea is simpler:

> Code in a file can produce behavior when the right tool runs it.

## The starter program

A tiny starter program is provided in `../starter/hello.js`:

```javascript
console.log("Hello from Track 0!");
console.log("If you can see this, your environment is working.");
```

Your task is to run this program using Node.js.

If you have Node.js installed, run this command from the `tracks/track-0-setup/` folder:

```bash
node starter/hello.js
```

Expected output:

```text
Hello from Track 0!
If you can see this, your environment is working.
```

If you do not have Node.js yet, use one small program in a language or tool available on your computer. The specific language does not matter for this module. The goal is to run some code and connect the file, the command, and the output.

Examples:

- Python: create `hello.py` with `print("Hello from Track 0!")`
- Java: create `Hello.java` with a tiny `main` method that prints `Hello from Track 0!`
- Terminal only: run `echo "Hello from Track 0!"`

## Practice

Run the starter program or your chosen tiny program.

The program should print:

```text
Hello from Track 0!
```

Then change the message and run it again.

Answer:

- What file did you edit?
- What command did you run?
- What output did you expect?
- What output did you see?

## When it fails

If the program does not run, do not start changing random things.

Use the debugging loop:

1. Reproduce the problem.
2. Read the exact error.
3. Check the folder.
4. Check the filename.
5. Check the command.
6. Change one thing at a time.

## Spine prompts

### Debugging

What was the first error or unexpected result you saw?

### Testing maturity

What manual check proves the program ran correctly?

### Technical communication

Explain how code in a file produced output in the terminal.
