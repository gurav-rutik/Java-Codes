import java.util.Scanner;

class Factorial_of_number {
    public static void main(String[] args) {
        int fact = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The Factorial of " + num + " is : " + fact);

    }
}
