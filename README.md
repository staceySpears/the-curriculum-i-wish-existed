# The Curriculum I Wish Existed

A full-stack software engineering curriculum for people starting from genuine zero — especially the self-taught, the underserved, and anyone failed by “just keep up.”

## What this is

This is the curriculum I wish someone had handed me when I started learning software engineering.

It exists because most curricula are built for the median learner: someone who already has a little prior exposure. Maybe they took a CS class. Maybe they followed a few tutorials. Maybe they built a small project and accidentally absorbed the basics of the terminal, Git, debugging, or how modern tools fit together.

Learners who start from genuine zero are different. They hit invisible prerequisites immediately. They don’t just struggle with new concepts; they struggle with the unstated assumptions underneath them. And when they fall behind, they’re often told to “just keep up,” as if the problem is motivation rather than design.

It isn’t.

The problem is usually that the curriculum assumes too much, names too little, and turns learning curves into cliffs.

This curriculum is designed for the opposite learner: someone starting from zero, working alone or in a small team, who has been failed by a bootcamp, is trying to avoid one, or is still filling in the gaps after finishing one.

It names the gaps I personally hit and treats the missing pieces as first-class: frontend, collaboration, system design, behavioral interviewing, modern tooling, and AI literacy. Data structures and algorithms are not bolted on at the end as interview cram. They are woven through the entire experience from the beginning.

The goal is not to promise a job. No curriculum can do that.

The goal is to make you meaningfully prepared: to build real engineering skill, produce credible portfolio work, and become competitive for serious software engineering interviews.

## Who this is for

This curriculum is for people who have the discipline to learn, but have not been given a structure that actually respects where they are starting.

That includes people who tried a bootcamp and felt behind from week one. It includes people who cannot afford a bootcamp and are teaching themselves. It includes people who finished a bootcamp and still feel like they are patching holes in their foundation. It includes people who reached a competitive technical interview and realized too late that they had been taught syntax, not engineering.

More simply: this is for anyone who has been told to “just keep up” and knew something was wrong with the framing.

## How long it takes

This is a serious curriculum, and serious preparation takes time.

**Full-time, at 30 to 40 hours per week:** about 8 to 10 months.

**Part-time, at 10 to 15 hours per week:** about 15 to 20 months.

See [`TIMELINE.md`](./TIMELINE.md) for module-by-module estimates.

## How it is structured

The curriculum is organized into eight tracks plus a capstone. Track 0 is complete and ready for learners. Tracks 1 through 7 and the Capstone are in active development. The structure and gate criteria are defined; module content is being added incrementally.

Each track includes modules, exercises with verification steps where appropriate, a project, recurring spine prompts, and a Track Gate that proves the learner is ready to move forward.

- **Track 0** — Setup and Mental Models
- **Track 1** — Java Fundamentals + DSA Foundations
- **Track 2** — The Bridge
- **Track 3** — Backend Engineering
- **Track 4** — Frontend Fundamentals
- **Track 5** — Modern Frontend with React and Vite
- **Track 6** — System Design, Behavioral, and Interview Mechanics
- **Track 7** — Engineering Practice and Modern Tooling
- **Capstone** — Your project, your terms

See [`CURRICULUM.md`](./CURRICULUM.md) for the full outline.

## Beta tester guide

This curriculum is under active development. Track 0 is complete and ready for learners. Tracks 1 through 7 and the Capstone have defined architecture and gates, but module content and runnable verification checks are still being strengthened.

### What's ready now

| Component | Status | What you can do |
|---|---|---|
| Track 0 | Complete | Set up your environment, learn terminal and Git basics, and make your first submission |
| Spines | Complete | Read the eight core disciplines: debugging, code reading, testing maturity, self-evaluation, and more |
| Architecture | Complete | Understand how tracks, gates, and evaluation work |
| Solo/team paths | Complete | Choose your learning structure |

### What's in progress

| Component | Status | What to expect |
|---|---|---|
| Track 1 (Java + DSA) | Modules and exercises drafted | Runnable verification checks are being added module by module |
| Track 2 (The Bridge) | Modules and exercises drafted | Runnable checks and learner evidence requirements need more testing |
| Tracks 3 through 7 | Structure defined | READMEs, exercises, projects, and gates exist; full module content is still being built |
| Capstone | Structure defined | README, gate, and spine notes exist; checkpoints and project guidance need refinement |

### How to give feedback

Your experience as a learner will shape what comes next. We want to know:

- Where did you get stuck that the curriculum should have prevented?
- What did you need that was not there?
- What was unclear, missing, or assumed?

Ways to give feedback:

