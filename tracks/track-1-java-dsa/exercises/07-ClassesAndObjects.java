// Module 7 Exercise: Classes and Objects

class ClassesAndObjects {
    public static void main(String[] args) {
        // TODO: Create two BankAccount objects
        // Account 1: owner "Alice", starting balance 1000.0
        // Account 2: owner "Bob", starting balance 500.0
        // Deposit 200.0 into Alice's account
        // Withdraw 100.0 from Bob's account
        // Print both balances
        // Try to withdraw more than the balance — what happens?

        // TODO: Create three Rectangle objects
        // Rectangle 1: width 4, height 6
        // Rectangle 2: width 3, height 3
        // Rectangle 3: width 10, height 2
        // Print area and perimeter of each
        // Print which rectangle has the largest area

        // TODO: Counter test
        // Create a Counter
        // Increment 5 times
        // Print the count
        // Reset it
        // Verify count is 0
    }
}

// TODO: Write a BankAccount class with:
// Fields: String owner, double balance
// Constructor: takes owner and initial balance
// Methods:
//   deposit(double amount) - adds to balance (ignore if amount <= 0)
//   withdraw(double amount) - subtracts from balance (print "Insufficient funds" if not enough)
//   getBalance() - returns current balance
//   getOwner() - returns owner name
//   toString() - returns "owner: $balance" format

// TODO: Write a Rectangle class with:
// Fields: double width, double height
// Constructor: takes width and height
// Methods:
//   area() - returns width * height
//   perimeter() - returns 2 * (width + height)
//   isSquare() - returns true if width == height
//   toString() - returns "Rectangle(width x height)"

// TODO: Write a Counter class with:
// Field: int count (starts at 0)
// Methods:
//   increment() - adds 1
//   decrement() - subtracts 1 (minimum 0, never goes negative)
//   reset() - sets count back to 0
//   getCount() - returns count
