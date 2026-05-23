# Curriculum

This document describes the full arc of the curriculum: what each track is for, what it teaches, what learner failure mode it is designed to correct, and what the learner must demonstrate before moving on.

This curriculum is meant to be completed in sequence. The order is intentional. Each track removes a class of confusion, fragility, or false confidence that tends to cause problems later when it is left implicit.

Every track has the same core shape. It contains a set of modules, exercises with runnable tests where appropriate, a project, a continuing DSA spine, and a Track Gate that proves readiness for the next stage.

The curriculum supports both solo learners and teams. The technical content is shared. What changes by path is the surrounding feedback structure: review, accountability, collaboration, and reflection.

## How to read this document

If you want the big picture, read the track summaries in order.

If you want the operational details, each track directory contains its own README, modules, exercises, project requirements, and gate criteria.

If you are deciding whether this curriculum is for you, start with the repository `README.md` first. This document is the structural map.

## Design principles

This curriculum is designed around a few explicit principles.

First, it is designed for the learner starting from genuine zero. It does not assume prior exposure and then punish the learner for lacking it.

Second, it is designed to repair fragmented, assignment-shaped learning. Many learners have completed activities, quizzes, or weekly projects without ever being shown how those pieces connect into software systems. This curriculum treats integration as a skill to be taught, not a magical leap the learner is expected to make alone.

Third, it treats engineering as broader than syntax. Frontend, backend, debugging, testing, code reading, behavioral interviewing, collaboration, tooling, and AI use are all part of the job, so they are all part of the curriculum.

Fourth, it is built around externally legible progress. Completion is not based on vibes. Each track ends with a gate that produces inspectable evidence.

## Cross-cutting structures

Several disciplines run through the full curriculum rather than living in only one place.

The **DSA spine** develops algorithmic reasoning continuously instead of saving it for the end. The goal is to prevent the common split where a learner can build tiny apps but freezes in interviews, or grind interview questions but cannot build software coherently.

The **Discipline of Doubt** develops edge-case thinking, failure-mode awareness, and the habit of asking what breaks, what assumptions are being made, and how the code behaves at boundaries.

**Self-evaluation** teaches the learner how to judge their own work honestly, revise it against a rubric, and build the professional habit of improving before someone else forces it.

**AI collaboration** is staged deliberately. Early tracks restrict AI so the learner builds their own mental substrate. Later tracks use AI as an explainer, collaborator, and productivity tool, without allowing it to replace understanding.

**Debugging and code reading** are treated as first-class skills. Learners are expected not only to write code, but to investigate failures, read unfamiliar code, trace execution, and make safe changes inside existing systems.

## Track 0 — Setup and Mental Models

### Purpose

Track 0 exists for the learner starting from genuine zero.

Most programs assume the learner already knows what a terminal is, how files and folders work, what a path means, how to install tools, and how to recover when something breaks. This track assumes none of that.

### What it teaches

Track 0 teaches what code is, what a program is, how software runs, how the file system works, how to use the terminal, how to install and verify tools, how to use an editor, and how to make a first Git-backed submission.

It also introduces debugging as a process rather than a panic response.

### What failure it fixes

This track fixes the failure mode where beginners are treated as behind before they have even been shown the substrate everyone else is using.

### Project

A setup-validation project that requires the learner to install the toolchain, clone a repository, run a program, edit code, run tests, and submit work through Git.

### Gate

To pass Track 0, the learner must demonstrate that they can set up a working environment, navigate files and folders, run commands, make a small code change, run checks, and submit work in a reproducible way.

### Benchmark

A working development environment, a first repository, a successful Git workflow, and a short written explanation of what broke during setup and how it was resolved.

## Track 1 — Java Fundamentals + DSA Foundations

### Purpose

Track 1 builds the first real programming foundation.

Java is used as the starting language because it makes types, structure, and object-oriented design explicit. The point is not to make the learner think Java is the whole job. The point is to use Java as a strong training ground for precise programming.

### What it teaches

This track teaches variables, types, conditionals, loops, methods, arrays, classes, objects, interfaces, packages, exceptions, input and output, unit testing, and the first layer of data structures and algorithms.

The DSA spine begins here with basic complexity thinking, arrays, strings, lists, maps, sets, iteration, search, and the habit of explaining why a data structure fits the problem.

### What failure it fixes

This track fixes the failure mode where learners can imitate syntax but cannot explain state, control flow, data movement, or why their solution works.

### Project

A Java command-line application with tests, input handling, multiple classes, clear separation of responsibility, and at least one meaningful data-structure choice.

### Gate

To pass Track 1, the learner must write tested Java code, explain control flow and state, solve basic DSA problems, debug common failures, and justify simple design choices.

### Benchmark

A tested Java project, a visible commit history, and completion of a defined beginner DSA milestone.

## Track 2 — The Bridge

