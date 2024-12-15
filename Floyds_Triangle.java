
import java.util.Scanner;

class Floyds_Triangle {
    public static void main(String[] args) {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        for (i = 1; i <= rows; i++) {
            for (j = i; j <= rows; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (i == rows || j == 1 || j == i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
