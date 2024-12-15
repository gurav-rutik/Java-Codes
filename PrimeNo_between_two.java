import java.util.Scanner;

class PrimeNo_between_two {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 : ");
        int num2 = sc.nextInt();
        System.out.println("The Prime number are : ");

        for (i = num1; i <= num2; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(j + " ");
            }
        }
    }
}
