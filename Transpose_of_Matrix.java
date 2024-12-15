import java.util.Scanner;

class Transpose_of_Matrix {
    public static void main(String[] args) {

        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        m = sc.nextInt();
        System.out.println("Enter the number of rows : ");
        n = sc.nextInt();
        int array[][] = new int[m][n];
        int transe[][] = new int[m][n];
        System.out.println("Enter the array element : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array element are : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose of matrix : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                transe[j][i] = array[i][j];
            }
        }
        System.out.println("The array element are : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(transe[i][j] + " ");
            }
            System.out.println();
        }
    }
}
