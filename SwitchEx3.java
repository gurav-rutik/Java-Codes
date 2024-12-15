/*
 * The provided Java program is a simple console-based application that prompts the user to 
 * enter a number between 1 and 7.

The program then uses a switch case statement to determine the corresponding day of the week 
based on the user's input and prints the result.

Day 1: Sunday

Day 2: Monday

Day 3: Tuesday

Day 4: Wednesday

Day 5: Thursday

Day 6: Friday

Day 7: Saturday

Test Case 1:

Input: 2

Output: Monday

Test Case 2:

Input: 6

Output: Friday

Test Case 3:

Input: 9

Output: Invalid Input
 */

import java.util.Scanner;

class SwitchEx3 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        switch(num){
            case 1:System.out.println("Sunday");break;
            case 2:System.out.println("Monday");break;
            case 3:System.out.println("Tuesday");break;
            case 4:System.out.println("Wednesday");break;
            case 5:System.out.println("Thursday");break;
            case 6:System.out.println("Friday");break;
            case 7:System.out.println("Saturday");break;
            default:System.out.println("Invalid Day");break;
        }
    }
}
