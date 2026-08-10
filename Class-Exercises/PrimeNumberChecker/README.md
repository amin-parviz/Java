# Prime Number Checker

This is a simple Java program developed as a class assignment to check whether a given number is prime or not.

## How it works
The program uses a for loop to iterate through all numbers from 1 to the target number (num). It checks every number (i) to see if it is a divisor of num using the modulo operator (num % i == 0).
- If it is a divisor, the program prints that number and increments a count variable.
- After the loop, it checks if count == 2.
- If count is exactly 2, it means the number has no divisors other than 1 and itself, so it prints "Prime".
- Otherwise, it prints "Not prime".

## Technology Stack
- Language: Java
- IDE: IntelliJ IDEA (or any Java IDE)

## How to run
1. Clone this repository.
2. Open the project in your preferred Java IDE.
3. Compile and run the PrimeChecker.java file.

## Academic Note
This code focuses on understanding for loops and if-else conditional statements. 
*Note: While this algorithm works perfectly for small numbers, it is not optimized for very large integers.*