
import java.util.Scanner;

/*
Write a program to Calculate the LCM of 
two given natural numbers.
design a method which can accept 2 integers and return its LCM

Test Case 1: 
	Input : 15 
	Input : 25
	Output: 75

Test Case 2: 
	Input : 20
	Input : 30
	Output: 60
*/

import java.util.Scanner;

class LCM_Method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate LCM using the lcm method
        int lcm = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }

    // Method to calculate LCM
    public static int lcm(int num1, int num2) {
        int gcd = gcd(num1, num2);
        return (num1 * num2) / gcd;
    }

    // Method to calculate GCD (Greatest Common Divisor)
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}

