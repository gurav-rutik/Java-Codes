/*
 * Question:

Write a java program to find whether the given integer number is Buzz number or not. Buzz number is a 
number that ends with digit 7 or divisible by 7.

Example: 42 is a Buzz number because it is divisible by 7. 107 is a Buzz number because it ends with 7.

Question Description:

Use System.out.println(boolean);
Test Cases

case 1:

Input - 70

Output - true

case 2:

Input - 127

Output - true

case 3:

Input-898

Output false

case 4:

Input - 78

Output - false
 */

 import java.util.Scanner;

public class BuzzNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isBuzz = isBuzzNumber(number);
        System.out.println(isBuzz);

        scanner.close();
    }

    public static boolean isBuzzNumber(int number) {
        // Check if the number ends with 7 or is divisible by 7
        return (number % 10 == 7) || (number % 7 == 0);
    }
}