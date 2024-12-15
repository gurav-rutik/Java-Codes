import java.util.Scanner;

class Fibonacci_Series {
    public static void main(String[] args) {
        int i, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the fibonacci series : ");
        int num = sc.nextInt();
        System.out.println("The series are : ");
        System.out.print(a + " " + b);
        for (i = 0; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + b);
        }
    }
}
