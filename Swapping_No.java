import java.util.Scanner;

class Swapping_No {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        b = sc.nextInt();
        System.out.println("Before Swapping : " + a + "" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping : " + a + "" + b);
    }
}
