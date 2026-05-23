# Track 5 Gate — React and Vite

This gate verifies that you are ready to leave Track 5 and move into interview readiness in Track 6.

The goal is a React application where behavior is provable, data flow is explainable, and the code is yours to defend.

## Required artifact

Submit your Track 5 project.

It should include:

- a React application built with Vite
- at least two components with passing tests
- data fetching with loading and error state handling
- a README explaining what the application does and how to run and test it
- a self-evaluation note

## Correctness requirements

You must be able to:

- run the development server and show the application working
- run the tests and show them passing
- demonstrate loading state behavior
- demonstrate error state behavior when the API is unavailable or returns an error

## Explanation requirements

You must explain:

- how props and state differ and when you use each
- how data flows from the API call to the rendered UI
- what a specific hook in your code does and why you used it
- what one of your tests is proving
- how you would add a new feature without breaking existing behavior

## Debugging and revision evidence

Provide one debugging note from the track. Include:

- what you expected the component to render
- what actually rendered or what error appeared
- how you investigated using React dev tools or console output
- what the cause was
- what you changed

## Spine evidence

### Testing maturity

Show two tests: one for a success state and one for an error or empty state. Explain what each proves. What behavior of your application is not yet covered by tests?

### Discipline of Doubt

What happens in your application when the API returns nothing? When it returns an error? When a required prop is missing? Walk through each case.

### Technical communication

Show your README. Can another developer run, test, and understand your application without asking you questions?

### Self-evaluation

What component or behavior do you feel least confident about? What would you test or refactor given more time?

### AI collaboration

Was AI used during Track 5? If so, describe one instance: what did you ask, what did it produce, and how did you verify it line by line before committing?

## Outcome

### Pass

You can build, test, and explain a React application. Your tests are meaningful, your data flow is intentional, and the code is yours to defend.

### Revise

You are close, but must strengthen missing evidence: untested components, unhandled error states, unexplained data flow, or absent debugging note.

### Repeat

You should revisit Track 5 if you cannot explain how React state and props work, cannot write a component test, or cannot trace how data moves from an API call to a rendered element.
