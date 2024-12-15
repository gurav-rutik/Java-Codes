
import java.util.Scanner;


// Write a Java Program to print count of prime numbers between the given range m &n where m 
// being the lower bound and n being the upper bound.
// case1: 10,20 o/p=4
// case2: 10,50 o/p=11

public class CountPrimeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = countPrimesInRange(m, n);
        System.out.println("Number of prime numbers between " + m + " and " + n + " is: " + count);
    }

    public static int countPrimesInRange(int m, int n) {
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}