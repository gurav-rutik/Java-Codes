
import java.util.Scanner;

/*Question:

Write a program to return the count of odd elements in the given integer array.

Question Description:

Ex: Input1= 2 (Length of the Array)

Input2 = 11(Index 0 Array Element)

Input3 = 15(Index 1 Array Element)

Output: 2
Test Cases

case 1:

Input - 2,10,15

Output - 1

case 2:

Input 3, 10, 20, 30

Output - 0

case 3:

Input - 1,1

Output - 1

case 4:

Input 5, 42, 51, 89, 68, 90

Output - 2 */

class CountOddArray {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            count++;
        }

        int arr[] = new int[count];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        int a = 0;
        for(int i=0;i<size;i++) {
            if(arr[i] % 2!=0) {
                a++;
            }
        }
        System.out.println(a);
    }
}
