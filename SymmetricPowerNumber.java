/*
 * Design a Java program that checks if a given number is a "Symmetric Power Number." 
A Symmetric Power Number is defined as a positive integer with an even number of digits that can be divided exactly into two equal parts from the middle. When these two parts are summed and the result is squared, it should equal the original number itself.
Write the Java program to implement this concept. Ensure that the program:
Prompts the user to enter a positive integer.
Determines if the entered number qualifies as a Symmetric Power Number based on the described criteria.
Prints whether the number is a Symmetric Power Number or not.
Example:
Input :2025 
After the split of the number in 2 half and addition the Sum is 45 and Square of it is 2025
Output :"Symmetric Power Number."

Test Case 1: 

	Input  : 2025
	Output : "Symmetric Power Number."

Test Case 2: 

	Input  : 2468
	Output :  "Not-Symmetric Power Number."

Test Case 3: 

	Input  : 13123
	Output : "Invalid Number”



 */
import java.util.Scanner;

public class SymmetricPowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Convert the number to a string to easily work with individual digits
        String numStr = Integer.toString(num);
        int length = numStr.length();

        // Check if the number has an even number of digits
        if (length % 2 != 0) {
            System.out.println("Invalid Number");
            sc.close();
            return;
        }

        // Split the number into two equal parts
        String part1 = "";
        String part2 = "";
        for (int i = 0; i < length / 2; i++) {
            part1 += numStr.charAt(i);
        }
        for (int i = length / 2; i < length; i++) {
            part2 += numStr.charAt(i);
        }

        // Convert the parts back to integers and calculate their sum
        int part1Num = 0;
        for (int i = 0; i < part1.length(); i++) {
            part1Num = part1Num * 10 + (part1.charAt(i) - '0');
        }

        int part2Num = 0;
        for (int i = 0; i < part2.length(); i++) {
            part2Num = part2Num * 10 + (part2.charAt(i) - '0');
        }

        int sum = part1Num + part2Num;

        // Check if the square of the sum equals the original number
        if (sum * sum == num) {
            System.out.println("Symmetric Power Number.");
        } else {
            System.out.println("Not-Symmetric Power Number.");
        }

        sc.close();
    }
}
