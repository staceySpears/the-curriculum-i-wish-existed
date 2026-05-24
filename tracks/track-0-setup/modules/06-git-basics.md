# Module 6 — Git Basics

## Goal

Understand Git as a tool for tracking changes.

## Core idea

Git records snapshots of a project over time.

A repository is a folder being tracked by Git.

A commit is a saved snapshot with a message explaining what changed.

Git is not only for teams. Solo developers use Git because it creates history, safety, and evidence.

## Basic workflow

A beginner Git workflow looks like this:

1. Check what changed.
2. Stage the files you want to save.
3. Commit the changes with a meaningful message.
4. Check the history.

Do not worry about advanced branching yet.

## Essential Git commands

| Task | Command | Expected output on success |
|---|---|---|
| Initialize a repository | `git init` | `Initialized empty Git repository in ...` |
| Check repository status | `git status` | Shows untracked, modified, staged, or clean files |
| Stage one file | `git add filename.txt` | No output when successful |
| Stage all changes | `git add .` | No output when successful |
| Commit staged changes | `git commit -m "message"` | Shows files changed and lines added or removed |
| View commit history | `git log --oneline` | Shows commits with short hashes |
| View unstaged changes | `git diff` | Shows changed lines before staging |

## Example workflow

```bash
$ git init
Initialized empty Git repository in /Users/yourname/track-0-practice/.git/

$ echo "Hello" > README.md

$ git status
On branch master
Untracked files:
  README.md

$ git add README.md

$ git commit -m "Add README"
[master (root-commit) abc1234] Add README
 1 file changed, 1 insertion(+)
```

## Commit messages

A good commit message says what changed.

Weak:

```text
stuff
```

Better:

```text
Add Track 0 setup notes
```

## Practice

Turn your `track-0-practice` folder into a Git repository if it is not one already.

Then:

1. Check the status.
2. Stage your files.
3. Commit them.
4. Make one small edit.
5. Check the status again.
6. Commit the edit.
7. View the commit history.

## Spine prompts

### Technical communication

What should a future reader understand from your commit message?

### Self-evaluation

Can you explain the difference between a file being changed, staged, and committed?

### Debugging

If Git says there is nothing to commit, what might that mean?
