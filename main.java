public class Main {
    public static void main(String[] args) {

        int n = 10; // Change this value to generate a different number of Fibonacci numbers
        int[] sequence = new int[n];

        sequence[0] = 0; // First Fibonacci number
        sequence[1] = 1; // Second Fibonacci number

        /* Initializing the first two numbers in the Fibonacci sequence is necessary
         * because the sequence is defined by the sum of the two preceding numbers. */

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}

/* Output: 
 * Fibonacci Sequence: 
 * 0 1 1 2 3 5 8 13 21 34 */
