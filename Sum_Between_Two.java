import java.util.Scanner;

class Sum_Between_Two {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 : ");
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            sum = sum + num1;
            num1++;
        }
        System.out.println("Sum Between Two numbers = " + sum);
    }
}
