import java.util.Scanner;

class Two_Dim_Array {
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        n = sc.nextInt();
        int array[][] = new int[m][n];
        System.out.println("Enter the array element : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(m + "D array element : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
