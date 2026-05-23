// Module 9 Exercise: Testing Basics
//
// This file contains the class you will write tests for.
// Create a separate test file: MathUtilsTest.java
//
// Setup: add JUnit 5 to your project.
// If using Gradle, add to build.gradle:
//   testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'
//   test { useJUnitPlatform() }

public class TestingBasics {

    // MathUtils — the class under test
    // After verifying it works, introduce bugs and verify tests catch them

    public static class MathUtils {

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        // TODO: implement divide
        // Throws IllegalArgumentException if divisor is 0
        public static double divide(double a, double b) {
            // your code here
            return 0;
        }

        // TODO: implement factorial
        // Returns n! for n >= 0
        // Throws IllegalArgumentException for n < 0
        public static long factorial(int n) {
            // your code here
            return 0;
        }

        // TODO: implement isPrime
        // Returns true if n is a prime number
        // Returns false for n <= 1
        public static boolean isPrime(int n) {
            // your code here
            return false;
        }
    }
}

// TODO: Create MathUtilsTest.java with JUnit 5 tests
//
// Write at least two tests for each method:
//   add: normal addition, adding negatives
//   subtract: normal subtraction, result is negative
//   multiply: normal multiplication, multiply by zero
//   divide: normal division, divide by zero (assertThrows)
//   factorial: factorial of 0, factorial of 5, negative input (assertThrows)
//   isPrime: prime number, non-prime, edge cases (0, 1, 2)
//
// Use @BeforeEach if you need a shared MathUtils instance
// Use the AAA pattern: Arrange, Act, Assert
// Give each test a descriptive name:
//   add_returnsSum_whenBothPositive()
//   divide_throwsException_whenDivisorIsZero()