### Purpose

Track 2 is the anti-fragmentation track.

Many learners complete isolated assignments without ever learning how concepts connect into software. Track 2 turns syntax, classes, tests, files, and data structures into system-level thinking.

### What it teaches

This track teaches multi-file reasoning, reading and modifying existing code, tracing feature flow, understanding contracts between components, working with boundaries, handling errors intentionally, and moving from assignment completion to software ownership.

It also introduces the idea that tests are not just checks. Tests are a way to describe behavior, preserve decisions, catch regressions, and clarify design.

### What failure it fixes

This track fixes the failure mode where a learner can pass bounded exercises but cannot enter a larger codebase, understand it, change it safely, or explain how the pieces fit.

### Project

A legacy-style Java project where the learner must read existing code, identify behavior, add tests, fix defects, implement a feature, and document the change.

### Gate

To pass Track 2, the learner must demonstrate that they can read unfamiliar code, trace behavior across files, add or revise tests, modify existing functionality, and explain the design tradeoffs involved.

### Benchmark

A modified existing codebase with tests, a written walkthrough, and evidence of debugging and revision.

## Track 3 — Backend Engineering

### Purpose

Track 3 moves from local programs to services.

The learner begins building software that accepts requests, persists data, validates input, handles errors, and exposes behavior through APIs.

### What it teaches

This track teaches HTTP, REST, request and response flow, routing, controllers, services, persistence, relational databases, SQL, migrations, validation, authentication basics, authorization basics, integration testing, configuration, logging, and first deployment exposure.

### What failure it fixes

This track fixes the failure mode where learners can write local code but do not understand how applications behave when they meet users, networks, databases, invalid input, and runtime failure.

### Project

A backend API with a database, tested routes, validation, meaningful error handling, authentication or authorization where appropriate, and basic deployment or deployment simulation.

### Gate

To pass Track 3, the learner must build, test, debug, document, and explain a backend service. They must be able to describe request flow, data flow, persistence, failure modes, and the tradeoffs in their API design.

### Benchmark

A working backend service, API documentation, integration tests, database-backed persistence, and either a deployed endpoint or a documented local deployment process.

## Track 4 — Frontend Fundamentals

### Purpose

Track 4 teaches the browser as a platform before introducing modern frontend frameworks.

The learner should understand HTML, CSS, JavaScript, the DOM, events, forms, accessibility, and browser behavior before React abstracts those details.

### What it teaches

This track teaches semantic HTML, CSS layout, responsive design, JavaScript fundamentals in the browser, DOM manipulation, events, forms, validation, fetch, accessibility basics, and debugging in browser developer tools.

### What failure it fixes

This track fixes the failure mode where learners jump directly into a framework and become dependent on patterns they do not understand.

### Project

A browser-based application using plain HTML, CSS, and JavaScript. The project must include meaningful state, user interaction, form handling, accessibility considerations, and API interaction or simulated API interaction.

### Gate

To pass Track 4, the learner must build and debug a nontrivial browser interface, explain how the DOM changes, handle user input safely, and demonstrate basic accessibility and responsive design judgment.

### Benchmark

A deployed or locally runnable frontend project with clear interaction, responsive layout, and documented accessibility checks.

## Track 5 — Modern Frontend with React and Vite

### Purpose

Track 5 introduces modern frontend development after the browser foundation is in place.

The goal is not just to learn React syntax. The goal is to understand component architecture, state, effects, data fetching, client-side routing, build tools, and frontend testing.

### What it teaches

This track teaches Vite, React components, props, state, effects, forms, client-side routing, API integration, frontend architecture, reusable components, testing, performance basics, accessibility in component systems, and deployment.

### What failure it fixes

This track fixes the failure mode where learners can follow React tutorials but cannot design, organize, test, or maintain a real frontend application.

### Project

A React application connected to a backend or public API, with routing, tested components, accessible UI, meaningful state management, and deployment.

### Gate

To pass Track 5, the learner must build, test, deploy, and explain a modern frontend app. They must be able to describe component boundaries, data flow, state decisions, accessibility concerns, and performance tradeoffs.

### Benchmark

A deployed React project with a polished repository, tests, README, and project walkthrough.

## Track 6 — System Design, Behavioral, and Interview Mechanics

### Purpose

Track 6 prepares the learner for serious interview loops without reducing the curriculum to interview cram.

Technical interviews, system design, behavioral interviews, and application materials are treated as skills that can be studied, practiced, and improved.

### What it teaches

This track teaches coding interview patterns, DSA review, system design fundamentals, API and data modeling tradeoffs, scalability basics, reliability basics, behavioral storytelling, STAR stories, resume and GitHub presentation, portfolio curation, mock interview practice, and job-search operations.

### What failure it fixes

This track fixes the failure mode where learners build projects but cannot translate their experience into interview performance, credible stories, or application materials.

