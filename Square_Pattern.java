import java.util.Scanner;

class Square_Pattern {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
