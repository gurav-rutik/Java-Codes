import java.util.Scanner;

class Reverse_No {
    public static void main(String[] args) {

        int num, rev = 0, original, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        original = num;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        System.out.println("Reversed Number is : " + rev);

    }
}
