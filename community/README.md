# Community

The community exists to help learners stay honest, supported, and moving.

This curriculum can be completed alone, with a small team, or in a larger learning community. The community layer is not a replacement for doing the work. It is a support system for asking better questions, giving better feedback, finding accountability, and practicing professional communication.

A good learning community does not remove struggle. It makes struggle less isolating and more useful.

## Purpose

The community should help learners:

- ask clear questions
- get unstuck without being handed the whole answer
- give and receive code review
- find accountability partners
- share project demos
- practice technical communication
- normalize debugging and revision
- protect learners from shame-based or sink-or-swim dynamics

The goal is not to create dependency. The goal is to help learners become more capable.

## Community values

### Be specific

Specific questions get better help.

Weak:

> It does not work.

Better:

> I expected the command to print `Track 0 is running`, but I got `file not found`. I was in this folder, ran this command, and checked that the file exists here.

Specific feedback is also better than vague praise or vague criticism.

Weak:

> This is confusing.

Better:

> I had trouble following where the input is validated. Could you point to that file or add a note in the README?

### Preserve the learner's thinking

Do not immediately give full solutions when a hint would teach more.

Good help should make the learner more capable after the conversation.

Prefer:

- asking what they already tried
- pointing to the relevant file, concept, or error message
- offering one next debugging step
- giving a small example unrelated to the exact assignment
- asking them to explain the fix afterward

Avoid:

- dumping a complete solution
- rewriting the whole project for them
- making them feel foolish for being stuck
- using expertise to dominate the conversation

### Review the work, not the worth of the person

Feedback should be honest and humane.

The community should be able to say that code is incomplete, fragile, unclear, or incorrect without turning that into a judgment of the learner.

Good feedback sounds like:

> This edge case is not handled yet.

> The README needs one more setup step.

> The code works, but I do not think the responsibility belongs in this class.

Not:

> You should already know this.

> This is obvious.

> You are bad at this.

### Make progress visible

Learners should share evidence, not just intentions.

Useful evidence includes:

- a commit
- a failing test
- a fixed bug
- a README draft
- a project demo
- a debugging note
- a gate reflection
- a question with context

Visibility creates accountability and makes it easier for others to help.

## How to ask for help

Before asking for help, gather context.

A good help request includes:

- what you were trying to do
- what you expected to happen
- what actually happened
- the exact error message, if any
- what you already tried
- what file or command seems relevant
- what you think might be happening

Use this template:

```markdown
## What I am trying to do

[Short description]

## What I expected

[Expected behavior]

## What happened instead

[Actual behavior or error]

## What I tried

- [Attempt 1]
- [Attempt 2]

## Relevant context

[File, command, screenshot, test, or link]

## My current guess

[Your hypothesis]
```

The current guess matters. It helps you practice debugging instead of outsourcing the entire investigation.

## How to give help

When helping someone, start by preserving their agency.

Ask:

- What have you tried?
- What did you expect?
- What changed recently?
- What does the error message literally say?
- Can you reproduce it?
- What is the smallest failing case?

Then offer the smallest useful next step.

Good help often looks like:

> Check your current folder first. The error says the file is missing, so we should verify whether the terminal is looking in the folder you think it is.

Or:

> Your loop condition is worth inspecting. Try printing the value of `i` on each iteration and see whether it reaches the stopping point.

The goal is not to be the hero. The goal is to help the learner build the muscle.

## Code review norms

Community code review should follow the same spirit as the team path.

Reviewers should prioritize:

1. correctness
2. clarity
3. tests and edge cases
4. maintainability
5. style and polish

A useful review includes:

- one thing that works well
- one concrete concern
- one question about tradeoffs or assumptions
- one next action if revision is needed

Reviewers should avoid nitpicking style while ignoring behavior.

Learners requesting review should explain what kind of review they want.

Examples:

- "Please review whether this README is enough for someone else to run the project."
- "Please look at the validation logic and edge cases."
- "Please focus on whether my Git history and reflection are gate-ready."

## Accountability groups

Learners may form small accountability groups.

A good accountability group is usually two to four people. Larger groups can work, but they need more structure.

A weekly accountability check-in can be short:

- What did you complete?
- What evidence did you produce?
- What got stuck?
- What will you do next?
- What help or review do you need?

Accountability is not about shame. It is about keeping the work visible.

## Project demos

Project demos help learners practice explaining their work.

A demo does not need to be polished to be useful.

A simple demo should include:

- what the project does
- how to run or use it
- one technical decision
- one bug or challenge
- one thing the learner would improve next

Demos are especially useful before gates and before portfolio work.

## AI use in the community

The community follows `../AI_POLICY.md`.

Do not use AI to bypass another learner's struggle.

If a track restricts AI, community helpers should respect that restriction. In early tracks, help with questions, hints, documentation, and debugging process rather than AI-generated answers.

When AI is allowed, community members should still expect defensibility. A learner should be able to explain AI-assisted work, verify it, and disclose material assistance when required.

## Handling conflict

Conflict should be addressed early and specifically.

When something goes wrong, name the behavior rather than attacking the person.

Use this format:

```text
When [specific behavior] happened, it affected [work or learner impact]. I would like us to try [specific change].
```

Examples:

> When review comments only said "wrong" without explanation, it was hard to revise. Could we include the reason and one suggested next step?

> When full solutions are posted immediately, it makes it harder for people in restricted tracks to practice. Could we use hints first?

If the community has moderators, repeated harmful behavior should be escalated.

## Moderation principles

Moderation should protect learning, safety, and trust.

Moderators should intervene when there is:

- harassment
- personal attacks
- repeated belittling
- plagiarism or solution dumping
- pressure to violate the AI policy
- spam or low-effort disruption
- sharing private information without consent

Moderation should be clear and consistent. The goal is not to create fear. The goal is to make the community safe enough for learners to ask real questions.

## Community anti-patterns

### Solution dumping

Posting complete answers too early can weaken learning.

Use hints, questions, and small examples first.

### Shame-based expertise

Expertise should not be used to make beginners feel small.

If someone is confused, help them find the next step.

### Performative productivity

Posting constant progress without evidence can create pressure without learning.

Share artifacts, not just hustle.

### Silent struggling

Learners sometimes disappear when stuck.

The community should normalize asking for help with context.

### Review avoidance

Learners may avoid review because it feels vulnerable.

The community should make review ordinary, specific, and kind.

## Final standard

A strong community helps learners become more independent, not more dependent.

It makes questions better, feedback clearer, debugging calmer, review safer, and progress more visible.

The best community outcome is not that learners never struggle.

It is that learners know how to struggle productively, ask for help clearly, and keep going with evidence.
