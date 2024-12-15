import java.util.Scanner;

class Sum_Without_Loop {
    public static void main(String[] args) {

        int sum = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        sum = num * (num + 1) / 2;
        System.out.println("Sum = " + sum);
    }
}
