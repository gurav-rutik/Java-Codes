import java.util.Scanner;

class Factors_of_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The Factors of " + num + " are : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
