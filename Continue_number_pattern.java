import java.util.Scanner;

class Continue_number_pattern {
    public static void main(String[] args) {
        int rows, i, j, count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number of rows : ");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
