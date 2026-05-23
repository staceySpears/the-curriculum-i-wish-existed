# STAR-L Story Template

Use this template to write behavioral stories for interviews. The "L" adds a **Learning** section to the standard STAR format.

## What is STAR-L?

| Letter | Stands for | What to include |
|---|---|---|
| S | Situation | Set the context. What was happening? Who was involved? |
| T | Task | What were you responsible for? What problem needed solving? |
| A | Action | What did you actually do? Be specific about your contribution. |
| R | Result | What happened? Use concrete outcomes when possible. |
| L | Learning | What did you learn? What would you do differently next time? |

The Learning section is what separates a story from a brag. It shows self-awareness, growth, and the ability to reflect honestly — all of which interviewers value.

## Tips

- Keep the Situation brief. Most of the story should be in Action and Result.
- Focus on YOUR actions, not the team's. Say "I" not "we" for your specific contributions.
- Be concrete in Result. "The API response time dropped from 8 seconds to under 200ms" is better than "it got faster."
- Name a real tradeoff or difficulty in Learning. "I learned things go well" is not a useful reflection.
- A strong story takes under three minutes to tell aloud. Practice out loud.

## Example

**Situation:** Our team's inventory API was timing out when users searched for products with long names. The timeout was causing error pages during peak traffic.

**Task:** I was responsible for debugging the performance issue and implementing a fix without breaking existing search behavior.

**Action:** I added logging to measure query time across different input lengths, identified that the SQL query was doing a full table scan on each request, added a database index on the name column, and changed the query to use a bounded search. I also added a regression test before making the change so I could verify behavior was preserved.

**Result:** Search response time dropped from 8 seconds to under 200ms. Timeout errors went to zero during the next peak period. The regression test caught one edge case I had missed in my initial fix.

**Learning:** I learned to measure before optimizing. My first instinct was to blame a network issue, but logging showed the problem was in the database query. Next time, I will add performance instrumentation earlier, before a problem surfaces in production.

---

## Your story

### Situation

[Set the context. 1–2 sentences.]

### Task

[Your specific responsibility. 1 sentence.]

### Action

[What you did. 2–4 sentences. Focus on your contributions specifically.]

### Result

[What happened. Concrete outcomes preferred.]

### Learning

[What you learned and what you would do differently.]
