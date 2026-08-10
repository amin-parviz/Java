public class PrimeChecker {
        public static void main(String[] args) {

            // The number to be checked for primality
            int num = 43;

            // Counter for the total number of divisors
            int count = 0;

            // Loop through all numbers from 1 to num
            for (int i = 1; i <= num; i++) {

                // Check if i is a divisor of num
                if (num % i == 0) {
                    System.out.println(i); // Print the divisor
                    count++;               // Increment the divisor counter
                }
            }

            // Print the total count of divisors found
            System.out.println("count: " + count);

            // A prime number has exactly two divisors: 1 and itself
            if (count == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }