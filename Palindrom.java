import java.util.Scanner;

class Palindrom {
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
        if (original == rev) {
            System.out.println(original + " is Palindrome Number !!");
        } else {
            System.out.println(original + " is not Palindrome Number !!");
        }
    }
}
