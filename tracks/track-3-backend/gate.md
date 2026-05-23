# Track 3 Gate — Backend

This gate verifies that you are ready to leave Track 3 and begin building frontend systems in Track 4.

The goal is a backend system that is correct, tested, documented, and explainable — not just running.

## Required artifact

Submit your Track 3 REST API project.

It should include:

- a working API with at least three endpoints
- tests that verify the behavior of each endpoint
- explicit error handling and input validation
- a README that documents the API contract
- a self-evaluation note

## Correctness requirements

You must be able to:

- start the server and hit each endpoint
- show passing tests
- demonstrate that invalid input is handled and returns an appropriate response
- show that at least one test covers a failure case

## Explanation requirements

You must explain:

- how a request flows through your system from route to response
- why you structured the API the way you did
- what each test is proving
- what happens when the database is unavailable or returns nothing
- how you would add a new endpoint

## Debugging and revision evidence

Provide one debugging note from the track. Include:

- what you expected
- what the error was (include the actual message if possible)
- how you investigated
- what the cause was
- what you changed

## Spine evidence

### Testing maturity

Show one test for a success case and one for a failure case. Explain what each one proves. What behavior is still untested?

### Technical communication

Show your API README. Can a consumer understand what endpoints exist, what they accept, what they return, and what errors are possible — without asking you?

### Debugging

Describe one HTTP or server error you encountered. What did the log say? What did you check? What was the cause?

### Discipline of Doubt

What happens if a required field is missing from the request body? What happens if the database record does not exist? Does your API handle these explicitly?

### Self-evaluation

What is the weakest part of your API? What would you test or handle differently with more time?

### AI collaboration

Was AI used during Track 3? If so, describe one instance: what did you ask, what did it produce, and how did you verify it before using it?

## Outcome

### Pass

You can build, test, document, and explain a REST API. Your tests are meaningful and your documentation is usable.

### Revise

You are close, but must strengthen missing evidence: untested endpoints, undocumented behavior, unexplained error handling, or absent debugging note.

### Repeat

You should revisit Track 3 if you cannot explain how a request flows through your system, cannot write a test for an endpoint, or cannot document what your API does.
