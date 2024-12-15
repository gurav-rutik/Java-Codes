
import java.util.Scanner;

/*Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to 
the product of all the elements of nums except nums[i].

Test Case 1:

Input: [1,2,3,4]

Output: [24, 12, 8,6]

Test Case 2:

Input: [2,3,4,5]

Output: [60, 40, 30,24] */

import java.util.Scanner;

// class ArrayProduct {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Create a new array to store the result
//         int result[] = new int[size];

//         for (int i = 0; i < arr.length; i++) {
//             int product = 1; // Temporary variable to store product

//             for (int j = 0; j < arr.length; j++) {
//                 if (i != j) {
//                     product *= arr[j];
//                 }
//             }

//             result[i] = product;
//         }

//         // Print the result array
//         for (int num : result) {
//             System.out.print(num + ",");
//         }

//         sc.close();
//     }
// }

class ArrayProduct {

    public static int[] genArray(int arr[]){
        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int product = 1; // Temporary variable to store product

            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }

            result[i] = product;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = genArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i]+",");

        }

    }
}

/*/*
 * Given an array nums of n integers where n > 1, 
 * return an array output such that output[i] is equal to 
 * the product of all the elements of nums except nums[i].

    Test Case 1: 

	Input: [1, 2, 3, 4] 
Output: [24, 12, 8, 6]


Test Case 2: 

	Input: [2, 3, 4, 5]
Output: [60, 40, 30, 24]


 */

// public class Program6b {
    
//     public static int[] genArray( int[] array ){
//         int[] newArray = new int[array.length] ; 
//         // step1 : find product 
//         boolean zeroFlag = false  ; // no zeros 
//         int product = 1  ; 
//         for( int i = 0 ; i < array.length ; i++ ){
//            if( array[i] != 0 ){
//                 product *= array[i] ; 
//            }
//            else {
//             zeroFlag = true  ; 
//            }
//         }
//         // O(n) 
//         // find elements for newArray
//         if( zeroFlag == false ){
//             for( int i = 0 ; i < array.length ; i++ ){
//                 newArray[i] = product / array[i] ; 
//             }
//         }
//         else {
//             for( int i = 0 ; i < array.length ; i++ ){
//                 if( array[i] == 0 )
//                     newArray[i] = product  ; 
//             }
//         }
//         // O(n)

//         return newArray ; 
//     }

//     public static void main(String[] args) {
//         int[] a = { 0 , 2 ,0 ,4} ; 
//         // e o/p { }
//         int[] res  = genArray(a ) ; 
//         for( int i = 0 ; i < res.length ; i++ ){
//             System.out.print(res[i] + ", ");
//         }
//     }
// } */
