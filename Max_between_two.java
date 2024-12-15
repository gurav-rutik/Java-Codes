import java.util.Scanner;

class Max_between_two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 : ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("Maximum number is: " + num1);
        } else {
            System.out.println("Maximum number is: " + num2);
        }
    }
}
