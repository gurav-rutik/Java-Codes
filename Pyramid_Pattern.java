import java.util.Scanner;

class Pyramid_Pattern {
    public static void main(String[] args) {
        int rows, i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number of rows : ");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
