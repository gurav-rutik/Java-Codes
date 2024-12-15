
import java.util.Scanner;

/*/*Question:

Write a program to sum of array elements in the given integer array.

Question Description:

Ex: Input1= 2 (Length of the Array)

Input2 = 11(Index 0 Array Element)

Input3 = 15(Index 1 Array Element)

Output: 26 */
class SumOfArray {
    public static void main(String[] args) {
        int count = 0,sum = 0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            count++;
        }

        int arr[] = new int[count];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<size;i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
