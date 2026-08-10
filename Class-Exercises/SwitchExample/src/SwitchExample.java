
    /**
     * A simple example of switch statement in Java
     * This program checks an integer value and prints its equivalent word
     * Output: Two
     */
    public class SwitchExample {
        public static void main(String[] args) {
            int k = 2;

            // Using switch statement to check the value of k
            switch (k) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                default:
                    System.out.println("None");
            }
        }
    }

