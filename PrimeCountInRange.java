import java.util.Scanner;

public class PrimeCountInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range from the user
        System.out.print("Enter the lower bound (greater than 2): ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        // Validate the range
        if (lowerBound <= 2 || lowerBound >= upperBound) {
            System.out.println("Invalid range.");
        } else {
            int primeCount = 0;
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isPrime(i)) {
                    primeCount++;
                }
            }
            System.out.println("Number of prime numbers between " + lowerBound + " and " + upperBound + " is: " + primeCount);
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
