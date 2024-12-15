import java.util.Scanner;

class Sum_Of_Digits {
    public static void main(String[] args) {
        int sum = 0, i, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        System.out.println("Sum of Digits = " + sum);
    }
}
