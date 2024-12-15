/*
 * 1.Write a program to find all the prime numbers between a given range .
Constraints : User needs to enter the range (lower bound and upper bound) 
where lower bound < upper bound and lower bound > 2 . If these conditions 
are not satisfied then program should print Invalid range.
 */

import java.util.Scanner;

public class PrimeRangeFinder {

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
            System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " are:");
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
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
