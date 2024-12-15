import java.util.Scanner;

class Multiplication_Table {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("The Table are : ");
        do {
            System.out.println("" + (num * i));
            i++;
        } while (i <= 10);
    }
}
