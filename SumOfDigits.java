/*Write a Java program to Find the sum and product of each 
digit of the given integer number .
Description : 
        Input : 7645
        Output :    
        Sum : 22
        Product  :  840
*/
import java.util.Scanner;

class SumOfDigits {
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
        System.out.println(sum);
        System.out.println(product);
    }
}
