/*
 * write a java program to find largest digits in the given number
 * input: 2936328
 * output: 9
 */

import java.util.Scanner;

class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        // long largestDigit = 0;
        long largestDigit = -1;
        
        while (num > 0) {
            long digit = num % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            num /= 10;
        }
        
        System.out.println("Largest digit: " + largestDigit);
    }
}