- Open a GitHub issue with the label `feedback`
- Submit a pull request with a fix or addition
- Start a discussion in the community space if one is available

### What we ask of beta testers

- Start with Track 0. Complete it, document your stuck points, and share what helped.
- Be honest. Tell us what did not work. That is more valuable than praise.
- Understand the tradeoff. Tracks 1 through 7 are still being built and tested, so you may hit unfinished sections.

### What we promise beta testers

- You will not be told to "just keep up." If something is missing, that is a curriculum problem, not a learner failure.
- Feedback will be read and used to prioritize what gets built next.
- The standard will stay real, but avoidable confusion will be treated as something to fix.

### Ready to start?

Begin at `tracks/track-0-setup/README.md`. After you complete Track 0, open a GitHub issue with your feedback. That feedback will help prioritize whether Track 1, Track 2, or a support resource gets built next.

First-time beta testers should work through Track 0 solo, then compare notes with others if a community space is available.

## Solo or team — both paths are fully supported

You can work through this curriculum entirely alone, or with a team of two to four learners. Both paths use the same technical content. What changes is the feedback structure.

The **solo path** is designed for learners who need to create accountability, review, and reflection without a formal team.

The **team path** is designed for learners practicing collaboration, code review, pairing, retrospectives, and shared ownership.

- **Solo path** → [`paths/solo/`](./paths/solo/)
- **Team path** → [`paths/team/`](./paths/team/)

If you are on the team path, read [`paths/team/happy-path.md`](./paths/team/happy-path.md) first. It shows what a healthy learning team looks like, so you have a model to aim for.

## How you are evaluated

Evaluation happens across four required layers, plus an optional fifth.

1. **Automated** — tests pass or fail
2. **Self-evaluation** — rubrics you grade yourself against, with the meta-skill explicitly taught
3. **External benchmarks** — LeetCode milestones, deployed apps, commit history
4. **Peer or mentor review** — code review from humans
5. **Industry validation** — optional but recommended: open source PRs, technical writing, mock interviews, or real users

See [`EVALUATION.md`](./EVALUATION.md) for details.

## How AI fits in

AI is a tool working engineers use. It is also an easy way to skip learning and become fragile.

This curriculum stages AI deliberately. In the foundational tracks, it is off-limits because you need to understand the substrate yourself. In the middle of the curriculum, it appears as an explainer. Later, it becomes a peer collaborator for implementation, debugging, and iteration.

The goal is not to avoid AI. The goal is to use it without outsourcing your judgment.

See [`AI_POLICY.md`](./AI_POLICY.md).

## Cross-cutting spines

Eight disciplines run through every track.

**Big-O and “why this data structure”** teaches learners to choose tools by cost, not habit.

**The Discipline of Doubt** teaches edge-case thinking as a skill, not a personality trait some people just happen to have.

**Debugging** teaches learners to investigate failure methodically — from reading error messages in Track 0 to tracing production issues in Track 7.

**Code reading** teaches learners to understand before changing. Real engineering often begins inside code someone else wrote.

**Testing maturity** teaches learners that tests are executable claims about behavior — not just checks, but design tools, regression shields, and confidence for refactoring.

**Self-evaluation** teaches the meta-skill of judging your own work honestly and improving it without waiting for permission.

**Technical communication** teaches learners to make their work legible to other humans — READMEs, commit messages, PR descriptions, walkthroughs, and design notes.

**AI collaboration** teaches when to use AI, when not to, and how to keep your own thinking intact while using it well.

See [`spines/`](./spines/) and the [spine-by-track matrix](./spines/spine-by-track-matrix.md) for how each spine applies across tracks.

## What this curriculum does not promise

It does not promise a job. No curriculum can.

It does not promise that any specific company will hire you.

It does not promise to be fast, easy, or painless.

What it promises instead is better preparation: clearer starting points, fewer invisible prerequisites, stronger fundamentals, and a more honest path from beginner to serious candidate.

## What it does promise

It promises that the gaps the author hit personally are named and addressed.

It promises that concepts get ramps instead of cliffs.

It promises that projects produce both portfolio artifacts and interview stories.

It promises that every track ends with a concrete benchmark you can verify externally.

And it promises that frontend, collaboration, system design, behavioral preparation, and modern tooling are treated as first-class parts of engineering, not afterthoughts.

## Start here

Start with this README.

Then read [`CURRICULUM.md`](./CURRICULUM.md) to understand the full arc.

Choose your path: [`paths/solo/`](./paths/solo/) or [`paths/team/`](./paths/team/).

Then begin Track 0 at [`tracks/track-0-setup/`](./tracks/track-0-setup/).
