import java.util.Scanner;

class Addition_of_Two {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 and num2 : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Addition = " + (num1 + num2));
    }
}
