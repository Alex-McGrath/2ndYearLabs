import java.util.Random;

public class q2_22 {
    public static void main(String[] args) {
        int numTrials = 1000000; // Number of trials to run
        int coprimeCount = 0; // Number of times two numbers are coprime

        Random rand = new Random();

        // Run the trials
        for (int i = 0; i < numTrials; i++) {
            // Generate two random numbers
            int a = rand.nextInt();
            int b = rand.nextInt();

            // Check if the numbers are coprime
            if (gcd(a, b) == 1) {
                coprimeCount++;
            }
        }

        // Calculate and print the probability
        double probability = (double) coprimeCount / numTrials;
        System.out.println("Probability: " + probability);
    }

    // Calculates the greatest common divisor of two numbers using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

