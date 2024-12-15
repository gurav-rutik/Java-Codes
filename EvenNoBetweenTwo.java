/*
 * 1: Write a Java Program to print all even numbers between the given range m & n 
 * numbers where m being the lower bound and n being the upper bound
 * case1: 2, 6
 * o/p: 2 4 6
 * 
 * case2:-24,3
 * o/p:
 * 
 */
import java.util.Scanner;

class EvenNoBetweenTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        printEven (m,n);
    }
    
    public static void printEven(int m, int n){
        boolean first = true;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                if(first) {
                    System.out.println(i);
                    first = false;
                }else{
                    System.out.println(""+i);
                }
            }
        }
    }
}