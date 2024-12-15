/*2.Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the 
missing number from the first N integers.
Note: There are no duplicates in the list.
Examples: 
Input: arr[] = {1, 2, 4, 6, 3, 7, 8} , N = 8
Output: 5 */

import java.util.Scanner;

public class ArrayMissingNo {
    public static int findMissingNumber(int arr[], int N) {
        int totalSum = N * (N + 1) / 2;  // Sum of first N natural numbers
        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num;
        }
        
        return totalSum - arraySum;  // The missing number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        
        int arr[] = new int[N - 1];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N - 1; i++) {
            arr[i] = sc.nextInt();
        }
        
        int missingNumber = findMissingNumber(arr, N);
        System.out.println("The missing number is: " + missingNumber);
    }
}