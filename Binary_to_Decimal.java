import java.util.Scanner;

class Binary_to_Decimal {
    public static void main(String[] args) {
        int num, d = 0, base = 1, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number: ");
        num = sc.nextInt();
        while (num > 0) {
            rem = num % 10;
            d = d + (rem * base);
            num /= 10;
            base = base * 2;
        }
        System.out.println("Decimal Number is : " + d);
    }
}
