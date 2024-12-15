import java.util.Scanner;

class Count_Digits {
    public static void main(String[] args) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Total Digits = " + count);
    }
}
