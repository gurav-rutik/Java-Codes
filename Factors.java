/*
Write a program to find the factors for a given natural numbers.
Test Case 1: 
	Input : 9
	Output : 1,3,9

Test Case 2: 
	Input : 15 
	Output : 1,3,5,15
*/

import java.util.Scanner;

class Factors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        System.out.print(1+",");

        for(int i=2;i<num/2;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
        System.out.print(num);

    }
}
