// 3.Write a java program to count the number of factors of a given integer number.
import java.util.Scanner;

class CountFactors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 2;
        System.out.print(1+",");

        for(int i=2;i<num/2;i++){
            if(num%i==0){
                System.out.print(i+",");
                count++;
            }
        }
        System.out.println(num);
        System.out.println(count);

    }
}
