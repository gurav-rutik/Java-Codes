
import java.util.Scanner;

/*
Write a program to Calculate the LCM of 
two given natural numbers.

Test Case 1: 
	Input : 15 
	Input : 25
	Output: 75

Test Case 2: 
	Input : 20
	Input : 30
	Output: 60
*/

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int largest = num1>num2 ? num1 : num2;

        // while(true) {
        //     if(largest%num1 == 0 && largest%num2 == 0) {
        //         System.out.println("LCM of " + num1 + " and " + num2 + " is: " + largest);
        //         break;
        //     }
        //     largest++;
        // }

        for(;;largest++) {
            if(largest%num1 == 0 && largest%num2 == 0) {
                System.out.println("LCM of " + num1 + " and " + num2 + " is: " + largest);
                break;
            }
        }
        sc.close();

    }
}
