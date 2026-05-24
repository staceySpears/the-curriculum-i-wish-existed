# Spine-by-Track Matrix

This matrix shows how each spine is weighted across tracks.

**P** = Primary. This is a main focus. Gate readiness depends on this evidence.
**S** = Secondary. This shows up and matters, but is not the main readiness focus.
**—** = Not a focus in this track.

Gates may ask for evidence from all active spines because the habits reinforce each other. Primary spines carry the readiness weight: weak primary evidence should block the gate, while weak secondary evidence should usually become revision guidance unless the track gate says otherwise.

---

| Spine | Track 0 | Track 1 | Track 2 | Track 3 | Track 4 | Track 5 | Track 6 | Track 7 | Capstone |
|---|---|---|---|---|---|---|---|---|---|
| Big-O and data structures | — | P | S | S | — | — | S | S | P |
| Discipline of Doubt | S | P | S | P | P | P | S | P | P |
| Debugging | P | S | P | P | S | S | — | P | P |
| Code reading | S | S | P | S | S | S | — | P | P |
| Testing maturity | — | S | S | P | S | P | — | P | P |
| Self-evaluation | S | S | S | S | S | S | P | P | P |
| Technical communication | P | S | S | P | S | S | P | P | P |
| AI collaboration | — | — | — | S | S | S | S | P | P |

---

## Notes by track

### Track 0 — Setup
Debugging and technical communication are primary because the learner's first gate must prove they can use tools, read errors, and communicate what they did. Everything else is not yet in play.

### Track 1 — Java and DSA
Big-O and Discipline of Doubt are primary. The learner must be able to reason about cost and choose data structures intentionally, and must practice edge-case thinking from the start.

### Track 2 — The Bridge
Code reading is primary. This track exists specifically to break the habit of only reading code you wrote yourself. Debugging is co-primary because reading and tracing are not enough without investigation when things break.

### Track 3 — Backend
Testing maturity moves to primary here. The learner is building APIs and must prove claims about behavior. Technical communication is co-primary because contracts (APIs, READMEs, request/response formats) must be legible.

### Track 4 — Frontend Fundamentals
Discipline of Doubt is primary. The learner must practice edge-case thinking applied to UI: empty states, invalid input, missing data, accessibility, and layout failure. AI as scaffolding begins.

### Track 5 — React and Vite
Testing maturity moves to primary. Component behavior must be provable, not just visible.

### Track 6 — Interview Readiness
Self-evaluation and technical communication are co-primary. This track is about legibility: can the learner explain their work, tell a credible story, and judge their own readiness honestly?

### Track 7 — Engineering Practice
Most spines are primary or secondary. The learner is synthesizing everything: debugging real systems, reading unfamiliar code, making tradeoff arguments, writing for maintainability, and using AI professionally.

### Capstone
All spines are in play. The capstone is the proof that the habits are integrated, not just demonstrated in isolation.

---

## AI collaboration stage summary

| Track | Stage | What is allowed |
|---|---|---|
| Tracks 0–2 | No AI | No curriculum AI use. Setup exception with 15-minute documented attempt rule. |
| Track 3 | Explainer | Explain concepts, errors, frameworks. No implementation. |
| Tracks 4–5 | Scaffolding | Generate, suggest, debug. Full ownership required. Flag in PRs. |
| Track 6 | Study partner | Interview prep, story critique, design questions. AI-free reps required too. |
| Track 7 + Capstone | Professional collaborator | Full use. Judgment and defensibility standard rises. |

See `ai-collaboration.md` for per-track restrictions and `AI_POLICY.md` for the full policy.
