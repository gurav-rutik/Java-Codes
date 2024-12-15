import java.util.Scanner;

class Perfect_No {
    public static void main(String[] args) {
        int num, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        for (i = 1; i < num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is Perfect Number!!");
        } else {
            System.out.println(num + " is not Perfect Number!!");
        }
    }
}
