import java.util.Scanner;

class Even_Odd {
    public static void main(String[] args) {

        int num, x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even No");
        } else {
            System.out.println("Odd No");
        }
    }
}
