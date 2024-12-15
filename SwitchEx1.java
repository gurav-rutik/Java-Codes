/*
 * Write a program that takes three inputs from the user and checks how many of these inputs are even. 
 * Depending on the number of even inputs, the program should perform different operations:

1. If only one input is even, the program should print that even number.

2. If two inputs are even, the program should print the sum of the two even numbers.

3. If all three inputs are even, the program should print the product of all three numbers.

4. If no input is even, the program should print 0.

Test Case 1:

Input: 2,4,6

Output: 48

Test Case 2:

Input: 1,3,6

Output: 6

Test Case 3:

Input: 1,4,6

Output: 10

Test Case 4:

Input: 1,3,5

Output:0
 */

import java.util.Scanner;

class SwitchEx1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        if(num1%2==0){
            count++;
        }

        num2 = sc.nextInt();
        count = (num2%2==0)?count+1:count;

        num3 = sc.nextInt();
        count = (num3%2==0)?count+1:count;


        switch(count){

            case 0:
            {
                if(num1%2==0 || num2%2==0 || num3%2==0){
                    System.out.println(count);
                }
            }
            System.out.println(count);break;
            case 1:
            {
                if(num1%2==0)
                    System.out.println(num1);
                if(num2%2==0)
                    System.out.println(num2);
                if(num3%2==0)
                    System.out.println(num3);
            }
            break;

            case 2:
            {
                if(num1%2==0 && num2%2==0){
                    System.out.println(num1+num2);
                }
                if(num1%2==0 && num3%2==0){
                    System.out.println(num1+num3);
                }
                if(num2%2==0 && num3%2==0){
                    System.out.println(num2+num3);
                }
            }break;
            case 3:
            System.out.println(num1*num2*num3);
            break;

            default:System.out.println("Invalid");
        }
    }
}
