/*
Write a program to check whether the entered 
number is prime number or not.

Test Case 1: 
	Input : 7
	Output : true

Test Case 2: 
	Input : 15
	Output : false

*/
import java.util.Scanner;
class PrimeNo {
    public static void main(String[] args) {
        int count = 2;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=2;i<=num/2;i++){
            if(num%i==0){   
                count++;
            }
        }
        if(count==2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
