/*
 * 
You are developing a math learning application that includes a 
feature to help students identify and understand special numbers.

A special number is defined as a positive integer with m digits, 
that equals the sum of its digits, each raised to the power of m.
To determine if a number is special:
Calculate the number of digits m.
Compute the sum of each digit raised to the power of m.
Check if this sum equals the original number.

Explanation:

Number: 153

It has 3 digits (m=3)

Sum of Digits Raised to the Power of m:
=1^3+5^3+3^3
=1+125+27=>153
=153=153

 */
import java.util.Scanner;

class ArmstrongNo {
    public static void main(String[] args) {
        int rev=0,original,rem;
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        original=num;

        while(num>0){
            rem=num%10;
            rev=rev + (rem*rem*rem);
            num/=10;
        }
        System.out.println(rev);
        if(original == rev){
            System.out.println("Special No.");
        }else{
            System.out.println("Not Special No.");
        }
    }
}