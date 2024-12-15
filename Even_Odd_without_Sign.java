import java.util.Scanner;

class Even_Odd_without_Sign {

    public static void main(String[] args) {

        int num, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        m = num / 2;
        if (m * 2 == num) {
            System.out.println("Even No");
        } else {
            System.out.println("Odd No");
        }
    }
}
