import java.util.Scanner;

class Hollow_Triangle {
    public static void main(String[] args) {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
