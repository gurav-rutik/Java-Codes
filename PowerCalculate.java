//write a program to calculate n raised to power p
import java.util.Scanner;

class PowerCalculate{
	public static void main(String[] args){
		int res = 1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int p = sc.nextInt();
	
		for(int i=1;i<=p;i++){
			res *= num;
		}

		System.out.println(res);
	}
}