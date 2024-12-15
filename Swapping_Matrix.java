import java.util.Scanner;

public class Swapping_Matrix {

    public static void main(String[] args) {
        int m, n, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        m = sc.nextInt();
        System.out.println("Enter the number of rows : ");
        n = sc.nextInt();
        int array[][] = new int[m][n];
        int array1[][] = new int[m][n];
        System.out.println("Enter the value of first matrix : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The first matrix are : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the value of second matrix : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("The second matrix are : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                temp = array[i][j];
                array[i][j] = array1[i][j];
                array1[i][j] = temp;
            }
        }
        System.out.println("After swapping Matrix : ");
        System.out.println("The first matrix are : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The second matrix are : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}