# Tracks

Tracks are the main sequence of the curriculum.

Each track teaches a stage of software engineering readiness. The tracks are meant to be completed in order because later tracks depend on the knowledge, habits, and evidence built earlier.

A track is not just a topic folder. Each track contains instruction, practice, project work, spine prompts, and a gate that proves the learner is ready to move forward.

## Track sequence

The intended sequence is:

1. Track 0 — Setup and Mental Models
2. Track 1 — Java Fundamentals + DSA Foundations
3. Track 2 — The Bridge
4. Track 3 — Backend Engineering
5. Track 4 — Frontend Fundamentals
6. Track 5 — Modern Frontend with React and Vite
7. Track 6 — System Design, Behavioral, and Interview Mechanics
8. Track 7 — Engineering Practice and Modern Tooling
9. Capstone — Your Project, Your Terms

The order matters.

Track 0 makes the environment and mental model usable.

Track 1 builds programming fundamentals.

Track 2 repairs fragmentation by teaching integration, code reading, testing, and modification of existing code.

Tracks 3 through 5 build backend and frontend capability.

Track 6 turns project experience into interview readiness.

Track 7 teaches professional workflow and modern engineering practice.

The capstone proves ownership.

## Current status by track

| Track | Status |
|---|---|
| Track 0 | Complete and ready for learners |
| Track 1 | Modules and exercises drafted; runnable verification checks being strengthened |
| Track 2 | Modules and exercises drafted; runnable checks and evidence requirements need testing |
| Track 3 | Structure defined; full module content not yet written |
| Track 4 | Structure defined; full module content not yet written |
| Track 5 | Structure defined; full module content not yet written |
| Track 6 | Structure defined; full module content not yet written |
| Track 7 | Structure defined; full module content not yet written |
| Capstone | Structure defined; checkpoints and project guidance need refinement |

## Standard track structure

Each track should follow the same basic structure.

```text
track-name/
  README.md
  modules/
  exercises/
  project/
  gate.md
```

Some tracks may add extra folders when needed, but the basic contract should stay stable.

## Track README

Each track README should explain:

- what the track is for
- what the learner should know before starting
- what the track teaches
- what common failure mode the track fixes
- how the modules are organized
- what project the learner will build
- what the gate requires
- how the track uses the spines
- how AI is handled in that track

The track README is the learner's map before entering the track.

## Modules

Modules teach the track content in smaller pieces.

A module should include:

- a clear learning goal
- a short explanation
- concrete examples
- practice tasks
- checks for understanding
- spine prompts
- links to relevant exercises or project work

Modules should not assume invisible prerequisites. If a learner needs a concept to complete the task, the module should either teach it or point directly to where it was taught.

## Exercises

Exercises give learners focused practice.

A good exercise should make the target skill visible. It should be small enough to complete without becoming a full project, but meaningful enough that the learner has to think.

Where appropriate, exercises should include tests or verification steps.

Exercises should not only ask learners to write new code. Some should ask learners to read, trace, debug, revise, document, or test existing code.

## Projects

Each track should include a project that integrates the track's skills.

Projects are where isolated concepts become software.

A project should include:

- a clear problem statement
- functional requirements
- technical requirements
- stretch goals if appropriate
- testing or verification expectations
- README expectations
- reflection prompts
- gate alignment

A project is not complete just because it runs once. It should produce evidence that the learner can build, explain, debug, revise, and communicate the work.

## Gates

Each track ends with a gate.

The gate is the readiness check for moving to the next track. It should use the shared gate model in `../gates/README.md` and the template in `../gates/gate-template.md`.

A track gate should answer four questions:

1. Can the learner do the work?
2. Can the learner explain the work?
3. Can the learner debug or revise the work?
4. Can the learner carry the skill into a less familiar context?

If the answer to any of these is no, the learner should revise before moving on.

## Spine prompts

Every track should include the curriculum spines.

The eight core spines are:

- Big-O and data structure choice
- Discipline of Doubt
- Debugging
- Code reading
- Testing maturity
- Self-evaluation
- Technical communication
- AI collaboration

Not every module needs to emphasize every spine equally. But every track should create evidence that the learner is practicing the relevant habits.

See `../spines/README.md`.

## AI policy by track

AI use follows `../AI_POLICY.md`.

The short version is:

- Tracks 0 through 2 — no AI for curriculum work
- Track 3 — AI as explainer
- Tracks 4 and 5 — AI as scaffolding
- Track 6 — AI as study partner
- Track 7 and Capstone — AI as professional collaborator

Track instructions may be stricter than the general policy. If they are stricter, the track instructions win.

## Solo and team use

Tracks are shared by solo learners and team learners.

The technical content does not change. The operating model changes.

Solo learners should use `../paths/solo/` for accountability, self-review, weekly rhythm, and review substitutes.

Team learners should use `../paths/team/` for charters, code review, retrospectives, anti-patterns, and shared ownership.

## Naming conventions

Track folders should use lowercase, hyphenated names.

Suggested names:

```text
track-0-setup/
track-1-java-dsa/
track-2-bridge/
track-3-backend/
track-4-frontend-fundamentals/
track-5-react-vite/
track-6-interview-readiness/
track-7-engineering-practice/
capstone/
```

Module files should also use lowercase, hyphenated names.

Examples:

```text
01-what-is-code.md
02-files-folders-paths.md
03-terminal-basics.md
```

The number keeps the intended order visible.

## Definition of a complete track

A track is complete when the learner has:

- completed the required modules
- completed the required exercises
- completed the track project
- produced project evidence
- completed self-evaluation
- addressed debugging or revision evidence
- satisfied the relevant spine prompts
- passed the track gate

The calendar does not complete the track.

Evidence completes the track.
