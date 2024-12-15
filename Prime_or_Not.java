import java.util.Scanner;

class Prime_or_Not {
    public static void main(String[] args) {
        int num, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is Prime No..");
        } else {
            System.out.println(num + " is Composite No..");
        }
    }
}
