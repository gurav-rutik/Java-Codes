import java.util.Scanner;

class Decimal_to_Binary {
    public static void main(String[] args) {

        int num, b = 0, base = 1, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal number : ");
        num = sc.nextInt();
        while (num > 0) {
            rem = num % 2;
            b = b + (rem * base);
            num = num / 2;
            base = base * 10;
        }
        System.out.println("Binary number is = " + b);
    }
}
