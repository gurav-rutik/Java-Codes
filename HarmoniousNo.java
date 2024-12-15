/*
 * You are developing a biology learning application that 
 * introduces students to the concept of balance in numbers.
As part of an interactive quiz feature, you want to create a 
program that determines if a given number exhibits "Harmony."
Concept:
Harmonious Number: A positive integer N is classified as a 
Harmonious Number if the sum of its first and last digits equals 
the sum of its remaining digits.
Non-Harmonious Number: If the sum of the first and last digits 
does not equal the sum of the remaining digits, the number is 
classified as Non-Harmonious.
Example:
For input number 2468:
First digit and Last digit: 2,8
Remaining digits: 4, 6
Sum of first and last digits = 2 + 8 = 10
Sum of remaining digits = 4 + 6 = 10
Since the sum of first and last digits equals the sum of remaining
digits, 2468 is a Harmonious Number.
Test Case 1: 

	Input  : 1235
	Output : Harmony

Test Case 2: 

	Input  : 2468
	Output : Harmony

Test Case 3: 

	Input  : 9474
	Output : Non-Harmony



 */

 import java.util.Scanner;

 class HarmoniousNo {
	 // Method to get the first digit of a number
	 public static int getFirstDigit(int num) {
		 while (num >= 10) {
			 num /= 10;
		 }
		 return num;
	 }
 
	 // Method to get the last digit of a number
	 public static int getLastDigit(int num) {
		 return num % 10;
	 }
 
	 // Method to calculate the sum of the digits excluding the first and last
	 public static int getSumOfRemainingDigits(int num) {
		 int firstDigit = getFirstDigit(num);
		 int lastDigit = getLastDigit(num);
 
		 int sum = 0;
		 num /= 10; // Remove last digit
 
		 while (num >= 10) {
			 sum += num % 10;
			 num /= 10;
		 }
 
		 return sum;
	 }
 
	 // Method to check if a number is harmonious
	 public static boolean isHarmonious(int num) {
		 if (num < 10) {
			 return false; // Single digit numbers cannot be harmonious
		 }
 
		 int firstDigit = getFirstDigit(num);
		 int lastDigit = getLastDigit(num);
		 int sumFirstLast = firstDigit + lastDigit;
		 int sumRemaining = getSumOfRemainingDigits(num);
 
		 return sumFirstLast == sumRemaining;
	 }
 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
 
		 System.out.print("Enter a number: ");
		 int num = sc.nextInt();
 
		 if (isHarmonious(num)) {
			 System.out.println("Harmony");
		 } else {
			 System.out.println("Non-Harmony");
		 }
 
		 sc.close();
	 }
 }
 
