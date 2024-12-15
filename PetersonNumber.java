/*
 * Question:

Write a Java program to determine whether a given integer number is a Peterson number or not. 
A number is said to be a Peterson number if the sum of the factorials of its each digits equals the 
number itself.

Question Description:

Use System.out.println(boolean);

Test Cases

case 1:

Input- 40585

Output - true

case 2:

Input - 145

Output - true

case 3:

Input- 30050

Output - false

case 4:

Input - 2505

Output - false
 */
import java.util.Scanner;

public class PetersonNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPeterson = isPetersonNumber(number);
        System.out.println(isPeterson);

        scanner.close();
    }

    public static boolean isPetersonNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
