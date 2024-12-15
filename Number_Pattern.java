import java.util.Scanner;

class Number_Pattern {
    public static void main(String[] args) {
        int i, j, count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                // System.out.print(i);
                System.out.print(" " + count);
                count++;
            }
            System.out.println();
        }
    }
}
