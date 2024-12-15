/*
Write a program to find the reverse of a given number 
and check whether the given number is palindrome or not.

Description:

A palindrome is a word, sentence, verse, or even number 
that reads the same backward or forward.

Input : 12321
Reverse of the given number: 12321
The input and reverse number are same so it's called Palindrome

Test Case 1: 
	Input : 8767 
	Output : false

Test Case 2: 
	Input : 985589
	Output : true

Test Case 3: 
	Input : 65298
	Output : false
*/
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        int rev=0,original,rem;
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        original=num;

        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(original == rev);
        // if(original == rev){
        //     System.out.println("Palindrome No.");
        // }else{
        //     System.out.println("Not Palindrome No.");
        // }
    }
}
