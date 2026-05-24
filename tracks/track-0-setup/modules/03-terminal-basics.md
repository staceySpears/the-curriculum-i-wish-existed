# Module 3 — Terminal Basics

## Goal

Use the terminal to navigate folders, inspect files, and run simple commands.

## Core idea

The terminal is a text interface for giving commands to your computer.

It is not magic. It is just another way to interact with files, folders, programs, and tools.

## Essential commands

You should learn the command for each action on your operating system:

- print the current folder
- list files
- change folders
- create a folder
- create a file
- remove a file you intentionally created
- run a program or script

The exact command may differ by operating system, but the mental model is the same.

## Essential commands by system

| Task | macOS/Linux | Windows Command Prompt |
|---|---|---|
| Print the current folder | `pwd` | `cd` |
| List files | `ls` | `dir` |
| Change folders | `cd folder-name` | `cd folder-name` |
| Move up one folder | `cd ..` | `cd ..` |
| Create a folder | `mkdir folder-name` | `mkdir folder-name` |
| Create an empty file | `touch filename.txt` | `type nul > filename.txt` |
| Copy a file | `cp source destination` | `copy source destination` |
| Move or rename a file | `mv source destination` | `move source destination` |
| Remove a file you intentionally created | `rm filename.txt` | `del filename.txt` |
| Remove a folder you intentionally created | `rm -r folder-name` | `rmdir /s folder-name` |

## Expected output examples

On macOS or Linux:

```bash
$ pwd
/Users/yourname/curriculum-work/track-0-practice

$ ls
notes  sandbox

$ cd notes
$ pwd
/Users/yourname/curriculum-work/track-0-practice/notes
```

On Windows Command Prompt:

```bat
> cd
C:\Users\yourname\curriculum-work\track-0-practice

> dir
notes
sandbox

> cd notes
> cd
C:\Users\yourname\curriculum-work\track-0-practice\notes
```

## Terminal safety

Do not paste commands you do not understand.

Do not run destructive commands casually.

Before pressing Enter, ask:

- What folder am I in?
- What file or folder will this affect?
- Do I understand the command well enough to run it?

## Practice

Using the terminal, navigate into your `track-0-practice` folder.

Then do the following:

1. Print your current directory.
2. List the files and folders inside it.
3. Move into the `notes` folder.
4. Confirm `setup-notes.txt` is there.
5. Move back up one folder.

Write down the commands you used.

## Spine prompts

### Discipline of Doubt

What could go wrong if you run a command from the wrong folder?

### Debugging

If the terminal says a command is not recognized, what might that mean?

### Technical communication

Write a short explanation of what the terminal lets you do.
