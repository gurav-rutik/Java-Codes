/*Question:

Write a Java program to determine whether a given integer number is a Tech number. A number is called a 
tech number if the given number has an even number of digits and the number can be divided exactly into 
two parts from the middle. After equally dividing the number, sum up the numbers and find the square of the sum. If we get the number itself as square, the given number is a tech number, else, not a tech number.

Example: number = 2025 <=20+25 = (45)2 2025-2025 Hence 2025 is a Tech number.

Question Description:

Use System.out.println(boolean);

Test Cases

case 2:

Input - 3025

Output - true

case 3:

Input - 123

Output - false

case 4:

Input - 9876

Output false

case 5:

Input 567876

Output - false

case 6:

Input - 120987

Output - false */

import java.util.Scanner;

public class TechNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isTech = isTechNumber(number);
        System.out.println(isTech);

        scanner.close();
    }

    public static boolean isTechNumber(int number) {
        String numberStr = Integer.toString(number);
        int length = numberStr.length();

        // Check if the number has an even number of digits
        if (length % 2 != 0) {
            return false;
        }

        // Divide the number into two equal parts
        int firstPart = Integer.parseInt(numberStr.substring(0, length / 2));
        int secondPart = Integer.parseInt(numberStr.substring(length / 2));

        // Sum the two parts and square the sum
        int sum = firstPart + secondPart;
        int square = sum * sum;

        // Check if the square equals the original number
        return square == number;
    }
}
