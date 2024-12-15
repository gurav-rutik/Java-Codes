import java.util.Scanner;

public class Sorting_Array {

    public static void main(String[] args) {
        int size, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Before Sorting: \n");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("After Sorting: \n");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}