### Project

An interview readiness packet: selected portfolio projects, resume bullets, behavioral story bank, system design notes, DSA progress evidence, and mock interview reflections.

### Gate

To pass Track 6, the learner must complete a defined DSA benchmark, explain at least one system design problem, produce a polished resume and GitHub profile, deliver behavioral stories grounded in real project evidence, and complete mock interview practice.

### Benchmark

A portfolio-ready profile, a resume, a STAR story bank, DSA milestone evidence, and mock interview feedback.

## Track 7 — Engineering Practice and Modern Tooling

### Purpose

Track 7 teaches the practices that make someone easier to trust as an engineer.

The learner has built software. Now they learn how working engineers operate across codebases, teams, tools, incidents, documentation, and iteration.

### What it teaches

This track teaches Git workflows, branching strategies, pull requests, code review, CI basics, dependency management, environment configuration, observability basics, logs, metrics, postmortems, technical writing, documentation, security basics, performance basics, open source contribution, and responsible AI-assisted development.

### What failure it fixes

This track fixes the failure mode where learners can build projects in isolation but struggle with the workflows, communication, review habits, and operational practices of real engineering teams.

### Project

An engineering-practice project where the learner improves an existing system: adding CI, documentation, tests, observability, refactoring, security or performance improvements, and a written technical explanation.

### Gate

To pass Track 7, the learner must demonstrate mature workflow: clear commits, pull-request discipline, review response, documentation, operational reasoning, responsible AI use, and evidence-based debugging.

### Benchmark

A polished engineering artifact such as an open source PR, a documented refactor, a CI-enabled project, a technical article, or a production-style improvement to an existing codebase.

## Capstone — Your Project, Your Terms

### Purpose

The capstone is where the learner brings the curriculum together.

It is not a tutorial project. It is a substantial, self-directed software project that demonstrates planning, execution, debugging, testing, deployment, presentation, and reflection.

### What it teaches

The capstone teaches ownership. The learner must define a problem, scope a solution, choose tools, manage tradeoffs, build iteratively, respond to feedback, and produce a credible artifact.

### What failure it fixes

The capstone fixes the failure mode where learners complete curriculum projects but never prove they can choose, shape, and finish a project on their own terms.

### Project

A full-stack or otherwise substantial engineering project with a clear user, real functionality, tests, documentation, deployment, and a polished presentation.

### Gate

To pass the capstone, the learner must build, test, deploy, document, and present a substantial project, defend the tradeoffs they made, and show evidence of revision based on testing, feedback, or real use.

### Benchmark

A deployed project, a polished repository, a project walkthrough, and a portfolio-ready artifact that can anchor both technical and behavioral interview discussion.

## Paths: solo and team

The curriculum can be completed either solo or with a team of two to four learners.

The **solo path** preserves the full curriculum while making reflection, self-review, and external feedback more explicit. It is designed for the learner who does not have a reliable team but still wants rigor.

The **team path** adds explicit support for code review, pairing, retrospectives, conflict resolution, anti-pattern detection, and collaborative accountability. It is not treated as secondary or optional fluff. Teamwork is itself part of engineering practice and deserves structure.

See `paths/solo/` and `paths/team/` for the path-specific operating guides.

## Evaluation and gates

Each track ends with a Track Gate.

A gate is not just proof of completion. It is proof of readiness. A learner passes a gate by producing inspectable evidence: passing tests, a finished project, a benchmark result, a review artifact, a design explanation, a deployment, or another concrete deliverable.

The curriculum uses multiple layers of evaluation: automated checks, self-evaluation, external benchmarks, peer or mentor review where available, and optional industry-facing validation such as open source, technical writing, mock interviews, or real users.

For the full evaluation model, see `EVALUATION.md`.

## AI policy

AI is staged intentionally across the curriculum.

In the early tracks, it is restricted because the learner must first build their own mental substrate. In the middle of the curriculum, it appears as an explainer and guided assistant. In the later tracks and capstone, it becomes a real collaborator to be used with judgment.

The purpose of the AI policy is not prohibition for its own sake. It is to prevent dependency before understanding while still preparing the learner for modern engineering practice.

For the full policy, see `AI_POLICY.md`.

## Recommended progression

The intended order is:

Track 0 → Track 1 → Track 2 → Track 3 → Track 4 → Track 5 → Track 6 → Track 7 → Capstone

That order can be adapted in edge cases, but the default should be respected. The curriculum is designed so that later tracks depend not only on technical knowledge from earlier tracks, but also on habits of debugging, code reading, testing, self-evaluation, and reasoning that need time to mature.

## Start here

If you are new to the repository, return to `README.md` first.

If you are ready to begin, go to `tracks/track-0-setup/`.

If you already know you will be working with others, read `paths/team/happy-path.md` before starting. If you will be working alone, read the solo path guide in `paths/solo/`.
