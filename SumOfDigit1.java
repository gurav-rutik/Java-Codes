// Write a Java program to check whether the sum of the 
// digits of a given number is equal to the product of the digits 
// of the number.
//        Description : 
//               Input : 1124
//               Output :  true

import java.util.Scanner;

class SumOfDigit1 {
    public static void main(String[] args) {
        int rev=0,original,rem,sum=0,product=1;
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        original=num;

        while(num>0){
            rem=num%10;
            sum+=rem;
            product*=rem;
            num/=10;
        }
        boolean result = sum==product;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(result);
    }
}
