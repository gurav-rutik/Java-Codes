import java.util.Scanner;

class Tribonacci_Series {
    public static void main(String[] args) {
        int i, a = 0, b = 1, c = 2, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the tribonacci series : ");
        int num = sc.nextInt();
        System.out.println("The series are : ");
        System.out.println(a + "\n" + b + "\n" + c);
        for (i = 0; i < num; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
            System.out.println(c + " ");
        }
    }
}
